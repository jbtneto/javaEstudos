package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;

        do {
            System.out.println(" digite um valor positivo");
            valor = in.nextInt();
            if(valor <= 0){
                System.out.println("Numero Invalido, Repita");
            }
        } while (valor <= 0);
        System.out.println("numero valido");
    in.close();
    }
}
