package exercicios;

import java.util.Scanner;

public class Exercicio03_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 1, num2 = 0, cont = 1;

        while (num != 0) {
            System.out.println("Digite o " + cont + "o numero:");
            num = in.nextInt();
            cont++;
            num2 = num2 + num;
        }
        System.out.println("A soma dos valores e = " + num2);
        in.close();
    }
}