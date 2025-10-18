package Coleções.List.Exemplo_List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    List<Integer> list1 = new LinkedList<>();

    list.add("Ana");

    list.add("Marcelo");

    list.add("Matheus");

    list.add("Matheus");

    list1.add(100);

    list1.add(120);

    list1.add(200);

    for (String a : list){
        System.out.println(a);
    }

    for (int a : list1){
        System.out.println(list1.get(0) + a);
    }
    }
}
