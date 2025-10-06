package Interface.Aparelhos;

public class Tv implements ControleRemoto {
    @Override
    public void desligar(){
        System.out.println("Desligando a TV");
    }
    @Override
    public void ligar(){
        System.out.println("Ligando a TV");
    }
    @Override
    public int trocarCanal(int canal){
        System.out.println("trocando de canal: " + (canal + 1));
        return canal;
    }

}
