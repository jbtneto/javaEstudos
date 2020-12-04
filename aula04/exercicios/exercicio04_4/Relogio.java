package exercicios.exercicio04_4;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);;
        setSegundo(segundo);;
    }

    public void mostraHora() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }

    }
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }

    }
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }

    }

    public int gethora() {
        return hora;

    }
    public int getMinuto() {
        return minuto;

    }
    public int getSegundo() {
        return segundo;

    }
}
