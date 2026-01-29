package Intermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void depositar(double valor) {
        double valorFinal = valor - (1.0 / 100.0);
        System.out.println("Depósito em conta poupança, desconto de 1% no valor original");
        System.out.println("Desposito feito com sucesso, R$" + valor + " foi depositado em sua conta");
        saldo += valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu Saldo é: R$" + saldo);
    }
}
