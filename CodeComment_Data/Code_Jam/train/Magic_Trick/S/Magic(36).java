package methodEmbedding.Magic_Trick.S.LYD982;

import java.io.*;
import java.util.*;

public class Magic
{
    public static int[][] a1 = new int[4][4];
    public static int[][] a2 = new int[4][4];
    
    public static int[] b1 = new int[4];
    public static int[] b2 = new int[4];
    
    public static int r1, r2, tc;
    
    public static void main(String[] args) throws IOException
    {
        String an = "", ans = "";
        int count = 0, v = 1;
        Scanner s = new Scanner(new File("C:\\jam\\input.txt"));
        
        tc = s.nextInt();
        while (tc != count)
        {
            r1 = s.nextInt()-1;
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0 ; j < 4 ; j++)
                {
                    a1[i][j] = s.nextInt();
                }
            }
            for (int i = 0 ; i < 4 ; i++)
            {
                b1[i] = a1[r1][i];
            }
            
            r2 = s.nextInt()-1;
            for (int i = 0; i < 4; i++)
            {
                for (int j = 0 ; j < 4 ; j++)
                {
                    a2[i][j] = s.nextInt();
                }
            }
            for (int i = 0 ; i < 4 ; i++)
            {
                b2[i] = a2[r2][i];
            }
            int u = 0;
            boolean match = false;
            for (int i = 0 ; i < 4 ; i++)
            {
                for (int j = 0 ; j < 4 ; j++)
                {
                    if (b1[i] == b2[j])
                    {
                        u++;
                    }
                }
            }
            if (u > 1 && u <= 4)
            {
                ans += "Bad magician!";
                match = true;
            }
            
            for (int i = 0 ; i < 4 ; i++)
            {
                for (int j = 0 ; j < 4 ; j++)
                {
                    if (b1[i] == b2[j] && match == false)
                    {
                        ans += b1[i];
                        match = true;
                        break;
                    }
                }
            }
            
            if (match == false) ans += "Volunteer cheated!";
            count++;
            an += "Case #" + v + ": " + ans + "\n";
            v++;
            ans = "";
        }
        System.out.println(an);
    }
}
