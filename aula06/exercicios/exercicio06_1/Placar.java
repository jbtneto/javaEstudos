package exercicios.exercicio06_1;

public class Placar {
    private String time1, time2;
    private int golTime1, golTime2;

    public Placar() { // Contrutor default, sem parametros
        time1 = "time da casa";
        time2 = "visitante";

    }

    public Placar(String time1, String time2, int golTime1, int golTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.golTime1 = golTime1;
        this.golTime2 = golTime2;

    }

    public Placar(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;
        this.golTime1 = 0;
        this.golTime2 = 0;
    }

    public String exibir() {
        return time1 + " " + golTime1 + " x " + golTime2 + " " + time2;
    }

    @Override
    public String toString() {
        return time1 + " " + golTime1 + " x " + golTime2 + " " + time2;
    }
}
