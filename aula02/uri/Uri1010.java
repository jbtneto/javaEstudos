package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int /*codeP1, codeP2, */numberP1, numberP2;
        double priceP1, priceP2, valor1, valor2, soma;

        //codeP1 = teclado.nextInt();
        numberP1 = teclado.nextInt();
        priceP1 = teclado.nextDouble();

        //codeP2 = teclado.nextInt();
        numberP2 = teclado.nextInt();
        priceP2 = teclado.nextDouble();

        valor1 = numberP1 * priceP1;
        valor2 = numberP2 * priceP2;
        soma = valor1 + valor2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

        teclado.close();
    }
}
/*In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.

Input Samples	Output Samples
12 1 5.30
16 2 5.10

VALOR A PAGAR: R$ 15.50

13 2 15.30
161 4 5.20

VALOR A PAGAR: R$ 51.40

1 1 15.10
2 1 15.10

VALOR A PAGAR: R$ 30.20 */