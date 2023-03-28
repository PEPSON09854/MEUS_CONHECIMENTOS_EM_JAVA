package one.digitalinovation.controle_de_fluxo;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] multi = new int[4][4];

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi.length; j++) {
                multi[i][j] = random.nextInt(9);

            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : multi) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");

            }

            System.out.println();
        }
    }
}
