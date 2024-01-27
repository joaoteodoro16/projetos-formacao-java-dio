package iphone;

public class AparelhoTelefonico extends Iphone {

    public void ligar(String contato){
        System.out.println("LIGANDO PARA:" + contato);
    }

    public void atender(){
        System.out.println("Atendendo Ligação");
    }

    public void iniciarCorreioVoz(int correio){
        System.out.println("Ouvindo correio de voz " + correio);
    }


}
