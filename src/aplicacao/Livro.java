package aplicacao;
import java.util.Scanner;
import entidade.Liv;

public class Livro {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        Liv meulivro = new Liv();

        System.out.println("digite o titulo do livro");
        meulivro.titulo=sc.nextLine();

        System.out.println("digite o nome do autor:");
        meulivro.autor=sc.nextLine();

        System.out.println("digite o números de paginas");
        meulivro.pagina=sc.nextInt();

        meulivro.mostrarficha();
        sc.close();
    }
}
