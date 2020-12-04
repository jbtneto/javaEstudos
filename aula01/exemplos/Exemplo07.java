package exemplos;

public class Exemplo07 {
    public static void main(String[] args) {
        double resultado;

        resultado = 7.0 / 9;

        // Print formatado
        // printf( FORMATO , VALORES/VARIAVEIS)
        // %d - INTEIROS
        // %f - DECIMAIS
        // %s - String
        // %c - Caracter
        // %.xf - quantidade de casas decimais
        // \n - pular linha no printf
        System.out.printf("O Resultado e %.2f\n", resultado); 

        System.out.printf("%d / %d =  %.2f\n", 7, 9, resultado); 

        int valorInteiro = 5;
        double valorDouble = 8.5;

        System.out.println(valorInteiro);
        System.out.println(valorDouble);

        valorDouble = valorInteiro;
        System.out.println(valorDouble);

        valorDouble = 5.9897564;
        valorInteiro = (int)valorDouble; // DOWNCAST - perda de info
        System.out.println(valorInteiro);

        }
}
