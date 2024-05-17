package Grafos;

import java.util.ArrayList;

public class Vertice<TIPO> {

    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestaEntrada;
    private ArrayList<Aresta<TIPO>> arestaSaida;

    public Vertice(TIPO dado) {
        this.dado = dado;
        this.arestaEntrada = new ArrayList<>();
        this.arestaSaida = new ArrayList<>();
    }

    public TIPO getDado() {
        return dado;
    }

    public ArrayList<Aresta<TIPO>> getArestaEntrada() {
        return arestaEntrada;
    }

    public ArrayList<Aresta<TIPO>> getArestaSaida() {
        return arestaSaida;
    }

    public void adicionarArestaEntrada(Aresta<TIPO> aresta) {
        this.arestaEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Aresta<TIPO> aresta) {
        this.arestaSaida.add(aresta);
    }

}
