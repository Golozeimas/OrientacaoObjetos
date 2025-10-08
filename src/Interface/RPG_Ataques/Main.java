package Interface.RPG_Ataques;

import Metodos.Personagem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Atacante> atacantes = new ArrayList<>();

        atacantes.add(new Guerreiro());
        atacantes.add(new Mago());
        atacantes.add(new Arqueiro());

        for (Atacante a : atacantes) {
            a.atacar(); // percorre, executando o metodo atacar() por todas as classes do arraylist
        }

    }
}
