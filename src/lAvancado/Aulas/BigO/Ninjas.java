package lAvancado.Aulas.BigO;

public class Ninjas {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Ninjas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninjas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
