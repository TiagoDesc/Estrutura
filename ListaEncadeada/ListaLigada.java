package ListaEncadeada;

public class ListaLigada {

    private Celula primeira = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;
        totalDeElementos++;
    }

    public void adiciona(Object elemento) {

    }

    public void adiciona(int posicao, Object elemento) {

    }

    public Object pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {

    }

    public int tamanho() {
        return 0;
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
