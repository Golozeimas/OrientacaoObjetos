package Interface.Pagamento;

public class Main {
    static void main() {
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new Boleto();

        cartao.processarPagamentos(1200);
        cartao.estornarPagamentos(1200);

        boleto.processarPagamentos(1250);
        boleto.estornarPagamentos(1250);
    }
}
