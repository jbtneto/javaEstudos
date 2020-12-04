package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double variavelA, variavelB, variavelC, media;

        variavelA = teclado.nextDouble();
        variavelB = teclado.nextDouble();
        variavelC = teclado.nextDouble();

        media = ((variavelA*2) + (variavelB*3) + (variavelC*5)) / 10;

        System.out.printf("MEDIA = %.1f\n",  media);

        
        teclado.close(); 
    }
}
