package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2;

        try {
            System.out.println("Digite um numero Inteiro");
            numero1 = Integer.parseInt(in.nextLine());
            
            System.out.println("Voce Digitou " + numero1);

            System.out.println("Digite outro numero Inteiro");
            String texto = in.nextLine();
            numero2 = Integer.parseInt(texto);
            System.out.println("Voce Digitou " + numero2);

        } catch (InputMismatchException ex) {
            System.out.println("voce nao digitou um numero inteiro");
            System.out.println(ex.getMessage());
        }

        catch (Exception ex) {
            System.out.println("Erro na digitacao");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally {
           System.out.println("Final do programa");
            in.close();
        }
    }
}
