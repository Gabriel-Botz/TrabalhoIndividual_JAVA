import java.util.ArrayList;
import java.util.Scanner;

public class Sist_CaixaElet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ContaBancaria> Contas = new ArrayList<>();

        ContaBancaria c1 = new ContaBancaria(1200, "Gabriel Botelho");
        ContaBancaria c2 = new ContaBancaria(1300, "João Paulo");
        ContaBancaria c3 = new ContaBancaria(1400, "Marcelo Silva");
        ContaBancaria c4 = new ContaBancaria(1500, "Diego Abreu");

        Contas.add(c1);
        Contas.add(c2);
        Contas.add(c3);
        Contas.add(c4);

        String nomeDigitado = "";
        int contaDigitada;

        System.out.println("\n\n====== C A I X A - E L E T R Ô N I C O ======");
        System.out.println("|                                           |");
        System.out.println("|   Digite o seu nome completo:             |");
        System.out.println("|                                           |");
        System.out.println("=============================================");
        nomeDigitado = sc.nextLine();

        System.out.println("\n\n====== C A I X A - E L E T R Ô N I C O ======");
        System.out.println("|                                           |");
        System.out.println("|   Digite o número da conta:               |");
        System.out.println("|                                           |");
        System.out.println("=============================================");
        contaDigitada = sc.nextInt();

        boolean contaEncontrada = false;
        ContaBancaria contaLogada = null;

        for (ContaBancaria c : Contas){

            if (nomeDigitado.equals(c.titular) && contaDigitada == c.numeroConta){
                System.out.println("Bem Vindo Sr(a). " + c.titular);
                contaEncontrada = true;
                contaLogada = c;
                break;
            }
        }

        if (!contaEncontrada){
            System.out.println("Conta não encontrada!");
            System.exit(0);
        }

        int opcao = 0;

        do {

            System.out.println("\n\n====== C A I X A - E L E T R Ô N I C O ======");
            System.out.println("|                                           |");
            System.out.println("|     1- Ver saldo:                         |");
            System.out.println("|     2- Depositar:                         |");
            System.out.println("|     3- Sacar:                             |");
            System.out.println("|     4- Sair.                              |");
            System.out.println("|                                           |");
            System.out.println("=============================================");

            System.out.println("\nDigite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    contaLogada.verSaldo();
                    break;

                case 2:
                    System.out.println("\nDigite o valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    contaLogada.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.println("\nDigite o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    contaLogada.sacar(valorSaque);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }while (true);
    }
}
