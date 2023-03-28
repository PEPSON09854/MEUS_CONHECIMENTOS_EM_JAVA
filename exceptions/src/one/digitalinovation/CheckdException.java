package one.digitalinovation;

import java.io.*;

import javax.swing.JOptionPane;

public class CheckdException {


    public static void main(String[] args) throws IOException {
        String nameFile = "";

        try {
            printFileConsole(nameFile);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir");
            e.printStackTrace();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");

        }finally{
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void printFileConsole(String nameFile) throws IOException {
        File file = new File(nameFile);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {

            bw.write(line);
            bw.newLine();
            line=br.readLine();

        } while (line != null);
        
        bw.flush();
        br.close();
        
    }
    
}
