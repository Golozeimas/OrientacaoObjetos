package Exceções.Personalizadas;

// isso é uma exceção personalizada com checked (obrigando o tratamento)
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
