package br.com.joaoteodoro.estruturadados.pilhasefilas.filas;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null;
    }

    public void enqueue(No novoNo){
        novoNo.setPonteiro(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first(){
        if(isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getPonteiro() != null){
                    primeiroNo = primeiroNo.getPonteiro();
                }else{
                    break;
                }
            }
        }
        return null;
    }

    public No dequeue(){
        if(isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;

            while(true){
                if(primeiroNo.getPonteiro() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getPonteiro();
                }else{
                    noAuxiliar.setPonteiro(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "";

        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                str += "[No{objeto = " + noAuxiliar.getObject() + "}] -->";
                if(noAuxiliar.getObject() !=null ){
                    noAuxiliar = noAuxiliar.getPonteiro();
                }else{
                    str += "Null";
                    break;
                }
            }
        }else{
            str = "null";
        }

        return str;
    }
}
