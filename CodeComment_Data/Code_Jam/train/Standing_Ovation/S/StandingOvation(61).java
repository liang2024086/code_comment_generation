package methodEmbedding.Standing_Ovation.S.LYD1920;

import java.util.*;
import java.io.*;

public class StandingOvation{
    public static void main(String[] argv) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException{
        //System.out.println("Ana are mere");
            
        Scanner sc = new Scanner(new File("/Users/alexpeptan/Google Code Jam/standing_ex.txt"));
        PrintWriter writer = new PrintWriter("/Users/alexpeptan/Google Code Jam/output.txt", "UTF-8");
        int n = 0;
        if(sc.hasNextInt()){
            n = sc.nextInt(); 
        }
        int[] m = new int[n];
        
        for(int i=0; i<n; i++){
            m[i] = sc.nextInt();
            String rest = sc.nextLine().trim();
            
            int added = 0;
            int nr = Integer.valueOf(rest.charAt(0) - '0');
            //System.out.println(" i=" + i);
            //System.out.println(" nr=" + nr);
            for(int j=1; j<=m[i]; j++){
                //System.out.print(" j=" + j);
                int toAdd = j - nr;
                //System.out.println(" toAdd=" + toAdd);
                if(toAdd > 0){
                    added += toAdd;
                    nr += toAdd;
                }
                nr += Integer.valueOf(rest.charAt(j) - '0');
                //System.out.println(" nr=" + nr);
            }
            
            writer.println("Case #" + (i+1) + ": " + added);
            //System.out.println("Case #" + (i+1) + ": " + added);
        }
        writer.close();
    }
}
