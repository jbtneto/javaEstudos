package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;

        System.out.println("Digite um valor positivo");
        valor = in.nextInt();

        if (valor > 0) {
            System.out.println("Valido");
        } else {
            System.out.println("Invalido");
        }

        while (valor <= 0) {
            System.out.println("Invalido");
            System.out.println("Digite um valor positivo");
            valor = in.nextInt();
        }
        System.out.println("Valido");
        in.close();
    }
}
