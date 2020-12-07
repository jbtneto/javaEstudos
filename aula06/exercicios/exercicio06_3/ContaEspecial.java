package exercicios.exercicio06_3;

public class ContaEspecial extends Conta {
    private double limite;
    private final double TAXA_DEPOSITO = 0.1;

    public ContaEspecial(int contaNumero, double limite) {
        super(contaNumero);
        this.limite = limite;
    }

    @Override
    public void Deposito(double valor) {
        super.Deposito(valor - TAXA_DEPOSITO);
    }

    @Override
    public void Sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            super.Sacar(valor);
        }else System.out.println("Saldo Insuficiente");

    }
}
