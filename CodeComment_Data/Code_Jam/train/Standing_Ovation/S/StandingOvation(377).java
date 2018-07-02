package methodEmbedding.Standing_Ovation.S.LYD1880;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author preetam
 */
public class StandingOvation {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        String inFN = "/home/preetam/Desktop/CodeJam2015/A-small-attempt0.in", 
                outFN = inFN.split("\\.")[0]+".out";
        BufferedReader br = new BufferedReader(new FileReader(inFN));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outFN));
        while(br.ready())
        {
            int t = Integer.parseInt(br.readLine());
            for(int i = 1; i <= t; i++)
            {
                char[] shyString = br.readLine().split(" ")[1].toCharArray();
                int frnd = 0;
                int total = 0;
                for(int j = 0; j < shyString.length; j++)
                {
                    if(total < j && shyString[j] > '0')
                    {
                        frnd += j - total;
                        total = j;
                    }
                    total += shyString[j]-'0';
                }
                bw.write("Case #"+i+": "+frnd+"\n");
                System.out.println("Case #"+i+": "+frnd);
            }
            bw.flush();
        }
    }
    
}
