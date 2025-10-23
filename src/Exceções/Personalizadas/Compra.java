package Exceções.Personalizadas;

public class Compra {
    private double saldo;
    private double valor;

    public Compra(double saldo, double valor){
        this.saldo = saldo;
        this.valor = valor;
    }
    public void comprar() throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException("Compra não realizada");
        }
        saldo -= valor; // faz a conta de subtração da compra
        System.out.println("Compra realizada com sucesso!");
    }
}
