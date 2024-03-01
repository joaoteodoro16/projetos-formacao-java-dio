package banco.digital.enums;

public enum TipoTransacao {

    DEPOSITO(1),
    SAQUE(2),
    TRANSFERENCIA(3);

    private final int codigo;

    TipoTransacao(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }


}
