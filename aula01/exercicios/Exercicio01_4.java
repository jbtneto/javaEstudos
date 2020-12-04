package exercicios;

import java.util.Scanner;

public class Exercicio01_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal1, KWU, KWP, paga, pagadesc;

        System.out.println("Insira o Salario Minimo");
        sal1 = teclado.nextDouble();
        System.out.println("Valor do Salario minimo R$" + sal1);
        
        System.out.println("Insira a quantidade de KW utilizados");
        KWU = teclado.nextDouble();
        System.out.println("Quantidade de KW utilizados " + KWU);

        KWP = (sal1 / 500);
        
        paga = KWP * KWU;
        System.out.println("Valor a ser pago =R$" + paga);

        pagadesc = paga - (paga * 0.15);
        System.out.println("Valor a ser pago com desconto = R$" + pagadesc);
        
        teclado.close();
    }
}
