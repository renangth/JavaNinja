package Intermediario.Desafio2;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;


    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void MostrarInformacoes() {
        System.out.println("nome: " + nome + "\n" + "idade: " + idade + "\n" + "habilidade: " + habilidade);

    }

    @Override
    public void ExecutarHabilidades() {
        System.out.println("Voce é um ninja básico, por isso nao possui habilidade especial!");

    }
}
