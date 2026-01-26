package Basico.Condicoes;

import java.util.Scanner;

public class atividadeGpt3 {
    public static void main(String[] args) {
        /*
        * programa para pegar idades, ver quantas pessoas foram registradas, quantas sao de maior e quantas sao de menor
        * */

        int qtdTotal = 0;
        int qtdMaior = 0;
        int qtdMenor = 0;

        Scanner scn = new Scanner(System.in);
        System.out.println("digite a idade: ");
        int idade = scn.nextInt();

        while (idade > 0) {
            qtdTotal++;
            if (idade >= 18) {
                qtdMaior++;
            } else {
                qtdMenor++;
            }
            System.out.println("Digite a idade: ");
            idade = scn.nextInt();
        }
        System.out.println("Total de pessoas: " + qtdTotal);
        System.out.println("Menores de idade: " + qtdMenor) ;
        System.out.println("Maiores de idade: " + qtdMaior);
        scn.close();
    }
}
