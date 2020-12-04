package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, resto, cem, cinquenta, vinte, dez, cinco, dois, um;

        valor = teclado.nextInt();
        System.out.println(valor);
        resto = valor;
        cem = valor / 100;
        System.out.printf("%d nota(s) de R$ 100,00\n", cem);
        resto = resto - (cem * 100);
        cinquenta = resto/50;
        System.out.printf("%d nota(s) de R$ 50,00\n", cinquenta);
        resto = resto - (cinquenta * 50);
        vinte = resto/20;
        System.out.printf("%d nota(s) de R$ 20,00\n", vinte);
        resto = resto - (vinte * 20);
        dez = resto/10;
        System.out.printf("%d nota(s) de R$ 10,00\n", dez);
        resto = resto - (dez * 10);
        cinco = resto/5;
        System.out.printf("%d nota(s) de R$ 5,00\n", cinco);
        resto = resto - (cinco * 5);
        dois = resto/2;
        System.out.printf("%d nota(s) de R$ 2,00\n", dois);
        resto = resto - (dois * 2);
        um = resto/1;
        System.out.printf("%d nota(s) de R$ 1,00\n", um);
    
        teclado.close();

    }
}
/*n this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read value and the list of banknotes.

Input
The input file contains an integer value N (0 < N < 1000000).

Output
Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given example. Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.

Input Sample	Output Sample
576

576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00

11257

11257
112 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
0 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
1 nota(s) de R$ 2,00
0 nota(s) de R$ 1,00

503

503
5 nota(s) de R$ 100,00
0 nota(s) de R$ 50,00
0 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
0 nota(s) de R$ 5,00
1 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00 */