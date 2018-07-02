package methodEmbedding.Cookie_Clicker_Alpha.S.LYD784;


import java.math.*;
import java.util.*;
import java.io.*;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("B-small.in"));
        FileWriter file = new FileWriter("o.out");
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= t; i++)
        {
            st = new StringTokenizer(br.readLine());
            double c = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            double x = Double.parseDouble(st.nextToken());
            double ratio = 2.0;
            double sum = 0.0;

            for (;;)
            {
                if (((c / ratio) + (x / (ratio + f))) < (x / ratio))
                {
                    sum += c / ratio;
                    ratio += f;
                    continue;
                }
                sum += x / ratio;
                break;
            }

            file.append("Case #" + i + ": " + sum);
            file.append("\n");

        }
        file.close();
    }

}
