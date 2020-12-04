package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, num, pares = 0, impares = 0, negativos = 0, positivos = 0;

        for (i = 1; i <= 5; i++) {
            num = in.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (num > 0) {
                positivos++;
            } else if( num <0){
                negativos++;
            }in.close();
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}
