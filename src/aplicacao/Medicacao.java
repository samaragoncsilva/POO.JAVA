package aplicacao;

import entidade.Armazenmedic;

import java.util.Scanner;

public class Medicacao {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        Armazenmedic medicacao=new Armazenmedic();

        System.out.println("DIGITE O NOME DA MEDICAÇÃO:");
        medicacao.medicamento=sc.nextLine();

        System.out.println("QUANTIDADE:"+medicacao.quantidade());
        System.out.println("DATA DE VALIDADE:"+medicacao.validade());
        System.out.println("DOSAGEM:"+medicacao.dosagem());


    }
}
