package exercicios.exercicio04_4;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(12, 12, 00);

        relogio.setHora(5);
        relogio.mostraHora();

        System.out.println("Hora Atual: " + relogio.gethora());
        System.out.println("Minuto Atual: " + relogio.getMinuto());
        System.out.println("Segundo Atual: " + relogio.getSegundo());

    }

}
