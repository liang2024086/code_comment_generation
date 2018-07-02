package methodEmbedding.Counting_Sheep.S.LYD160;


import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public final class Sheep {
   
    public Sheep() {
       
        super();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
           int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
           Set<String> set=new TreeSet<String>();
           for (int i = 1; i <= t; ++i) {
             int n=in.nextInt();
               if(n==0)
               {
               System.out.println("Case #"+i+": INSOMNIA");
               continue;
               }
               int m=0;
               int lastnum;
               while(true)
               {
                 m++;
                lastnum=m*n;
                 String [] digits=String.valueOf(lastnum).split("");
                 for (int j=0;j<digits.length;j++) {
                     set.add(digits[j]);                   
                 }
                   if(set.size()==10)
                   {
                   System.out.println("Case #"+i+": "+lastnum);
                   set.clear();
                   break;
                   }
               }
               
            
           }

    }
}
