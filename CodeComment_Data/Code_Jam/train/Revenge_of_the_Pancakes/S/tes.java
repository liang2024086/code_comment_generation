package methodEmbedding.Revenge_of_the_Pancakes.S.LYD42;

import java.io.*;
import java.util.*;
import java.math.*;
public class tes
{
       public static void main(String[] args) throws Exception
       {
          FileInputStream is = new FileInputStream(new File("test.in"));
          System.setIn(is);
          PrintStream out = new PrintStream(new FileOutputStream("testo.out"));
          System.setOut(out);
          int t=0;
          int i=0,j=0,h=0;
          Scanner sc=new Scanner(System.in);
          t=sc.nextInt();
          for(h=0;h<t;h++)
          {
              int flip=0;
              String cakes=sc.next();
              for(i=cakes.length()-1;i>=0;)
              {
                  if(cakes.charAt(i)=='-')
                  {
                     StringBuilder pile=new StringBuilder(cakes.substring(0,i));
                     for(j=0;j<pile.length();j++)
                     {
                       if(pile.charAt(j)=='+')
                       {
                          pile.setCharAt(j,'-');
                       }
                       else
                       {
                         pile.setCharAt(j,'+');
                       }
                     }
                     flip++;
                     cakes=pile.toString();
                     i=pile.length()-1;
                  }
                  else
                  {
                     i--;
                  }  
              }
              System.out.println("Case #"+(h+1)+": "+flip); 
          }   
       }
}
