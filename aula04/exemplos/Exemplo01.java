package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        linha2(25);
        //linha(); // System.out.println("-------------------");
        System.out.println("Sistema de controle");
        linha2(25);
        //linha(); // System.out.println("-------------------");
        System.out.println("V1.0");
        linha2(200);
        //linhaPequena();
    }
    // Metodo linha com parametros
    public static void linha2(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    // Metodo linha sem parametros e sem retorno
    public static void linha() {
        System.out.println("-------------------");
        segundaLinha();
    }

    public static void segundaLinha() {
        System.out.println("-------------------");

    }

    public static void linhaPequena() {
        System.out.println("---------");
    }

}
