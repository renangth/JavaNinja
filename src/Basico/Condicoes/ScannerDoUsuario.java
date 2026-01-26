package Basico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        // Abrindo o scanner:
        Scanner caixaDeTexto = new Scanner(System.in);

        // Recebendo o nome do ninja:
        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Recebendo a idade do ninja:
        System.out.println("Digite a idade do ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja);

        // Fechar sempre o scanner
        caixaDeTexto.close();

//            Trabalhando com if:
        if (idadeDoNinja >= 18) {
            System.out.println(nomeDoNinja + " é maior de idade e pode fazer missoes fora da aldeia!");
        } else {
            System.out.println(nomeDoNinja + " nao é de maior, por isso precisa ficar em konoha!");
        }

    }
}
