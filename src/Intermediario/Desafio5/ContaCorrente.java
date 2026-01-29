package Intermediario.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, String titularDaConta, int numeroDaConta, TiposDeContas conta) {
        super(saldo, titularDaConta, numeroDaConta, conta);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depósito em conta corrente");
        System.out.println("Desposito feito com sucesso, R$" + valor + " foi depositado em sua conta");
        saldo += valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu Saldo é: R$" + saldo);
    }
}
