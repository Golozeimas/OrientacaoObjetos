package Livro;

public class Main {
    public static void main(String[] args) {
        Livro l = new Livro();
        Livro l2 = new Livro();

        l.autor = "Robert C. Martin";
        l.titulo = "código limpo";
        l.numeroDePaginas = 50;

        l2.numeroDePaginas = 10;

        l.detalhesDoLivro();
        l.compararPaginas(l2);
    }
}
