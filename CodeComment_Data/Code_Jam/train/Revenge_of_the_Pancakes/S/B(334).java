package methodEmbedding.Revenge_of_the_Pancakes.S.LYD392;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class B
{
    public static void main(String[] args) throws Exception
    {
        String round = "small";
        System.out.println("Running: " + B.class.getSimpleName() + " " + round);
        BufferedReader reader = new BufferedReader(new FileReader(B.class.getSimpleName() + "." + round + ".in"));
        PrintWriter writer = new PrintWriter(new FileWriter(B.class.getSimpleName() + "." + round + ".out"));
        
        int count = Integer.parseInt(reader.readLine().trim());
        for(int i = 0; i < count; i++)
        {
            writer.print("Case #" + (i+1) + ": ");
            String stack = reader.readLine().trim();
            int flips = 0;
            char c = stack.charAt(0);
            for(int j=1; j< stack.length(); j++)
            {
                char d =stack.charAt(j); 
                if(d != c)
                {
                    flips++;
                    c = d;
                }
            }
            if(c == '-')
                flips++;
            writer.println(Integer.valueOf(flips));
        }
        writer.close();
        reader.close();
    }
}
