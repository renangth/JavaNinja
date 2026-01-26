package Intermediario.Aulas.AbstracaoEPolimorfismo;

public class Hatake extends Ninja implements SharinganInterface, NinjaDeElite {

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": eu sou da Anbu!");
    }

    @Override
    public void SharinganAtivado() {
        System.out.println(nome + ": Sharingan ativado!");
    }
}
