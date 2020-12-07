package exercicios.exercicio06_2;

public class AppPessoa {
    public static void main(String[] args) {
        Estudante e = new Estudante("Joao", "0000-0000", "Ciencia da Computacao");
        Professor p = new Professor("Emerson", "0000-0000", 5000);

        System.out.println(e);
        System.out.println(p);
    }
}
