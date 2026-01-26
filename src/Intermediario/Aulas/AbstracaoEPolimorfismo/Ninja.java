package Intermediario.Aulas.AbstracaoEPolimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    //metodo geral (todo ninja vai ter):

    public void HabilidaeEspecial(){
        System.out.println("meu nome é " + nome + " e esse é a minha habilidade especial");
    }

    // sobreescrevendo o metodo da interface
    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println("minha estrtégia é o silencio, sou um ninja sorrateiro!");
    }
}
