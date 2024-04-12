public class Program {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");
        Aluno novAluno = new Aluno("Danilo");
        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());
        lista.adiciona(1, novAluno);

        System.out.println(lista);
    }
}
