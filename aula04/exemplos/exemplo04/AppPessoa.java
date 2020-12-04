package exemplos.exemplo04;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Emerson", 500);
        Pessoa p2 = new Pessoa("Joao", 1000);
           
        p1.apresentar();
        p2.apresentar();
    }
}
