package lAvancado.Aulas.BigO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ninjas> ninjas = new ArrayList<Ninjas>();
        ninjas.add(new Ninjas("Naruto", 18));
        ninjas.add(new Ninjas("Sasuke", 20));
        ninjas.add(new Ninjas("Sakura", 22));
        ninjas.add(new Ninjas("Hinata", 26));
        ninjas.add(new Ninjas("Kakashi", 28));

        // Algoritmo - o(1) - Complexidade Constante
        System.out.println(ninjas.get(2));

        //Algoritmo - o(n) - Complexidade Linear
        for (Ninjas ninja : ninjas) {
            System.out.println(ninjas);
        }

        System.out.println("================");

        // Algoritmo - o(n²) - Complexidade Quadratica
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size(); j++) {
                System.out.println(ninjas.get(i) + "vs" + ninjas.get(j));
            }
        }
    }
}

