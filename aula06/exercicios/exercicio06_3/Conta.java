package exercicios.exercicio06_3;

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

    public void Deposito(double valor) {
        if (valor > 0) {
            saldo += valor ;
        } else {
        }
    }
    public void Sacar(double valor){
        if (valor > 0){
            saldo -= valor;
        }
    }

}
