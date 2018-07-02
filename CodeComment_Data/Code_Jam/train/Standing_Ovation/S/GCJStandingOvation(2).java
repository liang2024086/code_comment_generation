package methodEmbedding.Standing_Ovation.S.LYD950;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author MeanMachine
 */
public class GCJStandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\MeanMachine\\Downloads\\A-small-attempt0.in"));
        PrintWriter out = new PrintWriter("C:\\Users\\MeanMachine\\Downloads\\A-small-attempt0.out");

        int T = in.nextInt();
        for (int cas = 1; cas <= T; cas++) {
            out.print("Case #" + cas + ": ");
            
            int sMax=in.nextInt();
            String kthS=in.next();
            int [] kth=new int[sMax+1];
            
            for(int i=0;i<kth.length;i++){
                kth[i]=Character.getNumericValue(kthS.charAt(i));
            }
            
            int count=kth[0];
            int needed=0;
            
            for(int i=1;i<kth.length;i++){
                if(count<i){
                    
                    needed+=i-count;
                    count+=kth[i]+i-count;
                }
                else{
                    count+=kth[i];
                }
            }
            out.println(needed);
            
        }
        in.close();
        out.close();

    }

}
