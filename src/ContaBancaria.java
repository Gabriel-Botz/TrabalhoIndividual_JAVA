import java.util.Scanner;

public class ContaBancaria {

    int numeroConta;
    String titular;
    double saldo;
    int contadorTentativas = 0;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 50;
    }

    public void sacar(double valor) {


        if (contadorTentativas == 3) {
            System.out.println("Saques diários permitidos: 3.\nLimite atingido! ");
            return;
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        } else if (valor > 1000.00) {
            System.out.println("ERRO: Saque máximo permitido: R$1000,00");
        } else if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            contadorTentativas++;
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    public void verSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
