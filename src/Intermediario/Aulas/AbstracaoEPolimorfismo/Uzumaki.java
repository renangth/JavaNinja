package Intermediario.Aulas.AbstracaoEPolimorfismo;

public class Uzumaki extends Ninja {

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, NIvelNInja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }


    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println(nome + ": Sou um uzumaki e minha estratégia de batalha é usar o fogo ao meu favor, já completei " + numeroDeMissoes + " missoes");;
    }

    @Override
    public void HabilidaeEspecial() {
        System.out.println(nome + ": Sou um uzumaki e minha habilidade especial é a kunai de fogo");;
    }
}
