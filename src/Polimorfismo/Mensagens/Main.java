package Polimorfismo.Mensagens;

public class Main {
   public static void main(String[] args) {
        Mensagens mensagens = new Mensagens();

        mensagens.texto("Como colocar uma makita na construção");

        mensagens.texto("Precisamos de makita, urgente!", 5);

        mensagens.texto("Não temos makite",1,true);
    }
}
