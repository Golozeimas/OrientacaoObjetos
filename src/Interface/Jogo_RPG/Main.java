package Interface.Jogo_RPG;

public class Main {
    public static void main(String[] args) {
        Personagem mago = new Mago();
        Personagem guerreiro = new Guerreiro(); // chama com a interface e os métodos de cada classe juntos

        mago.atacar();
        mago.defender();
        System.out.println("");
        guerreiro.atacar();
        guerreiro.defender();
    }
}
