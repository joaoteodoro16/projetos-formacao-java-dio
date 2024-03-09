package br.com.joaoteodoro.estruturadados.pilhasefilas.filas;

public class No {

    private Object object;
    private No ponteiro;

    public No(Object object){
        this.ponteiro = null;
        this.object = object;
    }

    public No(){

    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getPonteiro() {
        return ponteiro;
    }

    public void setPonteiro(No ponteiro) {
        this.ponteiro = ponteiro;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
