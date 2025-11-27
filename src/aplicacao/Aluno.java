package aplicacao;
import java.util.Scanner;
import entidade.Alunoinforma;

public class Aluno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Alunoinforma informacoesaluno =new Alunoinforma();

        System.out.println("NOME DO ALUNO:");
        informacoesaluno.aluno=sc.nextLine();
        System.out.println("NÚMERO DA MÁTRICULA:");
        informacoesaluno.matricula=sc.nextInt();
        System.out.println("MÉDIA DO ALUNO:");
        informacoesaluno.media=sc.nextDouble();

        informacoesaluno.mostrarAficha();
        sc.close();



    }
}
