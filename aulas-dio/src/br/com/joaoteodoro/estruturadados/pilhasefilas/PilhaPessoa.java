package br.com.joaoteodoro.estruturadados.pilhasefilas;

public class PilhaPessoa {

    private Pessoa pessoa; //SEMPRE SE TORNA O ULTIMO ELEMENTO A SER ADICIONADO

    public PilhaPessoa() {
        this.pessoa = null;
    }

    public void push(Pessoa novaPessoa){
        Pessoa pessoaAnterior = pessoa; //SETEI A REFERENCIA DA MEMORIA DE PESSOA PARA PESSOA ANTERIOR
        pessoa = novaPessoa; //SETEI A REFERENCIA DE MEMORIA DE NOVA PESSOA PARA PESSOA
        pessoa.setPonteiro(pessoaAnterior); //SETEI O PONTEIRO DE PESSOA PARA APONTAR PARA A REFERENCIA DE MEMORIA DA PESSOA ANTERIOR
    }

    public boolean isEmpty(){
        return pessoa == null;
    }

    public Pessoa pop(){
        if(!this.isEmpty()){
            Pessoa pessoaExcluida = pessoa; //SETA A REFERENCIA DE MEMORIA DE PESSOA PARA PESSOA ANTIGA QUE NAO É UTILIZADO, LOGO NAO ESTA NA PILHA, OU SEJA, PERDEU-SE A REFERENCIA DE MEMORIA DE PESSOA
            pessoa = pessoa.getPonteiro(); // SETA A REFERENCIA DE MEMORIA DO PONTEIRO DE PESSOA PARA A PROPRIA PESSOA, OU SEJA, PARA O ELEMENTO A BAIXO (ELEMENTO A BAIXO PASSA A SER O TOPO DA PILHA)
        }
        return null;
    }

    public Pessoa top(){
        return pessoa;
    } //Retorna o ultimo elemento adicionado da pilha

    @Override
    public String toString(){
        String strRetorno = "---------------\n";
        strRetorno += "Pilha\n";
        strRetorno += "---------------\n";

        Pessoa pessoaAntiga = pessoa; //SETA A REFERENCIA DE MEMORIA DE PESSOA PARA PESSOA ANTIGA

        while(true){
            if(pessoaAntiga != null){
                strRetorno += "[Pessoa{dado=" + pessoaAntiga.getNome() + "}]\n";
                pessoaAntiga = pessoaAntiga.getPonteiro(); // SETA A REFERENCIA DE PESSOA ANTIGA COM A REFERENCIA DO PONTEIRO DA PROPRIA PESSOA ANTIGA, OU SEJA, PARA O ELEMENTO ABAIXO
            }else{
                break;
            }
        }

        strRetorno += "\n=====================\n";

        return strRetorno;
    }













}
