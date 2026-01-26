package Intermediario.Desafio1;

import java.util.Scanner;

public class InteraçaoMenu {

    // sempre colocar esses dados fora das funçoes, deixando a funcao apenas para fazer açoes com as informaçoes que estao fora

    int entrada = 0;
    int contador = 0;

    //puxando oq vou usar de outras classes:
    Ninja ninja = new Ninja();
    Missoes missoesCumpridas = new Missoes();
    Familias habilidadeEspecial = new Familias();

    public void InteragirComMenu(){

        Scanner scn = new Scanner(System.in);
        entrada = scn.nextInt();
         scn.nextLine();

        switch (entrada){
            case 1:
                System.out.println("========== Ninjas ==========");
                if (contador == 0) {
                    System.out.println("Nenhum ninja registrado até o momento!");
                } else {
                    for (int i = 0; i < contador; i++) {
                        System.out.println("nome: " + ninja.nome[i]);
                        System.out.println("idade: " + ninja.idade[i]);
                        System.out.println("missoes concluidas: ");
                        if (ninja.idade[i] >= 18){
                            for (int j = 0; j < 4; j++) {
                                missoesCumpridas.GuardarMissoes();
                                System.out.println(missoesCumpridas.missao[j]);
                            }
                        } else {
                            for (int j = 0; j < 2; j++) {
                                System.out.println(missoesCumpridas.missao[j]);
                            }
                        }
                        System.out.println("====================");
                    }
                }
                break;

            case 2:
                if (contador < ninja.maximoDeNinjas) {
                    System.out.println("----- Bem vindo ao sistema de cadastro de ninjas -----");
                    System.out.println("Digite o nome do ninja: ");
                    String digitarNome = scn.nextLine();
                    ninja.nome[contador] = digitarNome;
                    System.out.println("Digite a idade do ninja: ");
                    int digitarIdade = scn.nextInt();
                    ninja.idade[contador] = digitarIdade;
                    contador++;
                    break;
                } else {
                    System.out.println("numero maximo de ninjas alcançado");
                }

            case 3:
                System.out.println("Funçao indisponível no momento");
                break;

            case 4:
                System.out.println("Fechando programa...\nTchau!");
                break;

            default:
                System.out.println("Opçao inválida, digite uma opçao existente no menu");
                break;
        }
    }
}
