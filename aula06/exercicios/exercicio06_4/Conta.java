package exercicios.exercicio06_4;

public abstract class Conta {
    private int contaNumero;
    private double saldo;

    public Conta(int contaNumero) {
        this.contaNumero = contaNumero;
        this.saldo = 0;

    }

    public int getContaNumero() {
        return contaNumero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String exibir() {
        return contaNumero + " " + saldo;
    }

    @Override
    public String toString() {
        return "Numero da conta: " + contaNumero + "\nSaldo: " + saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

}
