package methodEmbedding.Magic_Trick.S.LYD1667;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Ameya
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int noOfCases, j, i, ans1, ans2;

        int result[];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("./src/googlecodejamproblema/input.in");
            InputStreamReader isr = new InputStreamReader(fileInputStream);
            BufferedReader br = new BufferedReader(isr);

            String line = "";
            String input[], input2[];
            input = null;
            input2 = null;
            int inp2[] = new int[4];
            line = br.readLine();
            noOfCases = Integer.parseInt(line);
            result = new int[noOfCases];


            for (i = 0; i < noOfCases; i++) {
                ans1 = Integer.parseInt(br.readLine());
                for (j = 0; j < 4; j++) {
                    line = br.readLine();
                    if (j + 1 == ans1) {
                        input = line.split(" ");
                    }
                }
                ans2 = Integer.parseInt(br.readLine());
                for (j = 0; j < 4; j++) {
                    line = br.readLine();
                    if (j + 1 == ans2) {
                        input2 = line.split(" ");
                    }
                }

                //find common
                int count = 0;
                for (j = 0; j < 4; j++) {
                    inp2[j] = Integer.parseInt(input2[j]);
                }
                int temp = 0;
                for (int z = 0; z < 4; z++) {
                    int k = Integer.parseInt(input[z]);
                    for (j = 0; j < 4; j++) {
                        if (k == inp2[j]) {
                            count++;
                            temp = k;
                        }
                    }
                }
                //count of common no,s
                if (count == 0) {
                    result[i] = 0; // user cheated
                } else if (count == 1) {
                    result[i] = temp;// found the no.
                } else {
                    result[i] = 17; //Magicians bad
                }
            }

           
            File file = new File("./src/googlecodejamproblema/output1.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file);

            for (i = 0; i < result.length; i++) {
                switch (result[i]) {
                    case 0:
                        out.println("Case #" + (i + 1) + ": " + "Volunteer cheated!");
                        //System.out.println("Case #" + (i + 1) + ": " + "Volunteer cheated!");
                        break;
                    case 17:
                        out.println("Case #" + (i + 1) + ": " + "Bad magician!");
                        //System.out.println("Case #" + (i + 1) + ": " + "Bad magician!");
                        break;
                    default:
                        out.println("Case #" + (i + 1) + ": " + result[i]);
                        //System.out.println("Case #" + (i + 1) + ": " + result[i]);
                        break;
                }

            
            }
            out.close();
        } catch (IOException ex) {
            System.out.println(ex);

        } finally {
            try {
                fileInputStream.close();

            } catch (IOException ex) {
                System.out.println(ex);
            }
        }


    }
}
