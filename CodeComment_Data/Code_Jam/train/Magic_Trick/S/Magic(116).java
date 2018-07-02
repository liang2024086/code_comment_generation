package methodEmbedding.Magic_Trick.S.LYD437;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Praneeth
 */
public class Magic {

    public static void main(String[] args) {
        {
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter("out.txt"));
            } catch (IOException ex) {
                Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Scanner sc = new Scanner(new File("test.txt"));
                int cases = Integer.valueOf(sc.nextLine());
                for (int i = 0; i < cases; i++) {
                    int row1 = sc.nextInt();
                    String[] line1 = new String[4];
                    String[] line2 = new String[4];
                    String line = "";
                    for (int j = 0; j < 5; j++) {
                        line = sc.nextLine();
                        if (row1 == j) {
                            line1 = line.split(" ");
                        }
                    }
                    int row2 = sc.nextInt();
                    for (int j = 0; j < 5; j++) {
                        line = sc.nextLine();
                        if (row2 == j) {
                            line2 = line.split(" ");
                        }
                    }
                    int matches = 0;
                    String match = "";
                    for (int j = 0; j < line1.length; j++) {
                        for (int k = 0; k < line2.length; k++) {
                            if (line1[j].equals(line2[k])) {
                                matches++;
                                match = line1[j];
                            }
                        }
                    }

                    if (matches == 1) {
                        bw.write("Case #" + (i+1) + ": " + match );
                        bw.newLine();
                    } else if (matches == 0) {
                        bw.write("Case #" + (i+1) + ": " + "Volunteer cheated!");
                        bw.newLine();
                    } else {
                        bw.write("Case #" + (i+1) + ": " + "Bad magician!");
                        bw.newLine();
                    }
                   
                }
            } catch (IOException ex) {
                Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
