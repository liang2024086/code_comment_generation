package methodEmbedding.Standing_Ovation.S.LYD1018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by dennis on 4/11/2015.
 */
public class CJ2
{
    public static void main(String args[])
    {
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Dev\\CodeJam\\A-small-attempt1.in"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Dev\\CodeJam\\A-small-attempt1.out"));

            String line;
            String[] splits;
            int cases = Integer.parseInt(br.readLine());

            for(int i = 0; i < cases; i++)
            {
                line = br.readLine();
                splits = line.split(" ");
                int maxShy = Integer.parseInt(splits[0]) + 1;
                char[] shyness = splits[1].toCharArray();
                int people = 0;
                int friends = 0;
                for(int j = 0; j < maxShy; j++)
                {
                    if(people < j)
                    {
                        friends += j - people;
                        people += j - people;
                    }
                    people += Integer.parseInt(shyness[j]+"");
                }
                bw.write("Case #" + (i + 1) + ": " + friends + (i + 1 == cases ? "" : "\n"));
            }

            bw.close();
            br.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
