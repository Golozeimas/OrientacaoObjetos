package Heranca_Override;

public class Gerente extends Funcionario {
    String setor;

    void exibirInfo(){
        System.out.println("nome: " + nome);
        System.out.println("setor : " + setor);
        System.out.println("salário : " + salario);
    }
}
