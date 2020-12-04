package uri;

import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int variavelA, variavelB, prod;

        variavelA = teclado.nextInt();
        variavelB = teclado.nextInt();
        prod = variavelA * variavelB;

        System.out.println("PROD = " + prod);

        teclado.close();
    }
}
