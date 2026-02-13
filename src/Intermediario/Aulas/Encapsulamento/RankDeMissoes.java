package Intermediario.Aulas.Encapsulamento;

public enum RankDeMissoes {

    D("nivel baixissimo", 1),
    C("nivel baixo", 2),
    B("nivel medio", 3),
    A("nivel alto", 4),
    S("nivel altissimo", 5);

    private String descricap;
    private int dificuldade;

    RankDeMissoes(String descricap, int dificuldade) {
        this.descricap = descricap;
        this.dificuldade = dificuldade;
    }
}
