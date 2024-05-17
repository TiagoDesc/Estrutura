package Grafos;

public class Aresta<TIPO> {

    private int peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;

    public Aresta(int peso, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getPeso() {
        return peso;
    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public Vertice<TIPO> getFim() {
        return fim;
    }
}
