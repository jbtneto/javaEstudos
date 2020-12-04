package exercicios.exercicio04_6;

public class Ebook {
    private String titulo, autor;
    private int totalPag, pagAtual;
    private final int MAX_PAG = 100;


    public Ebook(String titulo, String autor, int totalPag, int pagAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pagAtual = pagAtual = 99;
    }
    public void avancarPagina() {
        if (pagAtual < MAX_PAG) {
            pagAtual++;
        }
    }
    public void retrocederPagina() {
        if (pagAtual > 0) {
            pagAtual--;
        }
    }
    public int exibirPagina() {
        return pagAtual;
    }
    public void mostraCapa() {
        System.out.println("Titulo: "+ titulo+ " Autor: " + autor + " Total de paginas " + totalPag);
    }
}