package Basico.Condicoes;

public class ifEElse {
    public static void main(String[] args) {
    /*
    * IF, ELSE e ELSE IF= Condiçoes
    * objetivo: Passar o ninja de nivel de acordo com suas missoes feitas
    * */
        String nome = "Renan Uzumaki";
        int idade = 19;
        double altura = 1.84;
        long contaBancaria = 9999999;
        boolean hokage = false;
        short numeroDeMissoes = 61; // short para numeros pequenos
        String rank;

//        estrutura: se (condiçao) {faça isso}
        if (numeroDeMissoes <= 20) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes > 40 && numeroDeMissoes <= 60) {
            System.out.println("Rank: Junnin");
        } else {
            System.out.println("Rank: Guennin");
        }


    }
}
