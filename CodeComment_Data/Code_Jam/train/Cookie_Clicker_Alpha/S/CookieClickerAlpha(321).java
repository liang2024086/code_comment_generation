package methodEmbedding.Cookie_Clicker_Alpha.S.LYD848;

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
import java.text.DecimalFormat;

/**
 *
 * @author Ameya
 */
public class CookieClickerAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int noOfCases, j, i;

        double c, f, x, timeTakenByFactory, timeTakenToReachFactory, baseRate = 2., totalTimeTaken,prevFactTime;
        double timeTakenForF[],result[];// each index of gives time taken to buy that many #factries
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("./src/googlecodejamproblemb/input.in");
            InputStreamReader isr = new InputStreamReader(fileInputStream);
            BufferedReader br = new BufferedReader(isr);

            String line = "";
            String input[] = null;
            line = br.readLine();
            noOfCases = Integer.parseInt(line);
            result = new double[noOfCases];


            for (i = 0; i < noOfCases; i++) {

                line = br.readLine();
                input = line.split(" ");

                c = Double.parseDouble(input[0]);
                f = Double.parseDouble(input[1]);
                x = Double.parseDouble(input[2]);
                int q=(int)Math.round(new Double((x/c)+2).doubleValue());
                timeTakenForF=new double[q];

                //result[i]=calculateMinTime(c,f,x,2.0,0.0);
                //Define intials
                timeTakenForF[0] = 0;
                j = 0;
                prevFactTime=x/baseRate;

                while (true) {

                    j++;
                    //Total taken time to reach the current factory
                    timeTakenToReachFactory = c / (baseRate + ((j - 1) * f)) + timeTakenForF[j - 1];

                    timeTakenByFactory = x / (baseRate + (j * f)); // Time taken by factory J

                    totalTimeTaken = timeTakenToReachFactory + timeTakenByFactory;
                    timeTakenForF[j]=timeTakenToReachFactory;
                    if(totalTimeTaken<prevFactTime)
                        prevFactTime=totalTimeTaken;
                    else
                        break;
                }
                result[i]=prevFactTime;
            }

             File file = new File("./src/googlecodejamproblemb/output1.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file);
            for (i = 0; i < result.length; i++) {
                DecimalFormat form = new DecimalFormat("0.0000000");
                out.println("Case #" + (i + 1) + ": " +form.format(result[i]));
                System.out.println("Case #" + (i + 1) + ": "+form.format(result[i]));
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
