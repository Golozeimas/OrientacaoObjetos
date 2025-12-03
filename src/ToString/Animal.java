package ToString;

public class Animal
{
    private String nomeDoAnimal;
    public Animal( String nomeDoAnimal){
        this.nomeDoAnimal = nomeDoAnimal;
    }
    @Override
    public String toString(){
        return "Este é o nome do animal: "+nomeDoAnimal;
    }
}
