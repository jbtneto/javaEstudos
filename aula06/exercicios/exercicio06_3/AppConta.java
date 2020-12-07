package exercicios.exercicio06_3;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limiteConta;
        ContaCorrente cc = null;
        ContaEspecial ce = null;
        ContaPoupanca cp = null;
        do {
            System.out.println("1 - Nova conta corrente");
            System.out.println("2 - Nova conta especial");
            System.out.println("3 - Nova conta Poupanca");
            System.out.println("4 - Consultar Saldo");
            System.out.println("5 - Saque");
            System.out.println("6 - Deposito");
            System.out.println("7 - Sair");
            opcao = in.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Informe o numero da conta");
                    cc = new ContaCorrente(in.nextInt());
                    break;
                case 2:
                    System.out.println("Informe o numero da conta");
                    numeroConta = in.nextInt();
                    System.out.println("Informe o limite da conta");
                    limiteConta = in.nextDouble();
                    ce = new ContaEspecial(numeroConta, limiteConta);
                    break;
                case 3:
                    System.out.println("Informe o numero da conta");
                    numeroConta = in.nextInt();
                    cp = new ContaPoupanca(numeroConta);

                    break;
                case 4:
                    System.out.println(cc);
                    break;
                case 5:
                    System.out.println("Saque");
                    break;
                case 6:
                    System.out.println("Deposito");
                    break;
                case 7:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opcao Invalida");
            }

        } while (opcao != 7);
        in.close();
    }

}
