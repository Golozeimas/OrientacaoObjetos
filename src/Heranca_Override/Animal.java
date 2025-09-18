package Heranca_Override;

public class Animal {
     void falar(){
        System.out.println("Som genérico...");
    }

    public class Gato extends Animal{
        @Override
         void falar(){
            System.out.println("Miau, Miau!!!");
        }

    }

}
