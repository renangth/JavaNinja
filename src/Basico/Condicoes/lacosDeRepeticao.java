package Basico.Condicoes;

public class lacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * laços de repetiçao: vao repetir infinitamente ou enquanto vc quiser
        * while = for
        * */
//        while = enquanto for verdadeiro
//        while  (condiçao) {tudo vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("o naruto fez um clone das sombras " + numeroDeClones);
        }*/
//        FOR

        for (int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.println("naruto fez o clone " + (i + 1));

        }
    }
}
