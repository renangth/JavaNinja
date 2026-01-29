package Intermediario.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        ContaCorrente contaRenan = new ContaCorrente(0.0);
        contaRenan.depositar(700);
        contaRenan.consultarSaldo();
    }
}
