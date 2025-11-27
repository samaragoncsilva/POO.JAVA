package aplicacao;

import entidade.Informabanco;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Informabanco banco =new Informabanco();

        System.out.println("DIGITE O SEU NOME:");
        banco.nome=sc.nextLine();
        System.out.println("DIGITE O NOME DO SEU BANCO:");
        banco.nomebanco=sc.nextLine();
        System.out.println("DIGITE O SALDO DA SUA CONTA:");
        banco.saldo=sc.nextDouble();

        banco.mostraraficha();
        sc.close();

    }
}
