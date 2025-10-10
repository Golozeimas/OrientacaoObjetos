package Heranca_Override;

public class Moto extends Veiculo {
    int pessoasNaGarupa;

    @Override
    void exibirInfo(){
        super.exibirInfo();
        System.out.println("Pessoas na garupa da moto: " + pessoasNaGarupa);
    }

}
