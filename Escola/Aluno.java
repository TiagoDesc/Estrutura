package Escola;

public class Aluno {

    private String name;

    public Aluno() {

    }

    public Aluno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return outro.getName().equals(this.name);
    }

    public String toString() {
        return name;
    }

}