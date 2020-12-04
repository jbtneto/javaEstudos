package uri;

import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorR, valorN, valorA;

        valorN = 3.14159;
        valorR = teclado.nextDouble();
        valorA = valorN * (valorR * valorR);

        System.out.printf("A=%.4f\n", valorA);
        teclado.close();
    }
}
