package methodEmbedding.Standing_Ovation.S.LYD556;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author xxx
 */
public class NewClass1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for (int t = 1; t <= T; t++) {
            
            int max= in.nextInt();
            String s= in.next();
            String[] s1= s.split("");
            
            int[] a= new int[s1.length];
            
            for (int n = 0; n < s1.length; n++) {
                a[n]=Integer.parseInt(s1[n]);
            }
            
            //int[] sum = new int[a.length];
            //sum[0]=0;
            int sum=0;
            int count=0;
            for(int i=0;i<a.length;++i){
               if(sum>=i){
                   //no problem
                   sum=sum+a[i];
               }
               else{ 
                   count=count+(i-sum);
                   
                   sum=i+a[i];
                  
               }
                
                
            }
            
            
            System.out.println("Case #"+t+": "+count);
        }
    }
    
}
