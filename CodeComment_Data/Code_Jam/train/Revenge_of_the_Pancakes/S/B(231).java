package methodEmbedding.Revenge_of_the_Pancakes.S.LYD457;

import java.util.*;
import java.io.*;

public class B
{
    public static void main (String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("B-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("B-small-attempt0.dat")));
        
        int t = scan.nextInt();
        scan.nextLine();
        for (int r=1; r<=t; r++)
        {
            String p = scan.nextLine();
            int f = (p.charAt(0)=='+')?0:1;
            for (int i=1; i<p.length(); i++)
                if (p.charAt(i)=='-' && p.charAt(i-1)=='+')
                    f+=2;
            System.out.println("Case #"+r+": "+f);
            out.println("Case #"+r+": "+f);
        }
        out.close();
    }
}
