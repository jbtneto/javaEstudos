package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha/* 2002 */;
        boolean senhaValida = false; // true ou false

        // aceita == true
        // true == true -> TRUE
        // false == true -> FALSE
        while (senhaValida != true) {
            senha = teclado.nextLine();
            senhaValida = senha.equals("2002");
            if (senhaValida != true) {
                System.out.println("Senha Invalida");
            }
        }
        System.out.println("Acesso Permitido");

        teclado.close();
    }
}