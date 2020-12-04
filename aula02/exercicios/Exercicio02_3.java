package exercicios;

import java.util.Scanner;

public class Exercicio02_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1, num2;

        num1 = teclado.nextFloat();
        num2 = teclado.nextFloat();

        if ( num1 > num2) {
            System.out.printf("%.1f | %.1f",num1,num2);
            
        } else {
            System.out.printf("%.1f | %.1f",num2,num1);
        }
        teclado.close();

    }
}
