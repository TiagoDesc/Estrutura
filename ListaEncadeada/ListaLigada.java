package ListaEncadeada;

public class ListaLigada {

    private Celula primeira = null;
    private Celula ultimo = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;

        if (this.totalDeElementos == 0) {
            this.ultimo = this.primeira;
        }
        totalDeElementos++;
    }

    public void adiciona(Object elemento) {
        if (this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {

            Celula nova = new Celula(elemento, null);
            this.ultimo.setProximo(nova);
            this.ultimo = nova;
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {

    }

    public Celula pega(int posicao) {
        Celula atual = this.primeira;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }

    public void remove(int posicao) {

    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object o) {
        return false;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        Celula atual = primeira;

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < totalDeElementos; i++) {
            sb.append(atual.getElemento());
            sb.append(",");

            atual = atual.getProximo();
        }
        sb.append("]");
        return sb.toString();
    }

}
