package Interface.Jogo_RPG;

public class Mago implements Personagem{
        @Override
        public void atacar() {
            System.out.println("atacando com bola de fogo..");
        }

        @Override
        public void defender() {
            System.out.println("defedendo com escudo de magia..");
        }


}
