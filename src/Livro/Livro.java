package Livro;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;

    public void detalhesDoLivro(){
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("números de páginas: " + numeroDePaginas);
    }

    public boolean compararPaginas (Livro Outrolivro){
        if (numeroDePaginas > Outrolivro.numeroDePaginas){
            return true;
        }
        else{
            return false;
        }
    }
}