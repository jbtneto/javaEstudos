package exercicios;

import java.util.Scanner;

public class Exercicio03_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1, numN;

        numN = teclado.nextInt();

        while (cont <= numN) {
            System.out.printf("%d", cont);

            cont = cont * 2; // cont *= 2
            if (cont <= numN) {
                System.out.printf(", ");
            }
        }
        teclado.close();
    }
}
