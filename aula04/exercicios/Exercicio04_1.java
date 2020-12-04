package exercicios;

import java.util.Scanner;

public class Exercicio04_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //parImpar(5); // retorno VOID
        //System.out.println(parImpar2(5)); // retorno STRING
        //System.out.println(parImpar3(5)); // Retorno Boolean simples
        int valor;
        System.out.println("Digite um valor inteiro");
        valor = in.nextInt();

        if (parImpar3(valor)){ //sempre que for TRUE ele vai entrar na condicao do IF parImpar3 = true
            System.out.println("PAR");
        }else {
            System.out.println("Impar");
        } // Retorno Boolean com IF
        in.close();
    }

    public static void parImpar(int valor) {
        if (valor % 2 == 0) {
            System.out.println("par");

        } else {
            System.out.println("impar");
        }
    }

    public static String parImpar2(int valor) {
        if (valor % 2 == 0) {
            return "Par";

        } else {
            return "Impar";
        }
    }
    public static boolean parImpar3(int valor) {
        if (valor % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }
}
