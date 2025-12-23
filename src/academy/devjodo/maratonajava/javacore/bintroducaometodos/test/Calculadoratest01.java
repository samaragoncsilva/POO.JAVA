package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

//CHAMAR A FUNCAO

public class Calculadoratest01 {

    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora();
        calculadora.somardoisnum();
        calculadora.subtrair2numeros();
        System.out.println("programa finalizado");
    }
}
