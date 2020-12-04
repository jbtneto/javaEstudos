package exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        double resultado;

        resultado = 7 / 9;

        System.out.println("O Resultado e =" + resultado);

        resultado = 7.0 / 9;

        System.out.println("O Resultado e =" + resultado);

        double valor = 7;
        resultado = valor  / 9;

        System.out.println("O Resultado e =" + resultado);

        int valorInt = 7;
        resultado = (double)valorInt  / 9; //CASTING ou conversao temporaria de int para double

        System.out.println("O Resultado e =" + resultado);
    }
    

}
