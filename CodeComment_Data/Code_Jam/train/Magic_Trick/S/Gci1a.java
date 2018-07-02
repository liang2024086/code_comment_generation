package methodEmbedding.Magic_Trick.S.LYD2110;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Joseph
 */
public class Gci1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Joseph\\Desktop\\A-small-attempt0.in"));
            String line = null;

            int TotalAmount = Integer.parseInt(reader.readLine());
            String[][] starting = new String[TotalAmount * 2][4];

            int row = 0;
            int ctr = 0;

            String output = "";

            while ((line = reader.readLine()) != null) {
                row = Integer.parseInt(line) - 1;

                for (int c = 0; c < 4; c++) {
                    line = reader.readLine();
                    for (int r = 0; r < 4; r++) {
                        if (c == row) {
                            starting[ctr][r] = line.split(" ")[r];
                        }
                    }
                }

                if ((ctr + 1) % 2 == 0) {
                    int numOfDuplicates = 0;
                    int lastDuplicate = 0;
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            //System.out.println(starting[ctr - 1][i] + ".." + starting[ctr][j]);
                            if (starting[ctr - 1][i].compareTo(starting[ctr][j]) == 0) {
                                numOfDuplicates++;
                                lastDuplicate = Integer.parseInt(starting[ctr - 1][i]);
                            }
                        }
                    }

                    output += "Case #" + Integer.toString((ctr + 1) / 2) + ": ";
                    if (numOfDuplicates == 0) {
                        output += "Volunteer cheated!\n";
                    } else if (numOfDuplicates == 1) {
                        output += Integer.toString(lastDuplicate) + "\n";
                    } else {
                        output += "Bad Magician!\n";
                    }
                }

                ctr++;
            }

            File file=new File("C:\\Users\\Joseph\\Desktop\\output.txt");
            FileWriter fw = new FileWriter(file, true);
            fw.append(output);
            fw.close();
            
            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
