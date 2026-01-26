package Basico.Condicoes;

import java.util.Random;
import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Random rand = new Random();
        // numero de 0 a 100 (coloca o limite de parametro no next in)
        int sorteio = rand.nextInt(101);
        System.out.println("o seu nivel de poder é: " + sorteio);
        String mensagem1 = (sorteio >= 50) ? "Voce é poderoso!" : "Voce é um merda!";
        System.out.println(mensagem1);

        Scanner entrada = new Scanner(System.in);
        System.out.println("escolhe: ");
        int escolha = entrada.nextInt();

        String mensagem = (escolha >= 10) ? "boa escolha" : "numero baixo demais";
        System.out.println(mensagem);

        entrada.close();

    }
}
