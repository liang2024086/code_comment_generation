package methodEmbedding.Standing_Ovation.S.LYD724;

import java.io.IOException;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
 
/**
 *
 * @author Akash
 */
 public class Main {
 
    
     public static void main(String[] args)throws IOException
     {
 
         
         Scanner in=new Scanner(System.in);
         
         try {

         int t,n,i,j;
         t=Integer.parseInt(in.nextLine());
         
         for(j=1;j<=t;j++)
         {
             String s=in.nextLine();
             
             long sum=0,ct=0;
             for(i=2;i<s.length();i++)
             {
                 if(i-2<=ct)
                 {
                     ct+=Integer.parseInt(s.substring(i, i+1));
                 }
                 else
                 {
                     if(Integer.parseInt(s.substring(i, i+1))!=0)
                     {
                        sum+=(i-2)-ct;
                        ct=(i-2)+Integer.parseInt(s.substring(i, i+1));
                     }
                     
                 }
                 // System.out.println(ct);
             }
             
             System.out.println("Case #"+j +": " +sum);
         }
         
         
         }catch(Exception e)
         {
             return;
         }
 
    }
 
     
    
 } 
