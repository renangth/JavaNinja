package Intermediario.Aulas.AbstracaoEPolimorfismo;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, NIvelNInja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println(nome + ": Sou um uchiha e minha estratégia de batalha é usar o vento ao meu favor, já completei " + numeroDeMissoes + " missoes");;
    }

    @Override
    public void HabilidaeEspecial() {
        System.out.println(nome + ": Sou um uchiha e minha habilidade especial é a kunai de vento");
    }

    public void SharinganAtivado() {
        System.out.println(nome + ": Sharingan ativado!!");
    }

    @Override
    public void InteligenciaDeCombate() {
        System.out.println(nome + ": Essa é minha Inteligencia de combate!");
    }

    @Override
    public void InteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e voce é um genio");
        } else if (qi >= 130){
            System.out.println("Seu QI é: " + qi + "e voce é um ninja promissor");
        } else {
            System.out.println("Sei QI é: " + qi + "e voce é burro pra carlho");
        }
    }
}
