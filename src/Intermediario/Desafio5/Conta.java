package Intermediario.Desafio5;

public interface Conta {

    //método para consultar saldo:
    public void consultarSaldo();

    //metodo para depositar:
    public abstract void depositar(double valor);

}
