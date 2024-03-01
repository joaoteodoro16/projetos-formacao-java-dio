package banco.digital;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void sacar(double valor){

    }

    public void deposito(double valor){
        this.saldo = saldo + valor;
    }

    public void verificaSaldo(){

    }

    public void transferirSaldo(){

    }

}
