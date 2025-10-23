package Exceções.Personalizadas;

public class MainIdade {
    public static void main(String[] args) {
        Idade idade = new Idade(-1);
        Idade idade2 = new Idade(15);

        idade.verificaIdade(); // joga uma exceção e impede de continuar, erro lógico, não precisa de tratamento
        idade2.verificaIdade();
    }
}
