package exercicios.exercicio06_2;

public abstract class Pessoa {
    private String nome, telefone;

    public Pessoa() {

    }
    public Pessoa(String nome) {
        this.nome = nome;
    
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String exibir() {
        return nome + " " + telefone;

    }

    @Override
    public String toString() {
        return "Nome: " +nome + "\nTelefone: " + telefone;
    }
}