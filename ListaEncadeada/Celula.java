package ListaEncadeada;

public class Celula {

    private Object elemento;
    private Celula anterior;
    private Celula proximo;

    public Celula(Celula proximo, Object elemento) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula(Object elemento) {
        this(null, elemento);
    }

    public Object getElemento() {
        return elemento;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

}
