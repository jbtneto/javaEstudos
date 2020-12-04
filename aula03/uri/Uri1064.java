package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valores, soma = 0;
        int i, positivos = 0;

        for (i = 1; i <= 6; i++) {
            valores = in.nextDouble();

            if (valores > 0) {
                soma = soma + valores;
                positivos++;
            }in.close();
        }
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f\n", soma / positivos);
        

    }
}
