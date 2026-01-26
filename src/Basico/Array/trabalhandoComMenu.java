package Basico.Array;

import java.util.Scanner;

public class trabalhandoComMenu {
    public static void main(String[] args) {

        // criaçao da array:
        int maximoPessoas = 2; // definindo o máximo de pessoas que podem ser cadastradas
        String[] nome = new String[maximoPessoas];
        String[] pedidos = new String[maximoPessoas];
        String[] data = new String[maximoPessoas];

        // contadores:
        int qtdPessoas = 0;
        int opcao = 0;

        // abrindo o scanner:
        Scanner scn = new Scanner(System.in);

        // código principal:

        while (opcao != 3){ // o menu vai ser exibido pq opcao inicia com 0, ou seja, diferente de 3.

            // menu:
            System.out.println("\n===== Menu =====");
            System.out.println("1. Cadastrar Pedido");
            System.out.println("2. Listar Pedidos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scn.nextInt();
            scn.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("==== Bem vindo ao sistema de cadastro de pedidos!! =====");
                    if (qtdPessoas < maximoPessoas) {
                        System.out.println("Digite o nome do cliente que deseja cadastrar: ");
                         String cadastro = scn.nextLine();
                         nome[qtdPessoas] = cadastro;
                        System.out.println("Digite o seu pedido: ");
                        String digitarPedido = scn.nextLine();
                        pedidos[qtdPessoas] = digitarPedido;
                        System.out.println("Agora digite a data (Dia/Mes/Ano): ");
                        String digitarData = scn.nextLine();
                        data[qtdPessoas] = digitarData;
                         qtdPessoas++;
                        System.out.println("Pedido cadastrado com sucesso!");
                    } else {
                        System.out.println("Maximo de pedidos alcançado, voce nao pode mais cadastrar!");
                    }
                    break;

                case 2:
                    if (qtdPessoas == 0) {
                        System.out.println("Nenhum pedido resgistrado até o momento!");
                    }else {
                        System.out.println("==== Lista de pedidos ====");
                        for (int i = 0; i < qtdPessoas; i++) {
                            System.out.println(nome[i]);
                            System.out.println(pedidos[i]);
                            System.out.println("Data: " + data[i]);
                            System.out.println("====================");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Fechando o sistema...\nTchau!");
                    break;

                default:
                    System.out.println("Opcao inválida, digite alguma opcao aparente no menu");
            }

        }
    }
}
