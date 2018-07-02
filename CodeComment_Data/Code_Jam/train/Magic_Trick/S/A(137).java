package methodEmbedding.Magic_Trick.S.LYD55;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Gary
 */
public class A {
    
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt(), res1 = 0, res2 = 0, dum = 0, resF = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for (int i = 0; i < t; i++) {
            res1 = s.nextInt();
            for (int j = 1; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    if (j == res1){
                        pq.add(s.nextInt());
                    }else{
                        dum = s.nextInt();
                    }
                }
            }
            
            res2 = s.nextInt();
            res1 = 0;
            for (int j = 1; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    dum = s.nextInt();
                    if (j == res2 && pq.contains(dum)){
                        res1 ++;
                        resF = dum;
                    }
                }
            }
            
            if( res1 == 1) System.out.println("Case #" + (i + 1) + ": " + resF);
            else if (res1 == 0) System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
            else System.out.println("Case #" + (i + 1) + ": Bad magician!");
            
            pq.clear();
            
            
        }
        
        
        
        
        
    }
    
    
}
