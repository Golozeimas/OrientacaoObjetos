package Polimorfismo.Conversor;

public class Conversor {

    double converter(double km){
        return km * 1000;
    }

    double converter(int horas, double minutos){
        minutos = 60;
        return horas * minutos;
    }
}
