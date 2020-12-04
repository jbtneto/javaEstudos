package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        linha(25);
        System.out.println("Sistema de controle");
        linha2(25, '_'); // se o metodo tiver dois parametros, a chamada precisa ter tambem,
        // respeitando os tipos de variavel
        System.out.println("V1.0");
        linha2(5, '*');

    }

    // Metodo `linha` com um parametro
    public static void linha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    // Metodo 'linha' com dois parametros
    public static void linha2(int tamanho, char tipo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println();
    }
}
