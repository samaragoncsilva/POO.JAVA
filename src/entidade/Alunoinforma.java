package entidade;

public class Alunoinforma {
    public String aluno;
    public int matricula;
    public double media;


    public void mostrarAficha(){


        System.out.println("=====FICHA DO ALUNO=====");
        System.out.println("ALUNO:"+aluno);
        System.out.println("MATRICULA:"+matricula);
        System.out.println("MÉDIA:"+media);

    }
}
