package entidade;

public class Calculomedia {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double media() {
        return (nota1 + nota2 + nota3) / 3;

    }

    public String situacao() {
        double m = media();

        if (m >= 7) {
            return "ALUNO APROVADO";
        } else if (m >= 4) {
            return "ALUNO EM RECUPERAÇÃO";
        } else {
            return "ALUNO REPROVADO";
        }
    }
}

