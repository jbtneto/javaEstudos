package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sal;

        sal = teclado.nextDouble();

        if (sal <= 2000) {
            if (sal <= 1200) {
                if (sal <= 800) {
                    if (sal <= 400) {
                        System.out.printf("Novo salario: %.2f\n", sal * 1.15);
                        System.out.printf("Reajuste ganho: %.2f\n", sal * 0.15);
                        System.out.println("Em percentual: 15 %");
                    } else {
                        System.out.printf("Novo salario: %.2f\n", sal * 1.12);
                        System.out.printf("Reajuste ganho: %.2f\n", sal * 0.12);
                        System.out.println("Em percentual: 12 %");
                    }
                } else {
                    System.out.printf("Novo salario: %.2f\n", sal * 1.10);
                    System.out.printf("Reajuste ganho: %.2f\n", sal * 0.10);
                    System.out.println("Em percentual: 10 %");
                }
            } else {
                System.out.printf("Novo salario: %.2f\n", sal * 1.07);
                System.out.printf("Reajuste ganho: %.2f\n", sal * 0.07);
                System.out.println("Em percentual: 7 %");
            }
        } else {
            System.out.printf("Novo salario: %.2f\n", sal * 1.04);
            System.out.printf("Reajuste ganho: %.2f\n", sal * 0.04);
            System.out.println("Em percentual: 4 %");
        }
        teclado.close();
    }
}
/*
 * The company ABC decided to give a salary increase to its employees, according
 * to the following table:
 * 
 * 
 * Salary Readjustment Rate 0 - 400.00 400.01 - 800.00 800.01 - 1200.00 1200.01
 * - 2000.00 Above 2000.00
 * 
 * 15% 12% 10% 7% 4%
 * 
 * 
 * Read the employee's salary, calculate and print the new employee's salary, as
 * well the money earned and the increase percentual obtained by the employee,
 * with corresponding messages in Portuguese, as the below example.
 * 
 * Input The input contains only a floating-point number, with 2 digits after
 * the decimal point.
 * 
 * Output Print 3 messages followed by the corresponding numbers (see example)
 * informing the new salary, the among of money earned and the percentual
 * obtained by the employee. Note: Novo salario: means "New Salary" Reajuste
 * ganho: means "Money earned" Em percentual: means "In percentage"
 * 
 * Input Sample Output Sample 400.00
 * 
 * Novo salario: 460.00 Reajuste ganho: 60.00 Em percentual: 15 %
 * 
 * 800.01
 * 
 * Novo salario: 880.01 Reajuste ganho: 80.00 Em percentual: 10 %
 * 
 * 2000.00
 * 
 * Novo salario: 2140.00 Reajuste ganho: 140.00 Em percentual: 7 %
 */