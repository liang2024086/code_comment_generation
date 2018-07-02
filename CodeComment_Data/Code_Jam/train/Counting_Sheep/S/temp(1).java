package methodEmbedding.Counting_Sheep.S.LYD1720;

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
          int t=0,i=0,j=0,h=0;
          Scanner sc=new Scanner(System.in);
          t=sc.nextInt();
          for(h=0;h<t;h++)
          {
              BigInteger number=sc.nextBigInteger(),evlo=BigInteger.valueOf(0);
              i=1;
              Set<String> check = new HashSet<String>();
              if(number.compareTo(BigInteger.valueOf(0))!=0)
              {
                     while(true)
                     {
                            evlo=BigInteger.valueOf(i).multiply(number);
                            String te=evlo.toString();
                            for(j=0;j<te.length();j++)
                            {
                                 check.add(Character.toString(te.charAt(j)));
                            } 
                            if(check.size()==10)
                            {
                                System.out.println("case #"+(h+1)+": "+evlo);
                                break;
                            }
                            i++;
                     }
              }
              else
              {
                 System.out.println("case #"+(h+1)+": INSOMNIA");
              }       

          }   
       }
}
