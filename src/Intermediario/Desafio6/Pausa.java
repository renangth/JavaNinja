package Intermediario.Desafio6;

public class Pausa {

    public static void pause(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}