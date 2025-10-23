package Exceções.Questão;

public class Conta {
    private double saldo;
    private double valorDoSaque;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valorDoSaque) throws SaldoInsuficienteException{
        if(valorDoSaque > saldo){
            throw new SaldoInsuficienteException("Valor do saque é maior que o saldo da conta!");
        }
        System.out.println("Saque bem sucedido!");
    }
}
