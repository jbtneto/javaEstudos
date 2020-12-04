package exercicios;

import java.util.Scanner;

public class Exercicio02_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ladoA, ladoB, ladoC;

        System.out.println("Insira a medida do lado A do triangulo");
        ladoA = teclado.nextInt();

        System.out.println("Insira a medida do lado B do triangulo");
        ladoB = teclado.nextInt();

        System.out.println("Insira a medida do lado C do triangulo");
        ladoC = teclado.nextInt();

        if (ladoA > ladoB + ladoC || ladoB > ladoA + ladoC || ladoC > ladoB + ladoA) {
            System.out.println("nao forma um triangulo!");

        } else {
            if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("Equilatero");
            } else {
                if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
                    System.out.println("Isoceles");
                } else {
                    System.out.println("Escaleno");
                }

            }
        }
        teclado.close();
    }
}
