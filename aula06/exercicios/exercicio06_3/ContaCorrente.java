package exercicios.exercicio06_3;

public class ContaCorrente extends Conta {
   
    private final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int contaNumero) {
        super(contaNumero);

    }

    @Override
    public void Deposito(double valor) {
        super.Deposito(valor - TAXA_DEPOSITO);
    }

    @Override
    public void Sacar(double valor) {
        if (valor <= getSaldo()) {
            super.Sacar(valor);
        }else System.out.println("Saldo Insuficiente");

    }
 

}
