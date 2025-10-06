package Interface.Aparelhos;

public class Smartphone implements ControleRemoto{
    @Override
    public void desligar(){
        System.out.println("Desligando o smartphone");
    }
    @Override
    public void ligar(){
        System.out.println("Ligando o smartphone");
    }
    @Override
    public int trocarCanal(int canal){
        System.out.println("Trocando o video no youtube: " + (canal + 1));
        return canal;
    }
}
