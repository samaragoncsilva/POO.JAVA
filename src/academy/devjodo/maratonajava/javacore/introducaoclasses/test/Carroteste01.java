package academy.devjodo.maratonajava.javacore.introducaoclasses.test;

import academy.devjodo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class Carroteste01 {
    public static void main(String[] args) {
        Carro carro1=new Carro();
        Carro carro2=new Carro();

        carro1.nome="uno";
        carro1.modelo="fest";
        carro1.ano=2012;

        carro2.nome="ceci";
        carro2.modelo="intro";
        carro2.ano=2009;



        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("--------------------------------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);



    }
}
