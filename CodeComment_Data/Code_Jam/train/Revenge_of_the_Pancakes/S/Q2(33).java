package methodEmbedding.Revenge_of_the_Pancakes.S.LYD34;

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
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner (new File("input.in"));
        PrintWriter p = new PrintWriter("output.in");  
        int test = scan.nextInt();
        for(int t = 0 ; t < test ; t++)
        {
               String s = scan.next();
               char[] x = s.toCharArray();
               int enIndex = 0;
               char symbol= x[0];
               int count = 0;
               while(enIndex != x.length )
               {
                   symbol = x[enIndex];
                   
                   while(enIndex < x.length && x[enIndex] == symbol) enIndex++;
                   
                   if( enIndex < x.length )
                   {
                       for(int k = enIndex - 1 ; k >= 0 ; k-- )
                           if(x[k] == '+') x[k] = '-';
                           else x[k] = '+';
                   }
                   else count--;
                   symbol = x[0];
                   count++;
               }
               if(symbol=='-')
                   count++;
              p.println("Case #" + (t+1) + ": " + count);
        }
        p.close();
    }
    
    
    
}
