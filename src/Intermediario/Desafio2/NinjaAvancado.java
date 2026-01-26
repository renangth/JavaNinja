package Intermediario.Desafio2;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String habilidadeEspecial;

    public NinjaAvancado(String nome , int idade, String habilidade, String habilidadeEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.habilidadeEspecial = habilidadeEspecial;
    }

  @Override
    public void ExecutarHabilidades() {
      System.out.println("habilidade especial ativada, " + habilidadeEspecial + " vai!!!!");
    }

    @Override
    public void MostrarInformacoes() {
        System.out.println("nome: " + nome + "\n" + "idade: " + idade + "\n" + "habilidade: " + habilidade);

    }
}
