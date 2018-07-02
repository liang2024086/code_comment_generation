package methodEmbedding.Speaking_in_Tongues.S.LYD666;

import java.io.*;
import java.util.*;
class SpeakingInTounges
{
    public static void main(String args[]) throws Exception
    {
        Scanner in = new Scanner(new File("A-small-attempt0.in.txt"));
        int n = Integer.parseInt(in.nextLine());
        String a, b;
        a = "abcdefghijklmnopqrstuvwxyz ";
        b = "ynficwlbkuomxsevzpdrjgthaq ";
        for(int x = 1; x <= n; x++)
        {
            String s = in.nextLine();
            s = s.trim();
            String s2 = "";
            for(int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                int p = b.indexOf(c);
                s2 += a.charAt(p);
            }
            System.out.println("Case #" + x + ": " + s2);
        }
    }
}
