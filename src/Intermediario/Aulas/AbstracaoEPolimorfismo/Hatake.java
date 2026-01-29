package Intermediario.Aulas.AbstracaoEPolimorfismo;

public class Hatake extends Ninja implements SharinganInterface, NinjaDeElite {

    public Hatake() {
        super();
    }

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoes, NIvelNInja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou da Anbu!");
    }

    @Override
    public void SharinganAtivado() {
        System.out.println(nome + ": Sharingan ativado!");
    }
}
