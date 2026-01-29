package Intermediario.Desafio3;

public class Missoes {
    String missao[] = new String[4];
    String nivelDificuldade[] = new String[4];
    String statusMissao[] = new String[2];

    public void GuardarMissoes(){

        missao[0] = "Treinar Golpes Simples";
        missao[1] = "Treinar Golpes Complexos";
        missao[2] = "Desenvolver Habilidades Especiais";
        missao[3] = "Supremaciar Habilidades Especiais";

        nivelDificuldade[0] = "D";
        nivelDificuldade[1] = "C";
        nivelDificuldade[2] = "B";
        nivelDificuldade[3] = "A";

        statusMissao[0] = "concluido";
        statusMissao[1] = "nao concluido";
    }
}
