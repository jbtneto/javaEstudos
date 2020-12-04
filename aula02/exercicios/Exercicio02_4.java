package exercicios;

import java.util.Scanner;

public class Exercicio02_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal, valorP, limite;

        System.out.println("Digite o Valor do salario");
        sal = teclado.nextDouble();
        System.out.println("Digite o Valor da prestacao");
        valorP = teclado.nextDouble();

        limite = sal * .30;

        if (limite > valorP) {
            System.out.println("Credito Aprovado! Seu limite de credito e " + limite);
        } else {
            System.out.println("Credito Reprovado! Seu limite de credito e " + limite);
        }
        teclado.close();
    }
}
