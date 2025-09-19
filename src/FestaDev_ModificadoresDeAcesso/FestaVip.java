package FestaDev_ModificadoresDeAcesso;


public class FestaVip {
    private int qtdCafe = 30;
    int qtdSalgados = 50;
    public int qtdClientes;


    public void entrar(){
        beberCafe();
        comerSalgado();
    }
    // privamos o métod0 para só quem estar dentro da classe
    private void beberCafe(){
        qtdCafe =qtdCafe - 1;
        System.out.println("bebeu 1 xícara de café..");
        System.out.println("Quantidade restante de café: " + qtdCafe);
    }

    private void comerSalgado(){
        qtdSalgados = qtdSalgados - 5;
        System.out.println("Comendo 5 salgados...");
        System.out.println("Quantidade restante de salgados: " + qtdSalgados);
    }

}
