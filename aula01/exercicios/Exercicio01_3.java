package exercicios;

import java.util.Scanner;

public class Exercicio01_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal1, salup;

        System.out.println("Insira o Salario");
        sal1 = teclado.nextDouble();
        System.out.println("Voce Digitou " + sal1);

        salup = (sal1 * 0.25) + sal1;
        System.out.println("Salario com aumento = " + salup);
        
        teclado.close();
    }
}
