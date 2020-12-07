package exercicios.exercicio06_1;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p = new Placar();
        Placar p1 = new Placar("Sao Paulo","Corinthians");
        Placar p2 = new Placar("Sao Paulo","Corinthians", 3, 0 );
        

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

    }
}
