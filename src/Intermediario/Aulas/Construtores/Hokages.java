package Intermediario.Aulas.Construtores;

public class Hokages {
    String nome;
    int idade;
    String aldeia;
    int missoes;

    public Hokages() {

    }

    public Hokages(int missoes, String nome, int idade, String aldeia) {
        this.missoes = missoes;
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
}
