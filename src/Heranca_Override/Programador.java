package Heranca_Override;

public class Programador extends Funcionario{
    String linguagemPrincipal;

    void exibirInfo(){
        System.out.printf("Meu nome é %s, minha principal linguagem é %s, e meu salário é %.2f", nome, linguagemPrincipal,salario);
    }
}
