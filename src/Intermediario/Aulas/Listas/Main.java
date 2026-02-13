package Intermediario.Aulas.Listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array
        // Sao estaticos, nao aumentam de tamanho

        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        // Listas
        // Listas nao sao estaticas, podem aumentar e diminuir
        List<String> ninjaLista = new ArrayList<>();
        ninjaLista.add ("Naruto");
        System.out.println("===== Lista nao atualizada =====");
        System.out.println(ninjaLista.size());
        System.out.println("===== lista atualizada =====");
        ninjaLista.set(0,"Sasuke");
        System.out.println(ninjaLista);

    }
}
