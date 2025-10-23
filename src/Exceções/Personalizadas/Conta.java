package Exceções.Personalizadas;

public class Conta {
    public static void main(String[] args) {
        Compra compra = new Compra(12.00,20.00);

        try {
            compra.comprar();
        }catch (SaldoInsuficienteException e){
            System.out.println("erro: " + e.getMessage());
        }
    }
}
