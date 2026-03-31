package Intermediario.Desafio6;

public class Ninja {
    private String nome;
    private int idade;
    private String vila;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public String getVila() {
        return vila;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | " + "Idade: " + idade + " | " + "Vila: " + vila;
    }
}