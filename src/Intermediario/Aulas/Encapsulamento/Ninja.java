package Intermediario.Aulas.Encapsulamento;

public abstract class Ninja {
    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private double altura = 2.10;

    //construtores:

    public Ninja() {

    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    // tirar dados ou mostrar para o usuario eu uso o GET + NOME DA VARIAVEL

    public String getNome() {
        return nome; // retorna algo pq tem um tipo, se fosse void, nao retornava.
    }

    //setter recebe valores
    public void setNome(String nome) {  // passa como parametro oq quer adicionar
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // crinado getters and setters com ctrl + N, sem nome e altura que já foi criado:


    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }
}
