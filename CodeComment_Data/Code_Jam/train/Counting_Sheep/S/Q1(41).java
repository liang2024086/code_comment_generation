package methodEmbedding.Counting_Sheep.S.LYD194;

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
 * @author asdf
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner (new File ("input.in"));
        PrintWriter p = new PrintWriter("output.in");  
        int test = scan.nextInt();
        for(int t = 0 ; t < test ; t++)
        {
            long n  = scan.nextLong();
            boolean[] checkoccur = new boolean[10];
            long number = n; 
            if(n == 0 ) p.println("Case #" + (t+1) + ": INSOMNIA");
            else
            {
                boolean finish = false;
                for(int k = 1 ; !finish ; k++)
                {
                    number = (long) ((long)k * n) ;
                    String x = Long.toString(number);
                    if(checkoccur[0]==false && x.contains("0")) checkoccur[0] = true;
                    if(checkoccur[1]==false && x.contains("1")) checkoccur[1] = true;
                    if(checkoccur[2]==false && x.contains("2")) checkoccur[2] = true;
                    if(checkoccur[3]==false && x.contains("3")) checkoccur[3] = true;
                    if(checkoccur[4]==false && x.contains("4")) checkoccur[4] = true;
                    if(checkoccur[5]==false && x.contains("5")) checkoccur[5] = true;
                    if(checkoccur[6]==false && x.contains("6")) checkoccur[6] = true;
                    if(checkoccur[7]==false && x.contains("7")) checkoccur[7] = true;
                    if(checkoccur[8]==false && x.contains("8")) checkoccur[8] = true;
                    if(checkoccur[9]==false && x.contains("9")) checkoccur[9] = true;
                    
                    finish = true;
                    for(int l = 0 ; l < 10 ; l++ )
                        if(checkoccur[l]==false)
                            finish = false;
                }
                p.println("Case #" + (t+1) + ": " + Long.toString(number));
               
            }
            
        }
        p.close();
    }
    
}
