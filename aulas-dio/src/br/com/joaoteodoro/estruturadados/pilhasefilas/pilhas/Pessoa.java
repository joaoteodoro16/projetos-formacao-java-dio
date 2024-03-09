package br.com.joaoteodoro.estruturadados.pilhasefilas.pilhas;

public class Pessoa {

    private String Nome;
    private Pessoa ponteiro = null;

    public Pessoa(String nome) {
        Nome = nome;
    }

    public Pessoa() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Pessoa getPonteiro() {
        return ponteiro;
    }

    public void setPonteiro(Pessoa ponteiro) {
        this.ponteiro = ponteiro;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                '}';
    }
}
