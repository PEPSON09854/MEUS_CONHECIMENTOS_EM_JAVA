package one.digitalinovation;

import javax.swing.JOptionPane;

public class UncheckdException {

    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numeros: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);

                continueLooping = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, iforme um número inteiro!");

            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0!");

            } finally {

                System.out.println("Chegou no finally!");
            }

        } while (continueLooping);

    }

    public static int dividir(int a, int b) {
        return a / b;

    }
}
