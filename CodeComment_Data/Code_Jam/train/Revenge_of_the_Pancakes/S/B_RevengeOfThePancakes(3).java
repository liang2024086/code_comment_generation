package methodEmbedding.Revenge_of_the_Pancakes.S.LYD858;

/**
 * Created by hagread-only on 09.04.16.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class B_RevengeOfThePancakes
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("input.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));

        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++)
        {
            String s = in.nextLine();
            int blocks = 0;

            while ((s.length() > 0) && (s.charAt(s.length() - 1) == '+'))
            {
                s = s.substring(0, s.length() - 1);
            }

            if (!s.isEmpty())
            {
                blocks++;

                char curS = s.charAt(0);

                for (int j = 0; j < s.length(); j++)
                {
                    if (s.charAt(j) != curS)
                    {
                        curS = s.charAt(j);
                        blocks++;
                    }
                }
            }

            out.write("Case #" + (i + 1) +  ": " + blocks);
            out.newLine();
        }

        out.close();
    }
}
