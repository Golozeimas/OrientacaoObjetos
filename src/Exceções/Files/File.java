package Exceções.Files;

import java.io.FileReader;

public class File {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("arquvio.txt");
        }catch (Exception e){

        }
    }
}
