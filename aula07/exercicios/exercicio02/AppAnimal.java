package exercicios.exercicio02;

public class AppAnimal {
    public static void main(String[] args) {

        GerenciarAnimal animais = new GerenciarAnimal();

        animais.novoAnimal("Rex","Vira lata","preto", 2015,"Joao","(11)123456789");
        animais.novoAnimal("Chitos","Vira lata","preto", 2015,"Pedro","(11)123456789");

        
        //Animal a = new Animal("Rex","Vira lata","preto", 2015,"Joao","(11)123456789");

        System.out.println(animais.listarAnimais());

        System.out.println(animais.getProprietarioPorRaca("Vira lata"));
        
    }
}
