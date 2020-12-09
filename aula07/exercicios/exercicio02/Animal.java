package exercicios.exercicio02;

public class Animal {
    private String nome, raca, cor;
    private int nascimento;
    private Proprietario proprietario;

    public Animal(String nome, String raca, String cor, int nascimento, String nomeProp, String telefone) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.nascimento = nascimento;
        this.proprietario = new Proprietario(nomeProp, telefone);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nRaca: " + raca + "\n Cor: " + cor + "\nNascimento: " + nascimento;
    }

    public String getProprietario(){
        return proprietario.toString();
    }
    public String getRaca(){
        return raca;
    }
}