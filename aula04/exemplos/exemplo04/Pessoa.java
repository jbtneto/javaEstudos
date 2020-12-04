package exemplos.exemplo04;

public class Pessoa {
    // Atributo
    String nome;
    float salario;

    // metodo contrutor
    Pessoa(String nome, float salario) {
        this.nome = nome; // this se refere ao proprio objeto
        this.salario = salario;
    }

    // Metodo
    void apresentar() {
        System.out.println("meu nome e: " + nome + " meu salario e = R$" + salario);
    }
}
