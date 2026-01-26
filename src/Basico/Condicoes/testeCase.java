package Basico.Condicoes;

import java.util.Scanner;

public class testeCase {
  public static void main(String[] args) {
      // Abri o scanner
      Scanner entrada = new Scanner(System.in);

      // Menu:
      System.out.println("Escolha um personagem: \n1- Relampago Marquinhos\n2- Tarzan\n3- Timao e Pumba\n4- Luffy");

      // Usuário escolhe o número:
      int escolha = entrada.nextInt();

      // reaçoes:

      switch(escolha) {
          case 1:
              System.out.println("Katchau!");
              break;
          case 2:
              System.out.println("OOOOOOOOOOOO!");
              break;
          case 3:
              System.out.println("Hakuna Matata!");
              break;
          case 4:
              System.out.println("Gomu Gomu No!");
              break;
          default:
              System.out.println("deixa de ser burro meu irmao");
      }

      // Sempre fechar o scanner
      entrada.close();

  }
}
