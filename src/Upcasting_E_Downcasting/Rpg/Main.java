package Upcasting_E_Downcasting.Rpg;

 class Main {
     static void main() {
         Personagem mago = new Mago();
         Personagem guerreiro = new Guerreiro();

         mago.selecionouPersonagem(mago);

         System.out.println(" ");

         guerreiro.selecionouPersonagem(guerreiro);

         if(guerreiro instanceof Guerreiro){ // garante segurança no nosso downcasting
             Guerreiro g = (Guerreiro) guerreiro;// downcasting - [nome da classe instanciada]+
             // [nome da nova variavel do downcasting] = [() nome da classe instanciada dentro de parentênses] + nome da antiga variavel
             g.defendendo();
         }

     }
 }
