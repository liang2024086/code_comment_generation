package methodEmbedding.Magic_Trick.S.LYD98;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Bassem Ehab
 */
public class MagicTrick
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("A-small.in"));
        FileWriter file = new FileWriter("o.out");
        int t = Integer.parseInt(br.readLine());
        for (int l = 0; l < t; l++)
        {
            int x = Integer.parseInt(br.readLine());
            int[] y = new int[4];
            for (int i = 1; i <= 4; i++)
            {
                if (i == x)
                {
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < y.length; j++)
                    {
                        y[j] = Integer.parseInt(st.nextToken());
                    }
                    continue;
                }
                br.readLine();
            }
            int s = Integer.parseInt(br.readLine());
            int[] y2 = new int[4];
            for (int i = 1; i <= 4; i++)
            {
                if (i == s)
                {
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < y2.length; j++)
                    {
                        y2[j] = Integer.parseInt(st.nextToken());
                    }
                    continue;
                }
                br.readLine();
            }
            int ans = 0;
            int times = 0;
            for (int i = 0; i < y.length; i++)
            {
                for (int j = 0; j < y2.length; j++)
                {
                    if (y[i] == y2[j])
                    {
                        ans = y[i];
                        times++;
                    }
                }
            }
            if (times == 0)
            {
                file.append("Case #" + (l + 1) + ": Volunteer cheated!");
                file.append("\n");
            }
            if (times > 1)
            {
                file.append("Case #" + (l + 1) + ": Bad magician!");
                file.append("\n");
            }
            if (times == 1)
            {
                file.append("Case #" + (l + 1) + ": " + ans);
                file.append("\n");
            }

        }
        file.close();
    }
}
