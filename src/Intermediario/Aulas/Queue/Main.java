package Intermediario.Aulas.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        System.out.println(ninjasQueue);
        ninjasQueue.poll();
        System.out.println(ninjasQueue);
    }
}
