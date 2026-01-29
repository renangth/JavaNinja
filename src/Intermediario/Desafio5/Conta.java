package Intermediario.Desafio5;

public interface Conta {

    //método para consultar saldo:
    void consultarSaldo();

    //metodo para depositar:
    abstract void depositar(double valor);

    //metodo para sacar
    boolean sacar(double valor);

    //metodo para transferir
    boolean transferir(double valor, ContaBancaria contaDestino);

}
