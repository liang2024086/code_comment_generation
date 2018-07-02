package methodEmbedding.Magic_Trick.S.LYD862;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gaurav
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt2.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
        int cases = Integer.parseInt(br.readLine());
        int counter = 1;
        while(cases-- != 0){
            int n = Integer.parseInt(br.readLine());
            int[][] input = new int[4][4];
            for(int i = 0; i < 4 ; i++){
                String s[] = br.readLine().split(" ");
                for(int j = 0; j < 4 ; j++){
                    input[i][j] = Integer.parseInt(s[j]);
                }
            }

            int[][] output = new int[4][4];
            int m = Integer.parseInt(br.readLine());
            for(int j = 0; j < 4; j++){
                String[] s = br.readLine().split(" ");
                for(int k = 0 ; k < 4; k++){
                    output[j][k] = Integer.parseInt(s[k]);
                }
            }

            int matchcount = 0;
            int j = -1;
            for(int i = 0; i < 4; i++){
                for(int k = 0; k < 4; k++){
                    if(output[m - 1][i] == input[n - 1][k]){
                        matchcount++;
                        j = output[m - 1][i];
                    }
                }
            }
     
            if(matchcount == 0){
                out.write("Case #" +counter++ +": Volunteer cheated!");
            }else if(matchcount > 1){
                out.write("Case #" +counter++ +": Bad magician!");
            }else if(matchcount == 1){
                out.write("Case #" +counter++ +": "+Integer.toString(j));
            }
            out.newLine();
        }
        out.close();
    }
}
