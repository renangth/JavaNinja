package Intermediario.Aulas.AbstracaoEPolimorfismo;

public class Uchiha extends Ninja implements SharinganInterface {

    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println("meu nome é " + nome + " sou um uchiha e minha estratégia de batalha é usar o vento ao meu favor");;
    }

    @Override
    public void HabilidaeEspecial() {
        System.out.println("meu nome é " + nome + " sou um uchiha e minha habilidade especial é a kunai de vento");
    }

    public void SharinganAtivado() {
        System.out.println(nome + ": Sharingan ativado!!");
    }
}
