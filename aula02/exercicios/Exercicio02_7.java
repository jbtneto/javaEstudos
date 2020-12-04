package exercicios;

import java.util.Scanner;

public class Exercicio02_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal;

        System.out.println("Insira o Valor do salario para saber o desconto de INSS");
        sal = teclado.nextDouble();

        if (sal < 2000) {
            if (sal < 1200) {
                if (sal < 600) {
                    System.out.println("Isento");
                } else {
                    System.out.println("Valor de desconto 20%, = R$" + sal * 0.20);
                }
            } else {
                System.out.println("Valor de desconto 25%, = R$" + sal * 0.25);
            }
        } else {
            System.out.println("Valor de desconto 30%, = R$" + sal * 0.30);
        }
        teclado.close();
    }
}
