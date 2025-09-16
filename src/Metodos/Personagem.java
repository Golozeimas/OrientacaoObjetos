package Metodos;
import java.util.Random;

public class Personagem {  // nome de classe seempre maisculo
    String name;
    int life;
    int level;
    int strong;

    void subirDeNivel(){
        Random r = new Random();
        level += r.nextInt(100);
    }

    void subirDeForca(){
        Random r = new Random();
        strong += r.nextInt(100);
    }
    // Métodos com vários parâmetros
    void mostrarStatus(String nome, int level, int forca){ // fazendo com parâmetros
        System.out.println("");
        System.out.printf("Personagem: %s (level %d), com %d de força", nome, level,forca);
    }

    void mostrarStatus(){ // fazendo com os atributos disponiveis, que estar sendo instaciado no Main
        System.out.printf("Personagem: %s (level %d), com %d de força", name, level, strong);
        System.out.println("");
    }

    void atacar(String alvo , String habilidade){
        // se for null, ataca normal, se não usa habilidade que foi passada
        int dano  = calcularDano(); // metodo dentro de uma variável
        if (habilidade.length() == 0) {
            System.out.printf("%s atacou e deu %d de danos no %s \n", name, dano, alvo);
        }else{
            System.out.printf("%s atacou com a habilidade de %s e deu o dobro (%d) de danos no %s \n", name,habilidade,dano *2 , alvo);
        }
    }

    int calcularDano(){
        Random r = new Random();
        int dadoDe20 = 1 + r.nextInt(19); // se for 0 adiciona mais 1, e se ter 19 adiciona mais um
        int danoCausado = strong + dadoDe20;
        return danoCausado;
    }
}

