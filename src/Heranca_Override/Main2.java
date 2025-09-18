package Heranca_Override;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Carro c = new Carro();
        Carro c2 = new Carro();

        ArrayList<Veiculo> carros = new ArrayList<>();

        c.modelo = "Corolla";
        c.ano = 2005;
        c.numeroDePortas = 4;

        c2.modelo = "hb20";
        c2.ano = 2025;
        c2.numeroDePortas = 2;

        carros.add(c);
        carros.add(c2);

        for (Veiculo v : carros){
            v.exibirInfo();
        }

    }

}
