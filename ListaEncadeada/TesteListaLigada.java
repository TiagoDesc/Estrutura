package ListaEncadeada;

public class TesteListaLigada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("Paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("Guilherme");
        System.out.println(lista);

        System.out.println(lista.pega(2).getElemento());
        System.out.println(lista.pega(1).getElemento());
        System.out.println(lista.pega(0).getElemento());
    }

}
