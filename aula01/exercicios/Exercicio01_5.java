package exercicios;

import java.util.Scanner;

public class Exercicio01_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double custoFabrica /*entrada*/ , percentDistribuidor/*28 %*/, impostos /*45 %*/, valorTotal;

        System.out.println("Insira o custo de fabrica:");
        custoFabrica = teclado.nextDouble();
        System.out.println("O custo de fabrica e = R$" + custoFabrica);

        percentDistribuidor = custoFabrica * .28;
        impostos = custoFabrica * .45;
        valorTotal = custoFabrica + percentDistribuidor + impostos;

        System.out.println("Valor do distribuidor eh de = R$" + percentDistribuidor);
        System.out.printf("Valor do distribuidor eh de = R$%.2f\n", percentDistribuidor);

        System.out.println("Valor dos impostos eh de = R$" + impostos);
        System.out.printf("Valor dos impostos eh de = R$%.2f\n",  impostos);

        System.out.println("Custo final ao consumidor = R$" + valorTotal);

        teclado.close();        

    }
}
