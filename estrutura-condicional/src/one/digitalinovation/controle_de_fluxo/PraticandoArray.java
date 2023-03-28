package one.digitalinovation.controle_de_fluxo;

public class PraticandoArray {
    public static void main(String[] args) {

        int[] vetor = { 10, 20, 30, 40, 50 };

        System.out.print("Vetor ");
        int count = 0;
        while (count <= (vetor.length - 1)) {

            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nInverso ");

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }

}
