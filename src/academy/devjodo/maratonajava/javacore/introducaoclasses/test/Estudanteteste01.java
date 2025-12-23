package academy.devjodo.maratonajava.javacore.introducaoclasses.test;

import academy.devjodo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class Estudanteteste01 {
    public static void main(String[] args) {
        Estudante estudante=new Estudante(); //estudante é o que usa para acessar o objeto
        estudante.nome= "Ana";
        estudante.idade=18;
        estudante.sexo='f';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
