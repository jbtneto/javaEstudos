package exercicios.exercicio06_3;

public class ContaPoupanca extends Conta {
    private final double TAXA_SAQUE = 0.1;

    public ContaPoupanca(int contaNumero) {
        super(contaNumero);

    }

    @Override
    public void Deposito(double valor) {
        super.Deposito(valor);
    }

    @Override
    public void Sacar(double valor) {
        if (valor <= getSaldo() + TAXA_SAQUE) {
            super.Sacar(valor + TAXA_SAQUE);
        } else
            System.out.println("Saldo Insuficiente");

    }

}
