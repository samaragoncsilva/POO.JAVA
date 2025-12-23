package academy.devjodo.maratonajava.javacore.introducaoclasses.test;

import academy.devjodo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class Estudanteteste02 {
    public static void main(String[] args) {
        Estudante estudante=new Estudante();
        Estudante estudante2=new Estudante();

        estudante2.nome="Sanji";
        estudante.nome="Sanji";
        estudante.sexo='m';
        estudante2.sexo='f';

        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("---------------");

        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
    }
}
