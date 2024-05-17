package Grafos;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Grafo<String> grafo = new Grafo<String>();

        // vertice
        grafo.adicionarVertice("McDonalds"); // Paulo
        grafo.adicionarVertice("Burger King"); // Cleuza
        grafo.adicionarVertice("Subway"); // lorenzo
        grafo.adicionarVertice("Girafas"); // Kleber
        grafo.adicionarVertice("Popeyes"); // Claudio

        // aresta vão ser as possibilidades de caminho de um local para o outro (de um
        // vertice pro outro)
        // mc e burger
        grafo.adicionarAresta(2, "McDonalds", "Subway");
        grafo.adicionarAresta(5, "McDonalds", "Burger King");
        grafo.adicionarAresta(2, "Burger King", "Popeyes");
        grafo.adicionarAresta(2, "Burger King", "Girafas");
        grafo.adicionarAresta(3, "Subway", "Girafas");
        grafo.adicionarAresta(2, "Subway", "Burger King");
        grafo.adicionarAresta(2, "Girafas", "Burger King");
        grafo.adicionarAresta(2, "Popeyes", "Subway");
        grafo.adicionarAresta(2, "Popeyes", "McDonalds");

        int opcaoInserida = 0;

        exibirMenu(opcaoInserida);

        do {
            opcaoInserida = input.nextInt();

            grafo.BuscaEmLargura(opcaoInserida);
        } while (opcaoInserida < 4 || opcaoInserida > 1);

    }

    public static void exibirMenu(int opcaoInserida) {
        System.out.println("--TOTEM PRAÇA DE ALIMENTAÇÃO--");
        System.out.println("Onde você está no momento?: ");
        System.out.println("1- McDonalds");
        System.out.println("2- Burger King");
        System.out.println("3- Subway");
        System.out.println("4- Popeyes");
        System.out.println("5- Girafas");
    }
}
