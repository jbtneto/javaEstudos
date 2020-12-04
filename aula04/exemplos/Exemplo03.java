package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        
        int resultado;
        
        resultado = soma(10,6); // Resultado recebe o retorno do metodo

        System.out.println("SOMA =" + resultado);
    }
// void - sem retorno
//Metodo soma com dois parametros e retorno int
    public static int soma(int valor1, int valor2){
        int resposta;

        resposta = valor1 + valor2;

        return resposta; // devolve (retorna) o valor da variavel
    }
}
