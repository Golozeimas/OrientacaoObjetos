package Produto;


public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.nome = "arroz";
        p1.preco = 2.50;
        p1.quantidade  = 0;

        p1.vender();

        p1.exibirProduto();


    }

}
