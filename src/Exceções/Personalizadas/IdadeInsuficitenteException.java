package Exceções.Personalizadas;

public class IdadeInsuficitenteException extends RuntimeException {
    public IdadeInsuficitenteException (String mensagem){
        super(mensagem);
    }
}
