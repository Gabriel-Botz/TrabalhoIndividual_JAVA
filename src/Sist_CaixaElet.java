import java.util.Scanner;

public class Sist_CaixaElet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        int contadorSaque = 0;
        double saldo = 0;
        double valorSaque;
        double valorDeposito = 0;

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
                    System.out.println("\nSeu saldo é: " + saldo);
                    break;

                case 2:
                    System.out.println("\nDigite o valor do depósito: ");
                    valorDeposito = sc.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.println("\nDeposito realizado com sucesso!\nSaldo atual: " + saldo);
                    break;

                case 3:

                    if (contadorSaque == 3) {
                        System.out.println("\nLimite de saque atingido!");
                    }else{

                    System.out.println("\nDigite o valor de saque: ");
                    valorSaque = sc.nextDouble();

                    if (valorSaque > saldo){
                        System.out.println("\nSaldo insuficiente! ");
                    } else if (valorSaque >100) {
                        System.out.println("Valor de saque máximo permitido: R$1000,00");

                    } else {
                        contadorSaque ++;
                        saldo = saldo - valorSaque;

                        System.out.println("\nSaque realizado com sucesso!\nSaldo atual: " + saldo);

                     }
                    }
                    break;

                case 4: sc.nextLine();

                    default:

            }


        }while (true);


    }
}
