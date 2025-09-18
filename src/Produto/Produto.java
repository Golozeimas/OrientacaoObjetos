package Produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibirProduto(){
        System.out.println("nome: " + nome);
        System.out.println("preço: " + preco);
        System.out.println("quantidade: " + quantidade);
    }

    public void vender(){
        if (quantidade != 0){
            quantidade--;
            System.out.println("produto vendido!");
        }else{
            System.out.println("estoque do produto, acabou!");
        }
    }
}
