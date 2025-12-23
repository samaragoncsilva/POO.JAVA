package academy.devjodo.maratonajava.javacore.introducaoclasses.test;

import academy.devjodo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class Professorteste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Paulo";
        professor.idade= 30;
        professor.sexo= 'M';

        System.out.println(professor.nome+ " "+ professor.idade+ " "+professor.sexo);

    }
}
