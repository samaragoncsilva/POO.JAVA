package academy.devjodo.maratonajava.javacore.bintroducaometodos.test;

import academy.devjodo.maratonajava.javacore.bintroducaometodos.dominio.Calculadora;

public class Calculadoratest03 {
    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora();
        double resultado;
        resultado= calculadora.dividedoisnum(20,2);
        System.out.println(resultado);

    }
}
