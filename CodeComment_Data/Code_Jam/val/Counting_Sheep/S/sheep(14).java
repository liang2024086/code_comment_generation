package methodEmbedding.Counting_Sheep.S.LYD26;

import java.util.*;
import java.io.*;

public class sheep
{
    
    public static void main(String[] args)
    {
        try
        {
            Scanner in = new Scanner(new File("A-small-attempt0.in"));
            int n = in.nextInt();
            int[] ans = new int[n];
            Set<Integer> check = new HashSet<Integer>();
            
            for (int i = 0; i < n; i++)
            {
                int t = in.nextInt();
                boolean done = false;
                int prev = 0;
                int c = 1;
                int val = t;
                int count = 0;
                while (!done)
                {
                    if (check.size() == 10)
                    {
                        done = true;
                    }
                    else if (val == t && c > 2)
                    {
                       // System.out.println(c);
                        done = true;
                        val = -1;
                                
                    }
                    else
                    {
                    val = t*c;
                    int temp = val;
                    while(temp != 0)
                    {
                        check.add(temp%10);
                        temp = temp/10;
                    }
                    c++;
                    
                    }
                    prev = t;
                    
                }
                ans[i] = val;
                check.clear();
            }
            
            try
            {
                PrintWriter out = new PrintWriter(new FileWriter("sheep.out"), true);
               for (int i = 0; i < ans.length; i++)
               {
                   int temp = i+1;
                   if (ans[i] >0){
                   out.println("Case #" + temp + ": " + ans[i]);
                   }
                   else
                   {
                       out.println("Case #" + temp + ": INSOMNIA");
                   }
               }
                out.close();
            }
            
            catch(IOException e)
            {
                throw new RuntimeException(e);
            }
            
        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

}
