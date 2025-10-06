package Interface.RPG_Ataques;

public class Mago implements Atacante{
    @Override
    public void atacar(){
        System.out.println("Atacando com bola de fogo!!!");
    }
}