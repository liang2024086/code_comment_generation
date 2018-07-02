package methodEmbedding.Standing_Ovation.S.LYD1402;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        
        for(int x=0;x<t;x++){
            int m=in.nextInt();
            int count=0,sum=0;
           int a=in.nextInt();
            
            int [] c=new int[m+1]; int [] j=new int[m+1];
            for(int i=0;i<=m;i++){                
               c[m-i]=a%10;
               a/=10;
            } 
            for(int i=0;i<=m;i++){
                sum=sum+c[i];
                if(sum<=i){count++;sum++;}
                j[i]=sum;
               // System.out.println("c-"+c[i]+" i-"+i+" j-"+j[i]);
              
            } 
            
             
            System.out.printf("Case #%d: %d\n",x+1,count);
        }
        
    }

  
}
