package Basico.Array;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        // array utilizado:
        int maximoNinjas = 10;
        String[] ninjas = new String[maximoNinjas];

        // criando um scanner:
        Scanner scn = new Scanner(System.in);

        // contadores:
        int qtdNinjas = 0;
        int opcao = 0;

        // enquanto opcao for diferente de 0, o programa inicia, ou seja, vai iniciar pq opcao = 0
        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: \n");
            int escolha = scn.nextInt();
            opcao = escolha;
            scn.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("===== Bem vindo(a) ao sistema de cadastro de ninjas =====\n");
                    if (qtdNinjas < maximoNinjas) {
                        System.out.println("Digite o nome do ninja que deseja cadastrar: ");
                        String nome = scn.nextLine();
                        ninjas[qtdNinjas] = nome;
                        qtdNinjas++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Nao foi possivel cadastrar, a lista está cheia!");
                    }
                    break;
                case 2:
                    if (qtdNinjas == 0){
                        System.out.println("Nenhum ninja registrado");
                    }else{
                        System.out.println("===== Lista de Ninjas =====");
                        for (int i = 0; i < qtdNinjas; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando programa...\nTchau!");
                    break;

                default:
                    System.out.println("Opcao indisponivel, tente utilizar uma opçao válida no menu");


            }
        }
    }
}
