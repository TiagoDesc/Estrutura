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

        lista.adicionaNoFim("Marcelo");
        System.out.println(lista);

        lista.adicionaNoMeio(2, "Gabriel");
        System.out.println(lista);

        Object x = lista.pega(2);
        System.out.println(x);
        System.out.println(lista.tamanho());

        lista.removeDoComeco();
        System.out.println(lista);
    }

}
