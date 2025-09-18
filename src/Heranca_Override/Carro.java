package Heranca_Override;

public class Carro extends Veiculo{
    int numeroDePortas;

    @Override
    void exibirInfo(){
        super.exibirInfo();
        System.out.println("Número de portas : " + numeroDePortas);
    }
}
