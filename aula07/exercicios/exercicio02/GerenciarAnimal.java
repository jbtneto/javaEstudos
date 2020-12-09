package exercicios.exercicio02;

import java.util.ArrayList;

public class GerenciarAnimal {
    private ArrayList<Animal> animais;

    public GerenciarAnimal() {
        animais = new ArrayList<>();

    }

    public void novoAnimal(String nome, String raca, String cor, int nascimento, String nomeProp, String telefone) {
        animais.add(new Animal(nome, raca, cor, nascimento, nomeProp, telefone));
    }

    public String listarAnimais() {
        return animais.toString();
    }

    public String getProprietarioPorRaca(String raca) {
        String saida = "";
        for (Animal animal : animais) {
            if (animal.getRaca().equals(raca)) {
                saida += animal.getProprietario() + "\n";
            }
        }
        return saida;
    }
}
