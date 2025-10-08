package Interface.Aparelhos;

public class Main {
    public static void main(String[] args) {
        ControleRemoto tv = new Tv();
        ControleRemoto smartphone = new Smartphone();

        tv.ligar();
        tv.trocarCanal(30);
        tv.desligar();

        System.out.println("");

        smartphone.ligar();
        smartphone.trocarCanal(45);
        smartphone.desligar();
    }
}
