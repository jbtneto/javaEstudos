package exercicios;

import java.util.Scanner;

// NaN = not a Number
public class Exercicio03_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int QTDE_NUMEROS = 10; // constante
        int i, num, impar = 0, par = 0, parM = 0;

        for (i = 1; i <= QTDE_NUMEROS; i++) {
            System.out.println("Digite o " + i + "o numero");
            num = in.nextInt();
            if (num % 2 == 0) {
                par++;
                parM = parM + num;
            } else {
                impar++;
            }
            in.close();
        }
        if (par > 0) {
            System.out.println("A media dos valores pares e:" + ((double) parM) / par);
        } else {
            System.out.println("Nenhum numero par");
        }
        if (impar > 0) {
            System.out.println("O total de impares foi: " + (impar / 10) * 100 + "%");
        } else {
            System.out.println("Quantidade de impares foi 0%");
        }

    }
}
