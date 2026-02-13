package Intermediario.Aulas.Encapsulamento;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;

    // metodo para mostrar mais informaçoes

    public void exibirDetalhes() {
        System.out.println("Missao: " + nome + " Rank: " + rank);
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }
}
