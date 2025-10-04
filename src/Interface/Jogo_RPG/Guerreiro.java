package Interface.Jogo_RPG;

class Guerreiro implements Personagem {
    @Override
    public void atacar() {
        System.out.println("atacando com guerreiro..");
    }

    @Override
    public void defender() {
        System.out.println("defedendo com escudo..");
    }
}
