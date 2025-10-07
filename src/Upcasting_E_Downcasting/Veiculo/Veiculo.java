package Upcasting_E_Downcasting.Veiculo;

public class Veiculo {
    void mover(){
    System.out.println("movendo veiculo!");
    }
}
class Moto extends Veiculo {

    @Override
    void mover() {
        System.out.println("movendo moto!");
    }
}
class Carro extends Veiculo{
    @Override
    void mover(){
        System.out.println("movendo carro!");
    }

    void abrirPorta(){
        System.out.println("abrindo a porta do carro!");
    }
}
