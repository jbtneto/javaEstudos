package exercicios;

import java.util.Scanner;

public class Exercicio02_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha/*R10p5*/;
        boolean senhaValida; // true ou false

        System.out.println("Digite a senha");
        senha = teclado.nextLine();
        senhaValida = senha.equals("R10p5");
        // aceita == true
        // true == true -> TRUE
        // false == true -> FALSE
        if(senhaValida){
            System.out.println("Acesso Concedido");
        }else{
            System.out.println("Acesso Negado");
        }
        teclado.close();
    }
    
}

