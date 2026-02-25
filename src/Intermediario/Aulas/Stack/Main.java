package Intermediario.Aulas.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main(String[] args) {

        // Array
        // Sao estaticos e tem ref de memoria
        String[] ninjasArray = new String[3];
        // adciconando elemento a um array:
        ninjasArray[1] = "narutoArray";

        // Lista
        // Sao dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        // adicionando elemento a uma list
        ninjasList.add("narutoList");

        // Stack
        // o ultimo elemento que entrou vai ser o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("narutoStack");
        ninjaStack.push("sasukeStack");
        ninjaStack.push("sakuraStack");
        System.out.println("minha stack atual: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("minha stack atualizada com pop: " + ninjaStack);
        System.out.println("proximo elemento da minhas stack: " + ninjaStack.peek());
        System.out.println("tamanho da stack: " + ninjaStack.size());
        System.out.println(ninjaStack.peek());
        ninjaStack.pop();
        ninjaStack.pop();
        System.out.println(ninjaStack);
        ninjaStack.pop();

    }
}
