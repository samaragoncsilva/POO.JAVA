 //depositar, sacar, mosttrar saldo
package entidade;
import java.util.Scanner;
import entidade.Bancocalculo;

public class Bancocalculo {
   public String titular;
   public double saldo;


   public Bancocalculo(){
       this.saldo=0.0;

   }

    public double Versaldo() {
        return saldo;
    }


    public void depositar(double valor){
        saldo += valor;

   }

   public void saque(double valor){
       saldo-=valor;
   }

}
