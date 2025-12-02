package aplicacao;

import entidade.Calculomedia;

import java.util.Scanner;

public class Mediaaluno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Calculomedia aluno=new Calculomedia();

        System.out.println("DIGITE O NOME DO ALUNO");
        aluno.nome=sc.nextLine();

        System.out.println("DIGITE A NOTA 1");
        aluno.nota1=sc.nextDouble();

        System.out.println("DIGITE A NOTA 2");
        aluno.nota2=sc.nextDouble();

        System.out.println("DIGITE A NOTA 3");
        aluno.nota3=sc.nextDouble();
        System.out.println("NOME:"+aluno.nome);

        System.out.println("\nMÉDIA:"+aluno.media()); //como é funçao tem que ter o media()
        System.out.println("\nSITUAÇÃO:"+aluno.situacao());

        sc.close();

        }

    }

