package banco.digital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private List<Conta> contas;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contas = new ArrayList<Conta>();
    }
    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void removerConta(Conta conta){
        contas.remove(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
