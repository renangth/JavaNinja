package Intermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(double saldo, String titularDaConta, int numeroDaConta, TiposDeContas conta) {
        super(saldo, titularDaConta, numeroDaConta, conta);
    }

    @Override
    public void depositar(double valor) {
        double porcetagem = valor * (1.0 / 100.0);
        double valorFinal = valor - porcetagem;
        System.out.println("Depósito em conta poupança, desconto de 1% no valor original");
        System.out.println("Desposito feito com sucesso, R$" + valor + " foi depositado em sua conta");
        saldo += valorFinal;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu Saldo é: R$" + saldo);
    }
}
