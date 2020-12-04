package exercicios;

import java.util.Scanner;

public class Exercicio02_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1/*40*/, nota2/*60*/, media;

        System.out.println("Insira o valor da nota 1");
        nota1 = teclado.nextDouble() * 0.4;
        System.out.println("Insira o valor da nota 2");
        nota2 = teclado.nextDouble() * 0.6;

        media = nota1 + nota2;
        if (media >= 6.0) {
            //System.out.println("Aprovado!, NOTA1 = "+ nota1 +" NOTA 2 = "+ nota2 +" Media = " + media);
            System.out.printf("APROVADO!! NOTA 1 = %.1f NOTA 2 = %.1f MEDIA = %.1f", nota1, nota2, media);
        } else {
            System.out.println("reprovado");
        }
        teclado.close();    
    }
}
