package methodEmbedding.Magic_Trick.S.LYD906;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Malaka
 */
public class Magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream fstream = new FileInputStream("A-small-attempt0.in");

            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            while ((strLine = br.readLine()) != null) {
                int noOfTest = Integer.parseInt(strLine);
                for (int i = 0; i < noOfTest; i++) {
                    strLine = br.readLine();
                    int row = Integer.parseInt(strLine);
                    for (int j = 0; j < row; j++) {
                        strLine = br.readLine();
                    }
                    String[] guess = strLine.split(" ");
                    while (row < 4) {
                        row++;
                        strLine = br.readLine();
                    }
                    strLine = br.readLine();
                    row = Integer.parseInt(strLine);
                    for (int j = 0; j < row; j++) {
                        strLine = br.readLine();
                    }
                    String[] guess2 = strLine.split(" ");
                    while (row < 4) {
                        row++;
                        strLine = br.readLine();
                    }
                    int count = 0, number = 0;
                    for (int j = 0; j < guess.length; j++) {
                        for (int k = 0; k < guess2.length; k++) {
                            if (guess[j].equals(guess2[k])) {
                                count++;
                                number = Integer.parseInt(guess[j]);
                            }
                        }
                    }
                    System.out.print("Case #"+(i+1)+": ");
                    if (count == 1) {
                        System.out.println(number);
                    } else if (count > 1) {
                        System.out.println("Bad magician!");
                    } else if (count == 0) {
                        System.out.println("Volunteer cheated!");
                    }
                }
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
