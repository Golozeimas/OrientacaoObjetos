package Heranca_Override;

public class Main {
    public static void main(String[] args) {
        Programador p = new Programador();
        Gerente g = new Gerente();

        p.nome = "Matheus";
        p.linguagemPrincipal = "php";
        p.salario = 1500;

        p.exibirInfo();

        System.out.println(" ");

        g.nome = "Matheus";
        g.setor = "Adm";
        g.salario = 3000;

        g.exibirInfo();
    }
}
