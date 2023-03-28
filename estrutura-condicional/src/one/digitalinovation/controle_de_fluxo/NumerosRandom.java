package one.digitalinovation.controle_de_fluxo;

import java.util.Random;

public class NumerosRandom {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numberRandom = new int[20];

        for (int i = 0; i < numberRandom.length; i++) {

            int number = random.nextInt(100);
            numberRandom[i] = number;

        }

        System.out.print("\nNumeros aleatorios: ");
        for (int num : numberRandom) {
            System.out.print(num + " ");

        }

        System.out.print("\nNumeros sucessores aleatorios: ");
        for (int num : numberRandom) {
            System.out.print((num + 1) + " ");

        }

        System.out.print("\nNumeros antecessores aleatorios: ");

        for (int num : numberRandom) {
            System.out.print((num - 1) + " ");

        }

    }

}
