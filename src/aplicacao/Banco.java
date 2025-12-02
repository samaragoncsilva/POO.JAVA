package aplicacao;
import java.util.Scanner;
import entidade.Bancocalculo;

public class Banco {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Bancocalculo conta = new Bancocalculo();

        System.out.println("DIGITE O SEU CPF");
        conta.titular =sc.nextLine();

        int opcao = 0;


        do {
            System.out.println("\nESCOLHA UMA OPÇÃO");
            System.out.println("1 - SALDO");
            System.out.println("2 - DEPOSITAR");
            System.out.println("3 - SACAR");
            System.out.println("4 - SAIR");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("SALDO: R$" + conta.Versaldo());
            }
            else if (opcao == 2) {
                System.out.println("DIGITE O VALOR PARA DEPOSITAR:");
                double valor = sc.nextDouble();
                conta.depositar(valor);
                System.out.println("DEPÓSITO REALIZADO. SALDO: R$" + conta.Versaldo());
            }
            else if (opcao == 3) {
                System.out.println("DIGITE O VALOR PARA SAQUE:");
                double valor = sc.nextDouble();
                conta.saque(valor);
                System.out.println("SAQUE REALIZADO. SALDO ATUAL: R$" + conta.Versaldo());
            }

        } while (opcao != 4);   // <-- AGORA ESTÁ NO LUGAR CERTO

        System.out.println("SAINDO...");
        sc.close();
    }
}
