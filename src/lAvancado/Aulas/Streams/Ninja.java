package lAvancado.Aulas.Streams;

public class Ninja {
    private String nome;
    private String vila;
    private int idade;

    public String getNome(){
        return nome;
    }

    public String getVila(){
        return vila;
    }

    public int getIdade(){
        return idade;
    }

    public Ninja(String nome, String vila, int idade) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | " + "Idade: " + getIdade() + " | " + "Vila: " + getVila();
    }
}
