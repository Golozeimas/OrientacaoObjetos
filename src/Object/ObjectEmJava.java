package Object;

import java.util.ArrayList;

public class ObjectEmJava {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList <Object> a1 = new ArrayList<>(); // tipo object
        int[] b = new int[2];
        b[0] = 12;
        b[1] = 14;
        a.add("elemento x");
        a.add("elemento y");

        a1.add(12);
        a1.add(12.3);
        a1.add("papagaio");
        a1.add("estudantes");
        a1.add(true);
        a1.add(b[0]);
        a1.add(b[1]);

        for (Object a2 : a1){
            System.out.println(a2);
        }

    }
}
