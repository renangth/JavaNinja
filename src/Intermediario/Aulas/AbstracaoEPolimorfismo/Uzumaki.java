package Intermediario.Aulas.AbstracaoEPolimorfismo;

public class Uzumaki extends Ninja {

    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println("meu nome é " + nome + " sou um uzumaki e minha estratégia de batalha é usar o fogo ao meu favor");;
    }

    @Override
    public void HabilidaeEspecial() {
        System.out.println("meu nome é " + nome + " sou um uzumaki e minha habilidade especial é a kunai de fogo");;
    }
}
