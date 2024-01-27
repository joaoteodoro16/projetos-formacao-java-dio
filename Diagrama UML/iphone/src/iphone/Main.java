package iphone;

public class Main {
    public static void main(String[] args) {

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        reprodutorMusical.ligar();
        reprodutorMusical.selecionarMusica("Beatles");
        reprodutorMusical.pausar();
        reprodutorMusical.tocar("Beatles");
        reprodutorMusical.aumentarVolume();
        reprodutorMusical.home();
        reprodutorMusical.desligar();
        
    }
}
