package methodEmbedding.Counting_Sheep.S.LYD905;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niro
 */
import java.util.*;
public class CountingSheep {
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        int T= in.nextInt();
        
        for (int t = 1; t <= T; t++) {
            
            int N= in.nextInt();
            
            if(N==0){
                System.out.println("Case #"+t+": INSOMNIA");
            }
            else{
               HashSet<Integer> s= new HashSet<Integer>();
            int i=0;
            int num=N;
            while (true) {                
               
                int[] digit= Integer.toString(num).chars().map(c -> c-='0').toArray();
                for (int j = 0; j < digit.length; j++) {
                    int e = digit[j];
                    s.add(e);
                    //System.out.println(s);
                }
               
                if(s.size()==10){
                    System.out.println("Case #"+t+": "+num);
                    break;
                }
                else{
                    i++;
                    num=N*i;
                    //System.out.println("now i and N :"+i+":"+N);
                }
                 
            }
            
                
            }
            
        }
    }

    
}
