package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal, imposto;

        sal = teclado.nextDouble();
        imposto = 0;
        if (sal < 2000) {
            System.out.println("Isento");
        } else {
            if (sal > 4500) {
                imposto = ((sal - 4500) * 0.28) + (270) + (1000 * 0.08);
                System.out.printf("R$ %.2f\n", imposto);
            }
            if (sal > 3000 && sal <= 4500) {
                imposto = ((sal - 3000) * 0.18) + (1000 * 0.08);
                System.out.printf("R$ %.2f\n", imposto);
            }
            if (sal > 2000 && sal <= 3000) {
                imposto = (sal - 2000) * 0.08;
                System.out.printf("R$ %.2f\n", imposto);
            }
        }
        teclado.close();
    }
}
/*
 * In an imaginary country called Lisarb, all the people are very happy to pay
 * their taxes because they know that doesn’t exist corrupt politicians and the
 * taxes are used to benefit the population, without any misappropriation. The
 * currency of this country is Rombus, whose symbol is R$.
 * 
 * Read a value with 2 digits after the decimal point, equivalent to the salary
 * of a Lisarb inhabitant. Then print the due value that this person must pay of
 * taxes, according to the table below.
 * 
 * 
 * 
 * Remember, if the salary is R$ 3,002.00 for example, the rate of 8% is only
 * over R$ 1,000.00, because the salary from R$ 0.00 to R$ 2,000.00 is tax free.
 * In the follow example, the total rate is 8% over R$ 1000.00 + 18% over R$
 * 2.00, resulting in R$ 80.36 at all. The answer must be printed with 2 digits
 * after the decimal point.
 * 
 * Input The input contains only a float-point number, with 2 digits after the
 * decimal point.
 * 
 * Output Print the message "R$" followed by a blank space and the total tax to
 * be payed, with two digits after the decimal point. If the value is up to
 * 2000, print the message "Isento".
 * 
 * Input Samples Outputs Samples 3002.00
 * 
 * R$ 80.36
 * 
 * 1701.12
 * 
 * Isento
 * 
 * 4520.00
 * 
 * R$ 355.60
 */