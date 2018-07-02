package methodEmbedding.Standing_Ovation.S.LYD1181;

import java.util.*;
import java.io.*; 
public class A
{
    public static void main(String args[])throws IOException
    {
        FileReader in = new FileReader("D:/GCJ Files/2015 QR/A-small-attempt4.in");
        FileWriter out = new FileWriter("D:/GCJ Files/2015 QR/A-small-attempt4.out");
        //FileReader in = new FileReader("D:/GCJ Files/2010 QR/A-large-attempt.in");
        //FileWriter out = new FileWriter("D:/GCJ Files/2010 QR/A-large-attempt.out");
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);
        int t;
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++)
        {
            int n, x = 0, cnt = 0;
            String s;
            String[] st = new String(br.readLine()).split(" ");
            n = Integer.parseInt(st[0].trim());
            s = st[1].trim();
            for(int j=0; j<=n; j++)
            {
                char c = s.charAt(j);
                if(x < j)
                {
                    cnt = cnt + (j-x);
                    x = j;
                }
                x = x + (c - '0');
            }
            bw.write("Case #"+i+": "+cnt+"\n");
        }
        br.close();
        bw.close();
    }
}
