package exercicios.exercicio06_4;

public class ContaEspecial extends Conta {
    private double limite;
    private final double TAXA_DEPOSITO = 0.1;

    public ContaEspecial(int contaNumero, double limite) {
        super(contaNumero);
        this.limite = limite;
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            return super.sacar(valor);
        }
        return false;

    }
}
