package Basico.Condicoes;

import java.util.Scanner;

public class atividadeGpt2 {
    public static void main(String[] args) {

        /*
        * programa que pega numeros, fala a quantidade de numeros registrados, a quantidade de pares e impares.
        * crio variáveis contadoras para contar a quantidade total, os pares e os impares
        * uso scanner fora do laço para pegar o primeiro numero, pois, se o primeiro numero já for negativo, o programa encerra sem entrar no laço
        * crio um laço com while, para que, enquanto o numero for positivo, o programa funcione normalmente (só vai parar se o numero for negativo)
        * dentro do laço, começo aumentando as variaveis contadoras antes de usar outro scanner, pois, é preciso contar com o primeiro numero digitado, caso o contrário, só iria contar os numeros depois do segundo
        * uso condicionais para testar se o resto da divisao do numero digitado por 2 é 0, se for, o numero é par, se nao, o numero é impar
        * uso o msm scanner para pegar novos numeros.*/

        Scanner scn = new Scanner(System.in);
        int qtdNumeros = 0;
        int qtdPares = 0;
        int qtdImpares = 0;
        System.out.println("Digite um número: ");
        int entrada = scn.nextInt();

        while (entrada >= 0) {
            qtdNumeros++;
            if (entrada % 2 == 0){
                qtdPares++;
            } else {
                qtdImpares++;
            }
            System.out.println("Digite um número: ");
            entrada = scn.nextInt();
        }
        System.out.println("Quantidade total: " + qtdNumeros);
        System.out.println("Pares: " + qtdPares);
        System.out.println("Ímpares: " + qtdImpares);
        scn.close();

    }
}
