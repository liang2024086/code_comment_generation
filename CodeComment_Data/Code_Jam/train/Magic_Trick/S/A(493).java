package methodEmbedding.Magic_Trick.S.LYD569;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zaman
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            BufferedReader buf = new BufferedReader(new FileReader("A-small-attempt2.in"));
            BufferedWriter wr = new BufferedWriter(new FileWriter("A-small-attempt2.out"));
            int testCases = Integer.parseInt(buf.readLine());
            for (int j = 1; j <= testCases; j++) {
                // String string = args[j];
                int firstChoice = Integer.parseInt(buf.readLine());
                String firstSet[] = null;
                //System.out.println("" + firstChoice);
                for (int i = 1; i < 5; i++) {
                    if (i == firstChoice) {
                        firstSet = buf.readLine().split(" ");
                    } else {
                        buf.readLine();
                    }
                }
                firstChoice = Integer.parseInt(buf.readLine());
                //System.out.println("" + firstChoice);
                String secondSet[] = null;
                for (int i = 1; i < 5; i++) {
                    if (i == firstChoice) {
                        secondSet = buf.readLine().split(" ");
                    } else {
                        buf.readLine();
                    }
                }
                Boolean found = false;
                int f = 0;
                String guess = "";
              /*  for (int i = 0; i < 4; i++) {
                    System.out.print("" + firstSet[i] + " ");

                }
                System.out.println("");
                for (int i = 0; i < 4; i++) {
                    System.out.print("" + secondSet[i] + " ");

                }*/
               wr.write("Case #" + j + ": ");
                for (int i = 0; i < 4; i++) {

                    for (int k = 0; k < 4; k++) {
                        if (firstSet[i].equals(secondSet[k])) {
                            if (found == false) {
                                found = true;
                                guess = firstSet[i];
                                //System.out.println("ok");
                            } else {
                                f = 1;
                                break;
                            }
                        }
                        if (f == 1) {
                            break;
                        }
                    }
                }
                if (found == false) {
                    wr.write("Volunteer cheated!");
                } else if(f == 0){
                    wr.write("" + guess);
                } else if(f == 1){
                    wr.write("Bad magician!");
                }
               wr.newLine();
            }
            wr.flush();
            wr.close();
        } catch (Exception ex) {
            //    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }


    }
}
