package exercicios;

import java.util.Scanner;

public class Exercicio03_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, cont = 0;

        System.out.println("Simuladora de Tabuada, insira o numero desejado:");
        valor = teclado.nextInt();
        
        while(cont <= 10){
            System.out.println(valor + " x " + cont + " = " + (valor * cont));
            cont ++;
        }
        teclado.close();
    }
}
