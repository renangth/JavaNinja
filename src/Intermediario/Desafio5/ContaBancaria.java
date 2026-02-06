package Intermediario.Desafio5;

public abstract class ContaBancaria implements Conta {

    double saldo;
    String titularDaConta;
    int numeroDaConta;
    TiposDeContas conta;

    // construtor vazio
    public ContaBancaria() {
    }

    // primeiro construtor utilizado
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //construtor sobrecarregado
    public ContaBancaria(double saldo, String titularDaConta, int numeroDaConta, TiposDeContas conta) {
        this(saldo);
        this.titularDaConta = titularDaConta;
        this.numeroDaConta = numeroDaConta;
        this.conta = conta;
    }

    //to string pra facilitar na chamada da conta no main
    @Override
    public String toString() {
        return "Titular : " + titularDaConta + "\nNumero da conta: " + numeroDaConta + "\nTipo da conta : " + conta;
    }

    // usando o metodo de saque
    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Impossivel sacar um valor nulo ou negativo, tente sacar um valor acima de 0.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Erro ao sacar, saldo insuficiente.");
            return false;
        }

        saldo -= valor;
        return true;
    }

    // utilizando o metodo de transferencia

    @Override
    public boolean transferir(double valor, ContaBancaria contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferencia concluída!");
            return true;
        }
        System.out.println("Transferencia nao realizada!");
        return false;
    }
}
