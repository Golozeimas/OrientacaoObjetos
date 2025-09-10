package Classes_e_Objetos;

public class Main {
    public static void main(String[] args){
        // iphone 11, 128 GB, IOS e 6.1 polegadas
        // Samsung note 12 ultra, 256 GB, Android e 6.2 polegadas
        // Declarando uma variável do tipo Celular e logo após instanciando um objeto
        Celular iphone11 = new Celular();
        Celular samsungNote12 = new Celular();
        Celular lgk10;
        lgk10 = new Celular(); // outra forma de instância um objeto no java

        iphone11.nome = "Iphone 11";
        iphone11.armazenamento = 128;
        iphone11.sistemaOperacional= "IOS";
        iphone11.polegadas = 6.1f;

        System.out.println("Nome do celular: "+ iphone11.nome+"\nArmazenamento: "+ iphone11.armazenamento+"" +
                "\nSistema Operacional: "+iphone11.sistemaOperacional+"\nPolegadas: "+iphone11.polegadas);

        System.out.format("%s de %d GB, com tela de %.2f, com sistema operacional (%s)",iphone11.nome,
                iphone11.armazenamento, iphone11.polegadas, iphone11.sistemaOperacional);

        System.out.println(" ");
        samsungNote12.nome = "Samsung note 12 ultra"; // estado de nome do atributo 'samsung'
        samsungNote12.armazenamento = 256;
        samsungNote12.sistemaOperacional = "Android";
        samsungNote12.polegadas = 6.3f;

        System.out.format("%s de %d GB, com tela de %.2f, com sistema operacional (%s)", samsungNote12.nome,
                samsungNote12.armazenamento, samsungNote12.polegadas,samsungNote12.sistemaOperacional);

        System.out.println(" ");

        lgk10.nome = "LG K10"; // estado de nome do atributo 'samsung'
        lgk10.armazenamento = 32;
        lgk10.sistemaOperacional = "Android";
        lgk10.polegadas = 5.8f;

        System.out.format("%s de %d GB, com tela de %.2f, com sistema operacional (%s)", lgk10.nome,lgk10.armazenamento,
                lgk10.polegadas,lgk10.sistemaOperacional);
    }
}
