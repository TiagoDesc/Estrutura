import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {
        for (int i = totalDeAlunos - 1; i >= posicao; i = i - 1) {
            alunos[i + 1] = alunos[i];
        }

        alunos[posicao] = aluno;
        totalDeAlunos++;
    }

    private boolean posicaoOcupado(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    public Aluno pega(int posicao) {
        if (!posicaoOcupado(posicao)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return alunos[posicao];

    }

    public void remove(int posicao) {

    }

    public boolean contem(Aluno aluno) {
        return false;
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }
}
