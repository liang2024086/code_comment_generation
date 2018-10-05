package methodEmbedding.Standing_Ovation.S.LYD442;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aswin
 */
public class StandingOvation {
    public static void main(String args[]) throws IOException{
        BufferedReader b = new BufferedReader( new InputStreamReader( System.in ) );
        int t = Integer.parseInt(b.readLine().replace(" ", ""));
        int caseCount = 1;
        //PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
   
        while(t--!=0){
            //int n = Integer.parseInt(b.readLine());
            String inputString = b.readLine();
            int ans = 0;
            int temp,count = 0;
            for(int i=0;i<inputString.length()-2;i++){
                temp = (int)(inputString.charAt(i+2) - '0');
                if(count<i){
                    ans += i-count;
                    count += i-count;
                }
                count += temp;
            }
            System.out.println("Case #"+caseCount+": "+ans);
            //writer.println("Case #"+caseCount+": "+ans);
            caseCount++;
        }
        
        //writer.close();
    }
}
