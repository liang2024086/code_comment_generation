package methodEmbedding.Revenge_of_the_Pancakes.S.LYD608;

import java.io.*;
import java.util.*;
import java.math.*;
public class temp
{
       public static void main(String[] args) throws Exception
       {
          FileInputStream in = new FileInputStream(new File("in.in"));
          System.setIn(in);
          PrintStream out = new PrintStream(new FileOutputStream("out.out"));
          System.setOut(out);
          int test=0,i=0,j=0,h=0;
          int count=0;
          Scanner sc=new Scanner(System.in);
          test=sc.nextInt();
          for(h=0;h<test;h++)
          {
              count=0;
              String pan=sc.next();
              for(i=pan.length()-1;i>=0;)
              {
                  if(pan.charAt(i)=='-')
                  {
                     StringBuilder stack=new StringBuilder(pan.substring(0,i));
                     for(j=0;j<stack.length();j++)
                     {
                       if(stack.charAt(j)=='+')
                       {
                          stack.setCharAt(j,'-');
                       }
                       else
                       {
                         stack.setCharAt(j,'+');
                       }
                     }
                     count++;
                     pan=stack.toString();
                     i=stack.length()-1;
                  }
                  else
                  {
                     i--;
                  }  
              }
              System.out.println("Case #"+(h+1)+": "+count); 
          }   
       }
}
