package br.com.joaoteodoro.estruturadados.pilhasefilas;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
//    public void push(No novoNo){
//        No refAuxiliar = refNoEntradaPilha;
//        refNoEntradaPilha = novoNo;
//        refNoEntradaPilha.setReferenciaNo(refAuxiliar);
//    }

    public void push(No novoNo){
        No noAnterior = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReferenciaNo(noAnterior);

        //o No anterior passou a ter a referencia da memoria do refNoEntradaPilha
        //Eu passei a referencia do nó que está vindo para a refNoEntradaPilha, ou seja, agora, refNoEntradaPilha é o novoNo
        //Eu dou um set no ponteiro que aponta para o proximo elemento da pilha, passando o ponteiro do elemento anterior
    }




    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReferenciaNo();
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString(){
        String strRetorno = "---------------\n";
        strRetorno += "Pilha\n";
        strRetorno += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                strRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            }else{
                break;
            }
        }

        strRetorno += "\n=====================\n";

        return strRetorno;
    }


}
