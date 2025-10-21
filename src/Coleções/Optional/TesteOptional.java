package Coleções.Optional;

import java.util.Optional;

public class TesteOptional {
   public static Optional<Usuario> buscarUsuario(String id){
       if(id.equals("123"))
           return Optional.of(new Usuario("Matheus"));
       return Optional.empty();
   }

    public static void main(String[] args) {
        // pode se usar o metodo aqui dentro, pois a classe estar implementada junta com a main
        Optional<Usuario> usuario = buscarUsuario("123");

        // Exemplo, se usuario estiver no map, vai colocar o nome dele na variavle, caso não
        // o usuário não foi encotrado
        String nome = usuario.map(Usuario::getNome).orElse("Usuário não encotrado");

        System.out.println(nome);
    }
}
