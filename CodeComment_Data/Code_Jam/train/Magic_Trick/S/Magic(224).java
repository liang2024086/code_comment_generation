package methodEmbedding.Magic_Trick.S.LYD2147;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rahul
 */
public class Magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("/home/rahul/Documents/workspace/A-small-attempt0.in")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
        }

        String line = "";
        int cases = 0;
        int i = 1;
        boolean testCovered = false;
        StringBuilder sb = new StringBuilder();

        try {
            while ((line = br.readLine()) != null) {

                //read number of test cases
                if (!testCovered) {
                    cases = Integer.valueOf(line.trim());
                    testCovered = true;
                   
                }

                //for every test case
                while (i <= cases) {
                    int ques1 = 0;

                    //read question 1 value
                    line = br.readLine();
                    if (line != null) {
                        ques1 = Integer.valueOf(line.trim());
                    }

                    //forward the pointer to answer to question 1
                    for (int k = 1; k < ques1; k++) {
                        br.readLine();
                    }

                    //read the row of answer to qustion 1                    
                    String row1[] = null;
                    line = br.readLine();
                    if (line != null) {
                        row1 = line.split(" ");
                    }

                    //forward the pointer to question 1 value
                    for (int k = ques1; k < 4; k++) {
                        br.readLine();
                    }

                    //read question 2 value
                    int ques2 = 0;
                    line = br.readLine();
                    if (line != null) {
                        ques2 = Integer.valueOf(line.trim());
                    }

                    //forward the pointer to answer to question 2
                    for (int k = 1; k < ques2; k++) {
                        br.readLine();
                    }

                    //read the row of answer to qustion 2                    
                    String row2[] = null;
                    line = br.readLine();
                    if (line != null) {
                        row2 = line.split(" ");
                    }
                    
                    //forward the pointer to next test case
                    for (int k = ques2; k < 4; k++) {
                        br.readLine();
                    }

                    //check what is common in both the arrays
                    String common = "";
                    int count = 0;
                    for (int m = 0; m < 4; m++) {
                        for (int n = 0; n < 4; n++) {
                            if (row1[m].equals(row2[n])) {
                                common = row1[m];
                                count++;
                            }
                        }
                    }

                    //output the result
                    sb.append("Case #");
                    sb.append(i);
                    sb.append(": ");
                    if (count == 1) {
                        sb.append(common);
                    } else if (count > 1) {
                        sb.append("Bad magician!");
                    } else {
                        sb.append("Volunteer cheated!");
                    }

                    //loop var inc
                    i++;
                    sb.append("\n");
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter(
                        new File("/home/rahul/Documents/workspace/out.txt")));
                bw.write(sb.toString());
                bw.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Magic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
