package exercicios.exercicio04_3;

public class Veiculo {

    //Atributo, boas praticas que sejam sempre privado, sera modificavel/acessivel apenas dentro da classe
    private String modelo, marca;
    private double consumo;


    //Metodo CONSTRUTOR, deve ser public para acessar na classe principal
    Veiculo(String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }
    
    //METODO, deve ser public para acessar na classe principal
    public void exibir(){
        System.out.println("Modelo = "+modelo+" Marca = " +marca );
    }
    public double obterConsumo(){
        return consumo;
    }

}
