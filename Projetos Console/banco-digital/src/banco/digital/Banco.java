package banco.digital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public void cadastrarCliente (Cliente cliente){
        this.clientes.add(cliente);
    }

    public void removerCliente (Cliente cliente){
        this.clientes.remove(cliente);
    }

    public void imprimir(){

        System.out.println("Banco: " + this.nome);

        System.out.println("Clientes: ");

        for(Cliente cliente: this.clientes){
            System.out.println("   Nome: " + cliente.getNome());
            System.out.println("   CPF: " + cliente.getCpf());
            System.out.println("   Endereço: " + cliente.getEndereco());
            System.out.println(" ");
        }
    }

}
