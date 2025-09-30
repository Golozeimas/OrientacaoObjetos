package Polimorfismo.Mensagens;

public class Mensagens {

    void texto(String texto){
        System.out.println("esse é seu texto: " + texto);
    }

    void texto(String texto, int prioridade){
        System.out.println("texto: " + texto + ", prioridade: " + prioridade);
    }

    void texto(String texto, int prioridade, boolean isTrue){
        System.out.println("texto: " + texto + ", sua prioridade: " + prioridade + ", é verdadeiro: "+ isTrue);
    }
}
