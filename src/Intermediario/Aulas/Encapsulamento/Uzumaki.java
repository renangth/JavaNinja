package Intermediario.Aulas.Encapsulamento;

public class Uzumaki extends Ninja implements interfaceNinja{

    public Uzumaki() {

    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, altura);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + "\nAldeia: " + getAldeia() + "\nIdade: " + getIdade() + "\nNumero De Missoes: " + getNumeroDeMissoesConcluidas() + "\nAltura: " + getAltura());
    }
}
