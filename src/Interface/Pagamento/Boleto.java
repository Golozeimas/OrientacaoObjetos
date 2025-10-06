package Interface.Pagamento;

public class Boleto implements Pagamento{
    @Override
    public void processarPagamentos(double valor){
        System.out.println("Processando pagamentos com boleto de: " + valor);
    }
    @Override
    public void estornarPagamentos(double valor){
        System.out.println("Estornando pagamentos com boletos de: " + valor);
    }
}
