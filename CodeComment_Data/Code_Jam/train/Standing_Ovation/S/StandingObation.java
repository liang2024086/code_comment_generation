package methodEmbedding.Standing_Ovation.S.LYD424;

import java.util.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay Kumar
 */
public class StandingObation {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int m=0;m<t;m++){
            int smax = in.nextInt();
            String inp = in.next();
            int count=0;
            int stand =0;
            int max = -1;
           
            for(int i=1;i<inp.length();i++){
                stand = stand+(inp.charAt(i-1) -'0');
                if(inp.charAt(i)!=0 && i>stand){
                    count = (i-stand);
                    if(count>max){
                        max=count;
                    }
                }
                
            }
            if(max == -1){
                System.out.println("Case #"+(m+1)+": "+count);
            }
            else{
                System.out.println("Case #"+(m+1)+": "+max);
            }
            
        }
    }
}
