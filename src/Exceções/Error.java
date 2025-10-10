package Exceções;

import java.util.ArrayList;

public class Error {
    public static void main(String[] args) {
        ArrayList<int[]> List = new ArrayList<>() ;

        while (true){
            List.add(new int[1000000]);
        }
    }
}
