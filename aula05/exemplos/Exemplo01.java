package exemplos;

import java.util.ArrayList;

public class Exemplo01 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(5);
        lista.add(8);
        lista.add(120);
        lista.add(160);

        System.out.println(lista);
        System.out.println("quantidade de itens:" + lista.size());

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == 8) {
                System.out.println("achei na posicao " + i);
            }
        }
        for (Integer item : lista) { // para cada item da lista faca
            if (item == 8) {
                System.out.println("achei");

            }
            System.out.println("removendo o primeiro item: " + lista.remove(0));
            System.out.println(lista);
        }

    }

}
