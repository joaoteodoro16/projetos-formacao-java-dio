package iphone;

public class Navegador extends Iphone{

    public void exibirPagina(String pagina){
        System.out.println("Exibindo pagina: " + pagina);
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }
}
