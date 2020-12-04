package exercicios;

import java.util.Scanner;

public class Exercicio02_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Insira um numero maior que 20 para saber sua metade");
        num = teclado.nextInt();

        if (num >= 20) {
            //System.out.println("A metade do numero " + num + " eh: " + num / 2);
            System.out.printf("A metade inteira de %s e %.1f", num, (float)num/2);
        } else {
            System.out.println(num + " eh menor que 20!");
        }
        teclado.close();
    }
}
