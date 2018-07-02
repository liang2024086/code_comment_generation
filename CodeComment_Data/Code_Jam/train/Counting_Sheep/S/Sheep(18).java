package methodEmbedding.Counting_Sheep.S.LYD1268;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author H-Alice
 */
public class Sheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        long n;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i = 0; i < t; i++) {
                   ArrayList<Boolean> count = new ArrayList<>(Arrays.asList(false, false, false, false, false,false, false, false, false, false));
        int fin ;
                    n = sc.nextLong();
                   if(n == 0) System.out.println("Case #" +  (i + 1) +": INSOMNIA");
                   else{ 
                       
                       for(fin = 1; Collections.frequency(count, false) != 0; fin++) {
                           
                           for(long source = fin * n; source != 0; source /= 10) {
                               
                               count.set((int)source % 10, Boolean.TRUE);
                               
                           }
                           
                           
                       }
                       
                       
                       System.out.println("Case #" +  (i + 1) +": " + n * (fin-1));
                       
                   }
                   
                  

         
        }
            

        
    }
    
}
