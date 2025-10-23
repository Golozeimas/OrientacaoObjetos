package Exceções;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("arquvio.txt");
        }catch (FileNotFoundException e){
            System.out.println("Não achamos o seu arquivo!!!" + e.getMessage());
        }
    }
}
