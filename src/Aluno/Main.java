package Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();

        a.nome = "matheus";

        a.nota1 = 5;
        a.nota2 = 6;

        System.out.println(a.nome + "\n" +a.media());
    }
}
