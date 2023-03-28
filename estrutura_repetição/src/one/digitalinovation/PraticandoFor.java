package praticando.estrutura_repetição;

import java.util.Scanner;

public class PraticandoFor {
    
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.println("Tabuada: ");
            int tabuada = scan.nextInt();
            
            System.out.println("Tabuada de " + tabuada);
            for(int i = 1; i <= 10; i++){
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
            
        }
    }
}


