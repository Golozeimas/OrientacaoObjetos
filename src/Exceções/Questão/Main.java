package Exceções.Questão;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1200);

        try{
            conta.sacar(1300);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}
