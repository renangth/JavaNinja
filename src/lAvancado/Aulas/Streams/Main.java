package lAvancado.Aulas.Streams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke", "Konoha", 22));
        ninjas.add(new Ninja("Sakura", "Konoha", 19));
        ninjas.add(new Ninja("Kakashi", "Konoha", 32));
        ninjas.add(new Ninja("Gaara", "Suna", 25));
        ninjas.add(new Ninja("Temari", "Suna", 20));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 50));

        // Ordenando por idade usando stream
        System.out.println("===== Ninjas em ordem de idade =====");
        ninjas.stream()
                .sorted((n1,n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        System.out.println("===== Ninjas de Konoha =====");

        //Filtrando os ninjas que sao de Konoha
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha"))
                        .forEach(System.out::println);

        // Filtrando por ordem alfabética
        System.out.println("===== Ninjas em ordem alfabética =====");
        ninjas.stream()
                .sorted((n1, n2) -> String.CASE_INSENSITIVE_ORDER.compare(n1.getNome(), n2.getNome()))
                .forEach(System.out::println);


    }
}
