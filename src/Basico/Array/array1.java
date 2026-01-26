package Basico.Array;

public class array1 {
    public static void main(String[] args) {

        // Arrays sao tipo referencia
        // String inicializa como null
        String[] ninja = new String[6];
        ninja[0] = "naruto";
        ninja[1] = "sasuke";
        ninja[2] = "sakura";
        ninja[3] = "hinata";
        ninja[4] = "kakashi";
        System.out.println(ninja[0]);

        //redeclarando o Array:
        ninja = new String[7];
        ninja[0] = "renan";
        ninja[1] = "luidson";
        ninja[2] = "daniel";
        ninja[3] = "devison";
        ninja[4] = "wallison";
        ninja[5] = "aylson";
        ninja[6] = "marcello";

        // for para mostrar todos os ninjas
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);

        }
        //int incializa como 0
        int[] idade = new int[2];
        System.out.println(idade[1]);

        //Boolean inicializa como false
        boolean[] verdadeiroOuFalso = new boolean[2];
        System.out.println(verdadeiroOuFalso[1]);

        //Doubles inicializam como 0.0
        double[] flutuante = new double[2];
        System.out.println(flutuante[1]);


    }
}
