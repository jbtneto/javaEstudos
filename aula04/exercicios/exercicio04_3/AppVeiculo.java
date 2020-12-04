package exercicios.exercicio04_3;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("147", "Fiat", 50.5);
        
        veiculo.exibir();
        System.out.println("Consumo= " + veiculo.obterConsumo());

    }
}
