package Coleções.HashMap;
import java.util.HashMap;
import java.util.Map;

public class UsoDeHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapaDasIdadesDosEstudantes = new HashMap<>();

        mapaDasIdadesDosEstudantes.put("Matheus", 19);
        mapaDasIdadesDosEstudantes.put("Goku" , 30);
        mapaDasIdadesDosEstudantes.put("Vegeta", 33);

        System.out.println("Idade de matheus: " + mapaDasIdadesDosEstudantes.get("Matheus"));
        System.out.println("Idade de Goku: " + mapaDasIdadesDosEstudantes.get("Goku"));

        System.out.println(" ");

        for(String nome :  mapaDasIdadesDosEstudantes.keySet()){
            System.out.println("Esses são os nomes: " + nome + ", suas respectivas idades: " + mapaDasIdadesDosEstudantes.get(nome));
        }
    }
}
