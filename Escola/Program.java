package Escola;

public class Program {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        System.out.println(lista);

        System.out.println(lista.contem(a1));

        Aluno novAluno = new Aluno("Danilo");
        System.out.println(lista.contem(novAluno));

        lista.adiciona(1, novAluno);
        System.out.println(lista.contem(novAluno));
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

    }
}
