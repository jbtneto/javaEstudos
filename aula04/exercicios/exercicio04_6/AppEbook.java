package exercicios.exercicio04_6;

public class AppEbook {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("teste", "fulano", 100, 1);  

        ebook.mostraCapa();
        System.out.println(ebook.exibirPagina());
        ebook.avancarPagina();
        System.out.println(ebook.exibirPagina());
        ebook.avancarPagina();
        System.out.println(ebook.exibirPagina());
        ebook.avancarPagina();
        System.out.println(ebook.exibirPagina());
        ebook.avancarPagina();
        System.out.println(ebook.exibirPagina());
        ebook.retrocederPagina();
        System.out.println(ebook.exibirPagina());

    }
    
}
