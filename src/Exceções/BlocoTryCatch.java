package Exceções;

public class BlocoTryCatch {
    public static void main(String[] args) {
        try{
            int resultado = 10 / 0;
            System.out.println("Resultado: " +  resultado);
        }catch (Exception e){
            System.out.println("Erro, impossivel divisão por 0");
        }finally {
            System.out.println("não tente dividir por 0, por favor!");
        }
    }
}
