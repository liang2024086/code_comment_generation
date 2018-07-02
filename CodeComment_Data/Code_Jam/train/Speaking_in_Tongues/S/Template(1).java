package methodEmbedding.Speaking_in_Tongues.S.LYD561;

import java.util.*;
import java.io.*;

public class Template
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new FileReader("A-small-attempt0.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
        
        int cases = Integer.parseInt(sc.nextLine());
        String enc = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv aqz";
        String dec = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up yzq";
        
        for (int i = 0; i < cases; i++)
        {
            String temp = sc.nextLine();
            pw.print("Case #" + (i + 1) + ": ");
            //while (!(temp = sc.next()).equals("\n"))
            {
                for(int j = 0; j<temp.length(); j++)
                {
                    pw.print(dec.charAt(enc.indexOf(temp.charAt(j))));
                }
                pw.println();
            }
        }
        
        pw.flush();
        pw.close();
        sc.close();
    }
}

//24
