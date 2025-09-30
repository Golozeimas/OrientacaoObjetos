package Polimorfismo.Calculadora;

public class Calculadora {

    public int soma(int num1, int num2){
        return num1 + num2;
    }

    /* uso de sobracarga por trazer diferentes parâmetros usando o mesmo metódo,
     diferente da sobreescrita que utiliza de diferentes metódos e herança, tem
     que ter os mesmos parâmetros */

    public double soma(double num1, double num2){
        return num1 + num2;
    }
}
