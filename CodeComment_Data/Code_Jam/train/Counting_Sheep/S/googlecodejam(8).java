package methodEmbedding.Counting_Sheep.S.LYD216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class googlecodejam {
    
    
    public static void main(String as[])
    {
      Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
      Integer list[]={0,1,2,3,4,5,6,7,8,9};
      List<Integer> al;
      al=Arrays.asList(list);
      
      List<Integer> al1=new ArrayList<>();
      int c=1;
      int d=1;
       
      
      int t=in.nextInt();
      
      if(1<=t&&t<=100)
      {
          int number[]=new int[t];
        for(int i=0;i<t;i++)
        {
          number[i]=in.nextInt();
          if(0<=number[i]&&number[i]<=200)
          {}
          else
          {
              System.out.println("Number out of limits");
              System.exit(0);
          }
        
        }
        
        
        for(int k=0;k<t;k++)
        {
            
           String s="";
           out:
           for(int j=1;;j++)
           {   
             
             c=j*number[k];// System.out.println(c);
             s=c+s;
             int length=s.length();
             for(int l=0;l<length;l++)
             {
             Integer num=Integer.parseInt(""+s.charAt(l));
             al1.add(num);
                
             try
             {
             if(j>100)
             {
             throw new Exception();
             }
             }
             catch(Exception e)
             {
                 if(k>0)
                     System.out.println();
                 System.out.print("Case #"+(k+1)+": INSOMNIA");
                 al1.clear();
                 break out;
             }
             
             }
             s="";
                
             if(al1.containsAll(al))
             {
                 if(k>0)
                 System.out.println();
              System.out.print("Case #"+(k+1)+": "+c);
              
              al1.clear();
              s="";
              break out;
             
             }
             
        
           }
        }
        
          
      }
    else
      {
          System.out.println("Test Cases Out of limits");
      }
    
    
    }
    
}
