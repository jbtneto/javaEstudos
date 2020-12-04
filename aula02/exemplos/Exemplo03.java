package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Digite um valor inteiro");
        num = teclado.nextInt();

        if (num % 2 == 0 ) {
            System.out.println("O numero e PAR");
                   
        }else{
            System.out.println("O numero e IMPAR");
        }
        teclado.close();
    }
}
