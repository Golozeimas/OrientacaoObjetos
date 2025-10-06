package Interface.RPG_Ataques;

public class Arqueiro implements Atacante {
    @Override
    public void atacar(){
        System.out.println("Atacando com arco e flecha");
    }
}
