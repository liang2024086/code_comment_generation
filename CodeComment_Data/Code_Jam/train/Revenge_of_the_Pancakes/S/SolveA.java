package methodEmbedding.Revenge_of_the_Pancakes.S.LYD40;


import java.io.*;
import java.util.*;
/**
 *
 * @author Sourav Kumar Paul
 */
public class SolveA {
    public static void main(String[] args) throws IOException{
       BufferedReader reader = new BufferedReader(new FileReader("F:\\Programming\\src\\GoogleCodeJam2016\\input1.txt"));
       PrintWriter out = new PrintWriter(new FileWriter("F:\\Programming\\src\\GoogleCodeJam2016\\output1.txt"));
        
       int test = Integer.parseInt(reader.readLine());
       for(int t=0; t<test; t++)
       {
           //int n = Integer.parseInt(reader.readLine());
          String line = reader.readLine();
           int str[] = new int[line.length()];
           for(int i=0; i<line.length(); i++)
           {
               str[i] = line.charAt(i)== '+'? 1 : -1;
           }
           long count =0 ;
           int minus = 0;
           for(int i=str.length-1; i>=0; i--)
           {
               if(minus%2!=0)
                   str[i] = 0-str[i];
               if(str[i] < 0 )
               {
                   count++;
                   minus++;
               }
           }
           out.println("Case #"+(t+1)+": "+count);
       }
        out.flush();
        out.close();
    }
  
}
