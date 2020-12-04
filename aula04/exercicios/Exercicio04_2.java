package exercicios;

import java.util.Scanner;

public class Exercicio04_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite 3 numeros inteiros");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        System.out.println("menor numero e " + numerosInteiros3(n1, n2, n3));

        in.close();
    }

    public static int numerosInteiros(int num1, int num2, int num3) {

        int testa = 0;

        if (num1 < num2 && num1 < num3) {
            testa = num1;
        } else if (num2 < num3) {
            testa = num2;
        } else {
            testa = num3;
        }
        return testa;
    }

    public static int numerosInteiros2(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        }
        if (num2 < num1 && num2 < num3) {
            return num2;
        }
        return num3;
    }

    public static int numerosInteiros3(int num1, int num2, int num3) {
        int menor = num1;

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        return menor;

    }
    

}
