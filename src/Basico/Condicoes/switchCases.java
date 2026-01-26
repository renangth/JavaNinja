package Basico.Condicoes;

import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {
        // Pedir pra o usuário:
        Scanner entrada = new Scanner(System.in);

        // Mostrar opçoes ao usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Gaara");
        System.out.println("4 - Pain");

        // Pedir para o usuário escolher umas das opçoes
        int escolhaDoUsuário = entrada.nextInt();

        System.out.println("Voce digitou: " + escolhaDoUsuário);

        // Mostrar para o usuário a reaçao ao escolher um ninja
        switch (escolhaDoUsuário) {
            case 1:
                System.out.println("Parabéns, voce é o Narutinho!");
                break;
            case 2:
                System.out.println("Parabéns, voce é o Sasuke!");
                break;
            case 3:
                System.out.println("Parabéns, voce é o Gaara!");
                break;
            case 4:
                System.out.println("Parabéns, voce é o Pain!");
                break;
            default:
                System.out.println("Número inexistente, escolha algum dos 4 personagens!");
        }




        entrada.close();
    }
}
