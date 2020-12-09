package exercicios;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, divisao;
        boolean erro = true;
        do {
            try {

                System.out.println("Digite dois numeros");
                // n1 = Integer.parseInt(in.nextLine());
                // n2 = Integer.parseInt(in.nextLine());
                n1 = Double.parseDouble(in.nextLine());
                n2 = Double.parseDouble(in.nextLine());

                if(n2 == 0){
                    System.out.println("O segundo valor nao pode ser '0'");
                    continue;
                }

                divisao = n1 / n2;

                System.out.printf("%f / %f = %f ", n1, n2, divisao);

                erro =  false;
 
            } catch (InputMismatchException e) {
                System.out.println("Entrada Invalida, Tente novamente");
            } catch (NumberFormatException e) {
                System.out.println("numero deve ser digitado com '.' no decimal");
            } catch (ArithmeticException e) {
                System.out.println("o segundo valor nao pode ser 0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (erro);
        in.close();
    }
}
