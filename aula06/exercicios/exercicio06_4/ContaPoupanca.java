package exercicios.exercicio06_4;

public class ContaPoupanca extends Conta {
    private final double TAXA_SAQUE = 0.1;

    public ContaPoupanca(int contaNumero) {
        super(contaNumero);

    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + TAXA_SAQUE) {
            return super.sacar(valor + TAXA_SAQUE);
        }
        return false;

    }

}
