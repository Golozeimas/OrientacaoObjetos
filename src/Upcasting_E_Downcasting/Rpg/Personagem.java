package Upcasting_E_Downcasting.Rpg;

public class Personagem {
    void atacar(){
        System.out.println("ataque génerico!");
    }

    void selecionouPersonagem(Personagem a){
        System.out.println("selecionando personagem génerico!");
    }
}
class Mago extends Personagem{
    @Override
    void atacar(){
        System.out.println("atacando com bola de fogo!");
    }
    @Override
    void selecionouPersonagem(Personagem a){
        System.out.println("selecionou mago!");
        atacar();
    }
}
class Guerreiro extends Personagem{
    @Override
    void atacar(){
        System.out.println("atacando com espada ULTRA GIGANTESCA!");
    }
    @Override
    void selecionouPersonagem(Personagem a){
        System.out.println("selecionou guerreiro!");
        atacar();
    }
    void defendendo(){
        System.out.println("defendendo com escudo");
    }
}
