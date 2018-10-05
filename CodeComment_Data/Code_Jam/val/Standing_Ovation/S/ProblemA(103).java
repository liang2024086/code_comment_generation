package methodEmbedding.Standing_Ovation.S.LYD677;

import java.io.*;
import java.math.BigInteger;
/**
 *
 * @author Nibal
 */
public class ProblemA {

    public static void main(String[] args) throws  IOException {
        // TODO code application logic here
        int n, needed,sum,sMax,currentS;  
        String caseS="",sS ="";
        
        //InputStream is = new FileInputStream("input.txt");
        FileReader fr = new FileReader("A-small-attempt0.in");
        BufferedReader br = new BufferedReader(fr);
        n = Integer.parseInt(br.readLine());      
        //OutputStream os = new FileOutputStream("output.txt");
        //FileWriter fw = new FileWriter("output.txt");
       // BufferedWriter bw = new BufferedWriter(fw);
        
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

        
        for(int j = 0 ; j < n; j++)
        {
            needed = sum = sMax = currentS = 0;
            caseS = sS = "";
            caseS = br.readLine();
            sMax = Integer.parseInt(caseS.split(" ")[0]);
            sS = caseS.split(" ")[1];
            for(int i =0; i <= sMax; i++)
            {
                currentS = Integer.parseInt(String.valueOf(sS.charAt(i)));
                if(sum < i && currentS != 0)
                {
                    needed += (i - sum);
                    sum += currentS + needed;
                }
                else
                    sum += currentS;               
            }
            //System.out.println("Case #" + (j+1) + ": " + needed);
            
            //fw.write("Case #" + (j+1) + ": " + needed + "\n");
            //fw.close();
            writer.println("Case #" + (j+1) + ": " + needed);
           
            
        }
        
        writer.close();
        
        
        
    }
    
}
