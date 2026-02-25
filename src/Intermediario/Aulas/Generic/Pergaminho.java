package Intermediario.Aulas.Generic;

public class Pergaminho {
    private String conteudo;

    public Pergaminho(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getPergaminho() {
        return conteudo;
    }

    public void setPergaminho(String conteudo) {
        this.conteudo = conteudo;
    }

    public String toString(){
        return "Pergaminho: " + conteudo;
    }
}
