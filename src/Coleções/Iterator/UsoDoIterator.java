package Coleções.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoDoIterator {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("matheus");
        nomes.add("gabriel");
        nomes.add("lucas");

        Iterator<String> iterator = nomes.iterator(); //nome do arraylist.iterator() para ativar o Iterator;

        while (iterator.hasNext()){ // enquanto tiver um próximo
            String nome = iterator.next(); // cria uma variável com iterator.next(), que percorre a coleção
            System.out.println(nome); // nome de todos do ArrayList
            if (nome.equals("lucas")){ // se nome for igual a lucas
                iterator.remove(); // remove o elemento que tiver "lucas" na lista
            }
        }

        System.out.println("após remover: " + nomes); // consigo ver até o que sobrou da remoção
    }
}
