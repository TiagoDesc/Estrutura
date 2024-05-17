package Grafos;

import java.util.ArrayList;
import java.util.Scanner;

public class Grafo<TIPO> { // classe do tipo generico

    private ArrayList<Vertice<TIPO>> vertices; // lista vertices para armazenar informação
    private ArrayList<Aresta<TIPO>> arestas; // lista arestas para armazenar informação
    private Scanner input; // Scanner para entrada do usuário

    // Construtor que inicializa as listas de vértices e arestas
    public Grafo() { // construtor
        this.vertices = new ArrayList<Vertice<TIPO>>(); // cria uma nova lista de vertice
        this.arestas = new ArrayList<Aresta<TIPO>>(); // cria uma nova lista de Aresta
        this.input = new Scanner(System.in); // inicializa o Scanner
    }

    // Método para adicionar um novo vértice ao grafo
    public void adicionarVertice(TIPO dado) { //
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }

    // Método para adicionar uma nova aresta ao grafo, especificando peso, vértice
    // de início e vértice de fim
    public void adicionarAresta(int peso, TIPO dadoInicio, TIPO dadoFim) {
        Vertice<TIPO> saida = this.getVertice(dadoInicio);
        Vertice<TIPO> entrada = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, saida, entrada);
        saida.adicionarArestaSaida(aresta);
        entrada.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }

    // Método para obter um vértice com base nos seus dados
    public Vertice<TIPO> getVertice(TIPO dado) {
        for (Vertice<TIPO> vertice : vertices) {
            if (vertice.getDado().equals(dado)) {
                return vertice;
            }
        }
        return null; // Retornar null se o vértice não for encontrado
    }

    // Método para realizar a busca em largura a partir de um vértice específico
    public void BuscaEmLargura(int opcaoInserida) {
        Vertice<TIPO> atual = this.vertices.get(opcaoInserida - 1);
        System.out.println("Você está no " + atual.getDado());

        int opcaoDestino = 1; // Manter a identificação original das opções

        do {
            System.out.println("Você pode ir para:");

            for (Aresta<TIPO> aresta : atual.getArestaSaida()) {
                Vertice<TIPO> proximo = aresta.getFim();
                System.out.println(opcaoDestino + "- " + proximo.getDado() + " (Peso: " + aresta.getPeso() + ")");
                opcaoDestino++;
            }

            int opcaoEscolhida;
            do {
                System.out.print("Digite sua opção: ");
                opcaoEscolhida = input.nextInt();
                if (opcaoEscolhida < 1 || opcaoEscolhida > opcaoDestino - 1) {
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } while (opcaoEscolhida < 1 || opcaoEscolhida > opcaoDestino - 1);

            Vertice<TIPO> proximoVertice = atual.getArestaSaida().get(opcaoEscolhida - 1).getFim();
            System.out.println("Você está no " + proximoVertice.getDado());

            atual = proximoVertice; // Atualiza o vértice atual para o próximo
            opcaoDestino = 1; // Reinicia o contador de opções para o novo vértice atual
        } while (true); // Loop infinito para continuar mostrando opções até que o usuário decida sair
    }

}
