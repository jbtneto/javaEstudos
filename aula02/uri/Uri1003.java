package uri;

import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int variavelA, variavelB, soma;

        variavelA = teclado.nextInt();
        variavelB = teclado.nextInt();
        soma = variavelA + variavelB;

        System.out.println("SOMA = " + soma);
        

        teclado.close();
    }
}
