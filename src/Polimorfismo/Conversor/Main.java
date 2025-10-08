package Polimorfismo.Conversor;

public class Main {
    public static void main(String[] args) {

        Conversor conversor = new Conversor();

        System.out.println( conversor.converter(3) + " metros");
        System.out.println( conversor.converter(2,0) + " minutos");

    }
}
