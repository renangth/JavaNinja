package Intermediario.Aulas.AbstracaoEPolimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidos, Rank
    //TODO: Rank: Gennnin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoes;
    NIvelNInja rank;

    public Ninja() {
    }

    //metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos
    //sobrecarga de metódo nao precisa redeclarar o construtor so os novos atributos

    ////meotodo existente: Metodo Sobrecarregado
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, NIvelNInja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }


    //metodo geral (todo ninja vai ter):

    public void HabilidaeEspecial(){
        System.out.println(nome + ": Essa é a minha habilidade especial");
    }

    // sobreescrevendo o metodo da interface
    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println(nome + ": Minha estrtégia é o silencio, sou um ninja sorrateiro!");
    }

    // Metodo padrao - Inteligencia de Combate
    public void InteligenciaDeCombate() {
        System.out.println(nome + ": Essa é minha Inteligencia de combate!");
    }

    // Sobrecarga de metodo - Inteligencia de Combate
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
