package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1070;

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
public class Cake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        final int T = sc.nextInt();
        
        boolean first = true;
        
                    
        
        for(int i = 0; i < T; i++) {
            
            int change = 0;
            
            if(first) {
                         sc.nextLine(); 
                         first = false;
            }

            
            String s = sc.nextLine();
            

            
            if(s.length() > 0) {
             if(s.charAt(s.length() - 1) == '-') change++;   
            }
            
            
            for(int j = s.length() - 2; j >= 0; j--) {
                if(s.charAt(j) != s.charAt(j + 1)) change++;
            }
            
            System.out.println("Case #" + (i + 1) + ": " + change);
            
            
        }
        
        
        
    }
    
}
