package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um valor Inteiro");
        numero = teclado.nextInt();
        System.out.println("Voce Digitou " + numero);

        teclado.close();
    }
}
