package methodEmbedding.Revenge_of_the_Pancakes.S.LYD128;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author xxx
 */
public class pancake {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int T= in.nextInt();
        
        for (int t = 1; t <= T; t++) {
         
            String s= in.next();
            String[] str = s.split("");
            
            String type="";
            int f=0;
            
            for (int i = 0; i < str.length-1; i++) {
                String cur = str[i];
                String nex= str[i+1];
                
                if(!cur.equals(nex)){
                    
                    
                    for (int j = 0; j < i+1; j++) {
                        str[j]=nex;
                    }
                    
                    i=0;
                    f++;
                }
                
                
            }
            
            if(str[str.length-1].equals("-")){
               
                f++;
            }
                
            
            
            
            System.out.println("Case #"+t+": "+f);
            
            
        }
    
    }
    
}
