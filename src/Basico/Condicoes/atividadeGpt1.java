package Basico.Condicoes;

import java.util.Scanner;

public class atividadeGpt1 {
    public static void main(String[] args) {

        /*
        * programa para ver quais numeros sao impares e quais sao pares
        * uso scanner para pegar um numero
        * uso for para exibir os numeros de 1 ao numero escolhido no scanner e especificar se é impar ou par.
        * fecho scanner
        * */

        Scanner scn = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int entrada = scn.nextInt();
        scn.close();

        for (int i = 1; i <= entrada; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par!");
            } else {
                System.out.println(i + " é impar!");
            }

        }

    }
}
