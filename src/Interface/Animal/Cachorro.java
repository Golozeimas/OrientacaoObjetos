package Interface.Animal;

public class Cachorro implements Animal{
    @Override
    public void emitirSom(){
        System.out.println("AU, AU !!");
    }

    public void mover(){
        System.out.println("Correndo...");
    }
}
