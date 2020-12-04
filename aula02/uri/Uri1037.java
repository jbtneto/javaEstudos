package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        boolean teste;

        numero = teclado.nextDouble();
        teste = (numero < 0 || numero > 100);

        if (teste == false) {
            if (numero >= 0 && numero <= 25) {
                System.out.println("Intervalo [0,25]");
            } else {
                if (numero > 25 && numero <= 50) {
                    System.out.println("Intervalo (25,50]");
                } else {
                    if (numero > 50 && numero <= 75) {
                        System.out.println("Intervalo (50,75]");
                    } else {
                        System.out.println("Intervalo (75,100]");
                    }
                }
            }
        } else {
            System.out.println("Fora de intervalo");
        }
        teclado.close();
    }
}
/*
 * You must make a program that read a float-point number and print a message
 * saying in which of following intervals the number belongs: [0,25] (25,50],
 * (50,75], (75,100]. If the read number is less than zero or greather than 100,
 * the program must print the message “Fora de intervalo” that means
 * "Out of Interval".
 * 
 * The symbol '(' represents greather than. For example: [0,25] indicates
 * numbers between 0 and 25.0000, including both. (25,50] indicates numbers
 * greather than 25 (25.00001) up to 50.0000000.
 * 
 * Input The input file contains a floating-point number.
 * 
 * Output The output must be a message like following example.
 * 
 * Input Sample Output Sample 25.01
 * 
 * Intervalo (25,50]
 * 
 * 25.00
 * 
 * Intervalo [0,25]
 * 
 * 100.00
 * 
 * Intervalo (75,100]
 * 
 * -25.02
 * 
 * Fora de intervalo
 */