import banco.digital.Banco;
import banco.digital.Cliente;
import banco.digital.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Nubank");

        Cliente cliente1 = new Cliente("João Gabriel", "345.432.453-23", "Artelino Xavier Nº 11");
        cliente1.adicionarConta(new ContaCorrente(1, 0, cliente1));
        banco.cadastrarCliente(cliente1);

        cliente1.getContas().get(0).deposito(200);
        cliente1.getContas().get(0).sacar(100);


        banco.imprimir();


    }
}
