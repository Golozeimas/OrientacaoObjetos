package Exceções.Personalizadas;

public class Idade {
    private int idade;

    public Idade (int idade){
        this.idade = idade;
    }

    void verificaIdade(){
        if(idade < 0){
            throw new IdadeInsuficitenteException("Idade não pode ser negativa");
        }
        System.out.println("Idade correta!");
    }
}
