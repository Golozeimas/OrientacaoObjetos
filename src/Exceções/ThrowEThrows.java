package Exceções;

import java.io.FileReader;
import java.io.IOException;

public class ThrowEThrows {

    public void dividir(int a, int b){
        if (b == 0){
         throw new ArithmeticException("Divisão por zero, não é possível!");
        }
        int divisao = a/b;
        System.out.println(divisao);
    }

    public void leitorDeArquivos(String nomeDoArquivo) throws IOException{
        FileReader leior = new FileReader(nomeDoArquivo);
        // pode ocorrer uma exceção então avisamos logo na assinatura do metodo, assim usando throws
    }

    public void verificaIdade(int idade) throws Exception{
        if (idade < 18){
            throw new Exception("você é menor de idade");
        }
            System.out.println("você é maior de idade");
        }
    public static void main(String[] args) {
        ThrowEThrows a = new ThrowEThrows();

        a.dividir(10,0);

    }
}
