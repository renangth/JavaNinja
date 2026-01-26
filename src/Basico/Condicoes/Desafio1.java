package Basico.Condicoes;

public class Desafio1 {
    public static void main(String[] args) {
        String ninja1 = "NARUTO";
        int idadeNinja1 = 20;

        String ninja2 = "SASSUKE";
        int idadeNinja2 = 14;

        String ninja3 = "PAIN";
        int idadeNinja3 = 30;

        String missao1 = "Lutar para proteger";
        char nivelMissao1 = 'B';
        String statusMissao1 = "Indefinido";

        String missao2 = "Limpando o salao";
        char nivelMissao2 = 'D';
        String statusMissao2 = "Indefinido";

        String missao3 = "Ativando o sharingan";
        char nivelMissao3 = 'A';
        String statusMissao3 = "Indefinido";

//        Ninja 1:
        if (idadeNinja1 >= 15) {
            System.out.println(ninja1 + ":");
            System.out.println("--------------------");
            statusMissao1 = "Concluido";
            statusMissao2 = "Concluido";
            statusMissao3 = "Concluido";
            System.out.println(missao1);
            System.out.println(statusMissao1);
            System.out.println(missao2);
            System.out.println(statusMissao2);
            System.out.println(missao3);
            System.out.println(statusMissao3);
            System.out.println("--------------------");

        } else {
            System.out.println(ninja1 + ":");
            System.out.println("--------------------");
            statusMissao1 = "Nao Concluido";
            statusMissao2 = "Concluido";
            statusMissao3 = "Nao Concluido";
            System.out.println(missao1);
            System.out.println(statusMissao1);
            System.out.println(missao2);
            System.out.println(statusMissao2);
            System.out.println(missao3);
            System.out.println(statusMissao3);
            System.out.println("--------------------");
        }
        // ninja 2:
        if (idadeNinja2 >= 15) {
            System.out.println(ninja2 + ":");
            System.out.println("--------------------");
            statusMissao1 = "Concluido";
            statusMissao2 = "Concluido";
            statusMissao3 = "Concluido";
            System.out.println(missao1);
            System.out.println(statusMissao1);
            System.out.println(missao2);
            System.out.println(statusMissao2);
            System.out.println(missao3);
            System.out.println(statusMissao3);
            System.out.println("--------------------");

        } else {
            System.out.println(ninja2 + ":");
            System.out.println("--------------------");
            statusMissao1 = "Nao Concluido";
            statusMissao2 = "Concluido";
            statusMissao3 = "Nao Concluido";
            System.out.println(missao1);
            System.out.println(statusMissao1);
            System.out.println(missao2);
            System.out.println(statusMissao2);
            System.out.println(missao3);
            System.out.println(statusMissao3);
            System.out.println("--------------------");

        }
        // ninja 3:
        if (idadeNinja3 >= 15) {
            System.out.println(ninja3 + ":");
            System.out.println("--------------------");
            statusMissao1 = "Concluido";
            statusMissao2 = "Concluido";
            statusMissao3 = "Concluido";
            System.out.println(missao1);
            System.out.println(statusMissao1);
            System.out.println(missao2);
            System.out.println(statusMissao2);
            System.out.println(missao3);
            System.out.println(statusMissao3);
            System.out.println("--------------------");

        } else {
            System.out.println(ninja3 + ":");
            System.out.println("--------------------");
            statusMissao1 = "Nao Concluido";
            statusMissao2 = "Concluido";
            statusMissao3 = "Nao Concluido";
            System.out.println(missao1);
            System.out.println(statusMissao1);
            System.out.println(missao2);
            System.out.println(statusMissao2);
            System.out.println(missao3);
            System.out.println(statusMissao3);
            System.out.println("--------------------");
        }
    }
}