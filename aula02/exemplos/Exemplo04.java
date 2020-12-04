package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome");
        nome = teclado.nextLine();

        // nome == "Emerson" - Nao utilizar, comparacao de String eh feito com equals
        // equalsIgnoreCase - Faz a comparacao ignorando maisculas e minusculas
        if(nome.equalsIgnoreCase("Emerson")){
            System.out.println("Ola Emerson");
        }else{
            System.out.println("Voce nao eh o Emerson");
        }
        teclado.close();
    }
}
