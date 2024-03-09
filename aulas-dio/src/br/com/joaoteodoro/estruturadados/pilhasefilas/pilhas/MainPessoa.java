package br.com.joaoteodoro.estruturadados.pilhasefilas.pilhas;

public class MainPessoa {
    public static void main(String[] args) {
        PilhaPessoa minhaPilhaPessoa = new PilhaPessoa();

        minhaPilhaPessoa.push(new Pessoa("João"));
        minhaPilhaPessoa.push(new Pessoa("Marcos"));
        minhaPilhaPessoa.push(new Pessoa("Daniel"));
        minhaPilhaPessoa.push(new Pessoa("Claudia"));
        minhaPilhaPessoa.push(new Pessoa("Juliana"));

        System.out.println(minhaPilhaPessoa.toString());
        System.out.println(minhaPilhaPessoa.top().toString());
    }
}
