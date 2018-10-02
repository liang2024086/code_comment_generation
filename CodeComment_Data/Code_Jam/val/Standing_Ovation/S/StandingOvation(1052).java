package methodEmbedding.Standing_Ovation.S.LYD1839;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
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
 * @author saopayne
 */
public class StandingOvation {

    public static void main(String[] args) {
        try {

            Reader reader = new FileReader("A-small-attempt3.in");
            BufferedReader bufReader = new BufferedReader(reader);
            String x = bufReader.readLine();
            int numOfTestCases = Integer.parseInt(x);

            File file = new File("small.out");
            FileWriter writer = new FileWriter(file);
            for (int i = 1; i <= numOfTestCases; i++) {
                String[] in = bufReader.readLine().split(" ");
                int S = Integer.parseInt(in[0]);
                String S1 = in[1];
                int[] arr = new int[S1.length()];
                for (int t = 0; t < S1.length(); t++) {
                    arr[t] = S1.charAt(t) - '0';
                }

                int s = 0;
                int ans = 0;
                
                for(int j = 0; j < arr.length; j++){
                   if(j > s){
                       ans += j-s;
                       s = j;
                   }
                   s += arr[j];
                }
                writer.write("Case #" + i + ": " + ans + "\n");


            }
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StandingOvation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StandingOvation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
