package Basico.ArrayMultidimensional;

import java.sql.Array;

public class testandoMatrizes {
    public static void main(String[] args) {

        String[][] turmasAlunos = new String[3][3];

        turmasAlunos[0][0] = "3 b redes:";
        turmasAlunos[0][1] = "Renan";
        turmasAlunos[0][2] = "Marcello";

        turmasAlunos[1][0] = "3 b adm:";
        turmasAlunos[1][1] = "Carol";
        turmasAlunos[1][2] = "Hanna";

        turmasAlunos[2][0] = "3 a redes:";
        turmasAlunos[2][1] = "Igor";
        turmasAlunos[2][2] = "Joao Paulo";

        for (int i = 0; i < turmasAlunos.length; i++) {
            System.out.println(turmasAlunos[i][0]);
            for (int j = 1; j < turmasAlunos[i].length; j++) {
                System.out.println("-" + turmasAlunos[i][j]);
            }
        }


        // maneira correta de printar uma matriz:
        String[][] matriz = new String[6][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("X" + " ");
            }
            System.out.println();
        }


    }

    }
