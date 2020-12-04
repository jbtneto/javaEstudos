package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valA, valB, valC, valD;
        boolean teste;

        valA = teclado.nextInt();
        valB = teclado.nextInt();
        valC = teclado.nextInt();
        valD = teclado.nextInt();

        teste = (valB > valC && valD > valA) && (valC + valD > valA + valB) && 
        (valC > 0 && valD > 0) && (valA % 2 == 0);

        if(teste){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
        teclado.close();
    }
}
/*Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater than A and 
if the sum of C and D is greater than the sum of A and B and if C and D were positives 
values and if A is even, write the message “Valores aceitos” (Accepted values). 
Otherwise, write the message “Valores nao aceitos” (Values not accepted).

Input
Four integer numbers A, B, C and D.

Output
Show the corresponding message after the validation of the values​​.

Input Sample	Output Sample
5 6 7 8

Valores nao aceitos

2 3 2 6

Valores aceitos */