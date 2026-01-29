package Intermediario.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        ContaCorrente conta1 = new ContaCorrente(0.0, "Renan", 1, TiposDeContas.CORRENTE);
        System.out.println(conta1);
        System.out.println("Quanto deseja depositar:");
        conta1.depositar(entrada.nextDouble());
        conta1.consultarSaldo();

        ContaPoupanca conta2 = new ContaPoupanca(0.0, "Daniel", 2, TiposDeContas.POUPANCA);
        System.out.println(conta2);
        System.out.println("Quanto deseja depositar:");
        conta2.depositar(entrada.nextDouble());
        conta2.consultarSaldo();

        System.out.println("Quanto deseja transferir: ");
        conta2.transferir(entrada.nextDouble(), conta1);
        System.out.println("Saldo atualizado conta 1: ");
        conta2.consultarSaldo();
        System.out.println("Saldo atualizado conta 2: ");
        conta1.consultarSaldo();
    }
}
