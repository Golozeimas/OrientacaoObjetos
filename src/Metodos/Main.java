package Metodos;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Personagem hero;
        hero = new Personagem();
        Personagem hero2 = new Personagem();
        Random random = new Random();

        hero.name = "Ichigo";
        hero.strong = 50;
        hero.level = 10;

        // teria que ficar repetindo infinitas vezes em multiplos personagens, usamos um metodo
        hero.mostrarStatus();
        // aqui criamos com parâmetros, que precisamos passar para o metodo, tal como funções
        hero.mostrarStatus("Goku",10,20);

        System.out.println("");

        hero.subirDeNivel();
        hero.subirDeNivel();
        hero.subirDeNivel();

        hero2.name = "Bakugo";
        hero2.strong = 20;
        hero2.level = 50;

        hero2.mostrarStatus();

        hero.subirDeNivel();
        hero2.subirDeNivel();

        hero.subirDeForca();
        hero2.subirDeForca();

        hero.atacar("Pekão" , "Getsuga Teshou");

        if (hero.level < 100 && hero2.level < 100){
            System.out.println("Farmem mais para subir de nível");
        }
        else {

            System.out.println("Estão forte o suficiente");
            System.out.println("Prepare-se para a batalha!");

            if (hero.strong < hero2.strong){
                System.out.println("Bakugo ganhou");
            } else if (hero2.strong < hero.strong) {
                System.out.println("Ichigo ganhou");
            }else{
                System.out.println("Empate");
            }
        }
    }
}
