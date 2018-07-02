package methodEmbedding.Magic_Trick.S.LYD1186;


import java.math.*;
import java.util.*;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0 .in"));
        FileWriter file = new FileWriter("o.out");
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int tokens;

        for (int i = 1; i <= t; i++)
        {
            String[] re1 = new String[4];
            String[] re2 = new String[4];
            String x = "";
            int c = 0;
            for (int k = 0; k < 2; k++)
            {

                int pos = Integer.parseInt(br.readLine());

                for (int j = 0; j < 4; j++)
                {
                    st = new StringTokenizer(br.readLine());
                    if (j + 1 == pos)
                    {
                        int a = 0;
                        while (st.hasMoreTokens())
                        {
                            if (k == 0)
                            {
                                re1[a] = st.nextToken();
                            } else
                            {
                                re2[a] = st.nextToken();
                            }
                            a++;
                        }
                    }
                }
            }

            for (int j = 0; j < re2.length; j++)
            {
                for (int k = 0; k < re2.length; k++)
                {
                    if (re1[j].equals(re2[k]))
                    {
                        c++;
                        x = re2[k];
                    }
                }
            }
            if (c == 1)
            {
                file.append("Case #" + i + ": " + x);
                file.append("\n");
            } else if (c > 1)
            {
                file.append("Case #" + i + ": Bad magician!\n");
            } else if (c == 0)
            {
                file.append("Case #" + i + ": Volunteer cheated!\n");
            }

        }
        file.close();
    }

}
