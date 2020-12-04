package exercicios;

import java.util.Scanner;

public class Exercicio01_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira Nota");
        nota1 = teclado.nextDouble();
        System.out.println("Voce Digitou " + nota1);

        System.out.println("Digite a segunda Nota");
        nota2 = teclado.nextDouble();
        System.out.println("Voce Digitou " + nota2);

        media = (nota1 + nota2) / 2;
        System.out.println("A media e = " + media);

        teclado.close();
    }
    
}
