package methodEmbedding.Magic_Trick.S.LYD1936;

import java.util.*;
import java.io.*;
public class magictrick
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
      PrintStream out = new PrintStream(new File("magicout.out"));
      int tot = Integer.parseInt(in.readLine());
      for(int k = 0; k < tot; k++)
      {
         int a = Integer.parseInt(in.readLine());
         String z = "";
         for(int l = 0; l < 4; l++)
         {
            String temp = in.readLine();
            if(l == a-1)
            {
               z = temp;
            }
         }
         //System.out.println("Z"+z);
         int b = Integer.parseInt(in.readLine());
         String y = "";
         for(int l = 0; l < 4; l++)
         {
            String temp2 = in.readLine();
            if(l == b-1)
            {
               y = temp2;
            }
         }
         //System.out.println("Y"+y);
         ArrayList<Integer> arr = new ArrayList<Integer>();
         for(int l = 0; l < 3; l++)
         {
            int c = z.indexOf(" ");
            String sub = z.substring(0, c);
            z = z.substring(c+1);
            int subb = Integer.parseInt(sub);
            arr.add(subb);
         }
         int n = Integer.parseInt(z);
         arr.add(n);
         //System.out.println(arr);
         int totsim = 0;
         int ifright = 0;
         for(int l = 0; l < 3; l++)
         {
            int c = y.indexOf(" ");
            String sub = y.substring(0, c);
            y = y.substring(c+1);
            int subb = Integer.parseInt(sub);
            if(arr.contains(subb))
            {
               ifright = subb;
               totsim++;
            }
         }
         int o = Integer.parseInt(y);
         if(arr.contains(o))
         {
            ifright = o;
            totsim++;
         }
         out.print("Case #"+(k+1)+": ");
         if(totsim == 1)
         {
            out.print(ifright);
         }
         if(totsim > 1)
         {
            out.print("Bad magician!");
         }
         if(totsim < 1)
         {
            out.print("Volunteer cheated!");
         }
         out.println();
      }
   }
}
