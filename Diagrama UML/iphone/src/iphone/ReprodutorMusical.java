package iphone;

public class ReprodutorMusical extends Iphone{

    public void tocar(String musica){
        System.out.println("Tocando Musica: " + musica);
    }

    public void pausar(){
        System.out.println("Música pausada...");
    }

    public void selecionarMusica(String musica){
        System.out.println("Musica selecionada: " +  musica);
        tocar(musica);
    }

}
