package methodEmbedding.Counting_Sheep.S.LYD66;

import java.io.*;
import java.util.*;
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
              int n=sc.nextInt(),cn=0;
              i=1;
              Set<String> lib = new HashSet<String>();
              if(n!=0)
              {
                     while(true)
                     {
                            cn=i*n;
                            String temp=Integer.toString(cn);
                            for(j=0;j<temp.length();j++)
                            {
                                 lib.add(Character.toString(temp.charAt(j)));
                            } 
                            if(lib.size()==10)
                            {
                                System.out.println("case #"+(h+1)+": "+cn);
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
