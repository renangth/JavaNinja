package Intermediario.Desafio5;

public abstract class ContaBancaria implements Conta {

    double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

}
