package ListaEncadeada;

public class TesteListaLigada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionaNoComeco("Mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("Guilherme");
        System.out.println(lista);
        lista.adicionaNoFim("Paulo");
        System.out.println(lista);

        lista.adicionaNoMeio(2, "Cecilia");
        System.out.println(lista);

        lista.removeDoFim();
        System.out.println(lista);

        lista.adicionaNoComeco("Jose");
        lista.adicionaNoComeco("Joao");

        System.out.println(lista);

        lista.remove(1);

        System.out.println(lista);
    }

}
