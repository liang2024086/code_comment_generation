package methodEmbedding.Standing_Ovation.S.LYD1611;

import java.util.*;
import java.io.*;

public class StandingOvation
{
    public static void main (String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("A-small-attempt1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt1.out")));
        int t = scan.nextInt();
        for (int i=0; i<t; i++)
        {
            int max = scan.nextInt();
            String s = scan.next();
            int cnt = 0, up = 0;
            for (int j=0; j<=max; j++)
            {
                int sj = s.charAt(j)-'0';
                if (sj>0 && up<j)
                {
                    cnt += (j-up);
                    up = j;
                }
                up += sj;
            }
            out.println("Case #" + (i+1) + ": " + cnt);
        }
        out.close();
        System.exit(0);
    }
}
