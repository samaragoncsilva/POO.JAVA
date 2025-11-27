package entidade;

public class Liv {

    public String titulo;
    public String autor;
    public int pagina;

    public void mostrarficha(){
        System.out.println("=== FICHA DE LIVRO ===");
        System.out.println("TÍTULO: " + titulo);
        System.out.println("AUTOR: " + autor);
        System.out.println("PÁGINAS: " + pagina);
    }
}
