package methodEmbedding.Revenge_of_the_Pancakes.S.LYD152;

import java.io.*;
import java.util.*;

public class PanCakes16{
 public static void main(String args[])throws Exception{
 
  BufferedReader br=new BufferedReader(new FileReader("e:/gcj16/B-small-attempt0.in-1.txt"));
  PrintWriter pw=new PrintWriter("e:/gcj16/pcakesop.txt");
  int tc=Integer.parseInt(br.readLine())+1;
  int i=0,j=0,k=0,i1=0,flips=0;

  for(i1=1;i1<tc;i1++)
   {
     String pcakes=br.readLine().trim();
     flips=0;
     for(i=0;i<pcakes.length()-1;i++)
       {
          if(pcakes.charAt(i)!=pcakes.charAt(i+1))
            flips++;
       }
      if(pcakes.charAt(pcakes.length()-1)=='-')
        flips++;
      System.out.println("Case #"+i1+": "+flips);
      pw.println("Case #"+i1+": "+flips);
   }
   pw.close();
}

}
