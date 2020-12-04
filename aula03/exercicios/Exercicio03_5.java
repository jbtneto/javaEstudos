package exercicios;

import java.util.Scanner;

public class Exercicio03_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont, num, impar = 0, par = 0;

        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Digite o "+ cont +"o numero");
            num = in.nextInt();
            if (num % 2 == 0) {
                par = par + 1;
            } else {
                impar++;
            }
            in.close();
        }
        System.out.println("o total de pares e:" + par);
        System.out.println("O total de impares e:" + impar);
        
    }
}
