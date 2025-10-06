package Interface.Pagamento;

public class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamentos(double valor){
        System.out.println("Processando pagamentos no cartão de crédito no valor de: " + valor);
    }
    @Override
    public void estornarPagamentos(double valor){
        System.out.println("Retornando o pagamento no crédito no valor de: " + valor);
    }
}
