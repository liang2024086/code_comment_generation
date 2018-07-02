package methodEmbedding.Speaking_in_Tongues.S.LYD456;

import java.io.*;
import java.util.*;

class Googlerese
{
    public static void main(String[] args) throws IOException
    {
        String map = "yhesocvxduiglbkrztnwjpfmaq";

        Scanner s = new Scanner(new File(args[0]));

        int numTests = Integer.parseInt(s.nextLine());

        for (int i = 0; i < numTests; i++)
        {
            String in = s.nextLine().trim();
            StringBuilder out = new StringBuilder();

            for (int j = 0; j < in.length(); j++)
            {
                char c = in.charAt(j);
                if (c < 'a' || c > 'z')
                {
                    out.append(c);
                    continue;
                }
                out.append(map.charAt(c - 'a'));
            }
            
            System.out.println("Case #" + (i+1) + ": " + out);
        }
    }
}
