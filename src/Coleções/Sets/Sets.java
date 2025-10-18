package Coleções.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(); // mais rápido, do que a tree list

        Set<String> strings = new TreeSet<>();

        stringSet.add("Matheus");
        stringSet.add("Lucas");
        stringSet.add("Matheus"); // não deixa repetir o mesmo elemento o HashSet, é ignorado

        System.out.println(stringSet);

        stringSet.remove("Lucas");

        // stringSet.get não existe get no HashSet e nem no TreeSet

        System.out.println("Contém (Matheus)?" +" "+stringSet.contains("Matheus"));

        for (String a : stringSet){
            System.out.println(a);
        }
    }
}
