package exercicios.exercicio06_4;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limiteConta, valor;
        GerenciaConta contas = new GerenciaConta();

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
                    numeroConta = in.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Informe o numero da conta");
                    numeroConta = in.nextInt();
                    System.out.println("Informe o limite da conta");
                    limiteConta = in.nextDouble();
                    // ce = new ContaEspecial(numeroConta, limiteConta);
                    // listaContas.add(ce);
                    contas.novaContaEspecial(numeroConta, limiteConta);
                    break;

                case 3:
                    System.out.println("Informe o numero da conta");
                    numeroConta = in.nextInt();
                    // cp = new ContaPoupanca(numeroConta);
                    // listaContas.add(cp);.
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Informe o numero da conta");
                    numeroConta = in.nextInt();
                    System.out.println(contas.exibirSaldo(numeroConta));
                    break;

                case 5:
                    System.out.println("Informe o numero da conta");
                    numeroConta = in.nextInt();
                    System.out.println("Informe o valor do saque");
                    valor = in.nextDouble();

                    if (contas.sacar(numeroConta, valor)) {
                        System.out.println("Operacao realizada");
                    } else {
                        System.out.println("Saque nao realizado");
                    }
                    break;

                case 6:
                    System.out.println("Informe o numero da conta");
                    numeroConta = in.nextInt();
                    System.out.println("Informe o valor do Deposito");
                    valor = in.nextDouble();

                    if (contas.depositar(numeroConta, valor)) {
                        System.out.println("Operacao realizada");
                    } else {
                        System.out.println("deposito nao realizado");
                    }

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
