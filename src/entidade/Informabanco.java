package entidade;

public class Informabanco {
    public String nome;
    public String nomebanco;
    public double saldo;


    public void mostraraficha(){
        System.out.println("NOME:"+nome);
        System.out.println("NOME DO BANCO:"+nomebanco);
        System.out.println("SEU SALDO:"+saldo);
    }
}
