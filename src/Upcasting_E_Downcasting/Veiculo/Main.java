package Upcasting_E_Downcasting.Veiculo;

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Veiculo carro = new Carro();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for(Veiculo v : veiculos){
            v.mover();
        }

        if (carro instanceof Carro ){ // segurança (nome do objeto + instanceof + nome da classe instanciada)
            Carro c = (Carro) carro; // usando apenas a classe instanciada e o nome do objeto (downcasting)
            c.abrirPorta();
        }
    }
}
