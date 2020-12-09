package exercicios.exercicio02;

public class Proprietario {
    private String nome, telefone;
    

public Proprietario(String nome, String telefone){
    this.nome = nome;
    this.telefone = telefone;
    
}
@Override
public String toString() {
    return "Nome: " +nome + "\nTelefone: " + telefone;
}
}