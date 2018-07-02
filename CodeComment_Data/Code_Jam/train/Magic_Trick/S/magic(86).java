package methodEmbedding.Magic_Trick.S.LYD2173;

import java.util.*;
import java.io.*;

class magic
{
    public static void main(String[] ar)throws Exception
    {
        Scanner sc = new Scanner(new File("in.txt"));
        PrintWriter pw = new PrintWriter(new File("out.txt"));
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            int row = sc.nextInt();
            int[][] a1 = new int[4][4];
            for(int j = 0; j < 4; j++)
                for(int  k = 0; k < 4; k++)
                    a1[j][k] = sc.nextInt();
            int[] s1 = a1[row-1];
            int col = sc.nextInt();
            int[][] a2 = new int[4][4];
            for(int j = 0; j < 4; j++)
                for(int k = 0; k < 4; k++)
                    a2[j][k] = sc.nextInt();
            int[] s2 = a2[col-1];
            int k = 0, result = 0;
            for(int j = 0; j < 4; j++)
            {
                int t = s1[j];
                for(int g = 0; g < 4; g++)
                {
                    if(s2[g] == t)
                    {
                        k++;
                        result = t;
                    }
                }
            }
            pw.print("Case #" + (i+1) + ": ");
            if(k == 1)
            {
                pw.println(result);
            }
            else if(k == 0)
            {
                pw.println("Volunteer cheated!");
            }
            else if(k > 1)
            {
                pw.println("Bad magician!");
            }
        }
        sc.close();
        pw.close();
    }
}

