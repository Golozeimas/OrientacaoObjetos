package ContaNeflix_Modificadores_De_Acesso;

public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;


    public void assitir(String nomeDoFilme){
        definindoIdiomaPreferencial();
        resolucaoTela();
        System.out.println("Começando a assistir:" + nomeDoFilme);
    }
    private void definindoIdiomaPreferencial(){
        idiomaPreferencial = "PT-BR";
        System.out.println("Definindo o idioma de preferencial..:" + idiomaPreferencial);
    }

    private void resolucaoTela(){
        resolucaoTela = "Full-HD";
        System.out.println("Definindo a resolução padrão da tela..:" + resolucaoTela);
    }



}
