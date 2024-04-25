package Conjunto;

import java.util.LinkedList;
import java.util.List;

public class Conjunto {

    private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();

    public Conjunto() {
        for (int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>());
        }
    }

    public void adiciona(String palavra) {
        if (!contem(palavra)) {
            int indice = calculaIndiceTabela(palavra);
            List<String> lista = tabela.get(indice);
            lista.add(palavra);
        }
    }

    private boolean contem(String palavra) {

        throw new UnsupportedOperationException("Unimplemented method 'contem'");
    }

    private int calculaIndiceTabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }

}
