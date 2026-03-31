package Intermediario.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Ninja> ninjas = new LinkedList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        ninjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        ninjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        ninjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        ninjas.add(new Ninja("Gaara", 17, "Areia"));
        ninjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        ninjas.add(new Ninja("Temari", 18, "Areia"));

        System.out.println("========== Essa é a lista atual de ninjas ==========");
        for(Ninja ninja : ninjas) {
            System.out.println(ninja);
        }

        //adicionando variável contadora para organizar o menu
        int cont = 0;
        // contagem de ninjas na lista
        int ninjasCont = ninjas.size();

        while (cont != 4) {
            System.out.println("===== Menu para alterações =====\n1- Remover o primeiro ninja da lista\n2- Adicionar um novo ninja no inicio\n3- Exibir a lista completa de ninjas\n4- Sair\n Contagem de ninja: " + ninjasCont);
            cont = sc.nextInt();
            switch (cont) {
                case 1:
                    System.out.println("Removendo ninja...");
                    Pausa.pause(2000);
                    System.out.println("Ninja removido");
                    Pausa.pause(1000);
                    ninjas.removeFirst();
                    ninjasCont--;
                    break;
                case 2:
                    System.out.println("Escolha o nome do novo ninja: ");
                    sc.nextLine();
                    String nomeScanner = sc.nextLine();
                    System.out.println("Escolha a idade do novo ninja: ");
                    int idadeScanner = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Escolha a aldeia do novoo ninja: ");
                    String aldeiaScanner = sc.nextLine();
                    ninjas.addFirst(new Ninja(nomeScanner, idadeScanner, aldeiaScanner));
                    break;
                case 3:
                    System.out.println("========== Lista atualizada ==========");
                    for (Ninja ninja : ninjas){
                        System.out.println(ninja);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    Pausa.pause(2000);
                    cont = 4;
                    break;
            }
        }
    }
}