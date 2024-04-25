package Conjunto;

public class TesteDeConjunto {

    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Marcelo");
        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);

        conjunto.remove("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Guilherme");
        conjunto.adiciona("Paulo");
        conjunto.remove("Guilerme");

        System.out.println(conjunto);
    }

}
