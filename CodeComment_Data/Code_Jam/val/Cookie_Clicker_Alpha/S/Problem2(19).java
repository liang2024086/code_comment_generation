package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1183;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jimmy on 4/12/14.
 */
public class Problem2
{
    private static BufferedReader in;

    public static void main(String[] args) throws IOException
    {
        in = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(in.readLine());
        for(int caseNum = 0; caseNum < numCases; caseNum++)
        {
            //Check how long it would take without upgrades
            //If we can buy an upgrade, check how long it will take with that upgrade
            String line = in.readLine();
            line += " ";
            double[] nums = new double[3];
            int count = 0;

            double c = 0.0d;
            double f = 0.0d;
            double x = 0.0d;
            for(int i = 0; i < line.length(); i++)
            {
                if(line.charAt(i) == ' ')
                {
                    nums[count] = Double.parseDouble(line.substring(0, i));
                    line = line.substring(i+1);
                    i = 0;
                    count++;
                }
            }
            c = nums[0];
            f = nums[1];
            x = nums[2];

            int loops = 0;
            //Figure out how to win
            final double BASE_TIME = x/(2 + loops * f);
            double totalTime = 0.0d;
            //First, check how long it will take to get the first upgrade.
            if(BASE_TIME <= c/2)
                System.out.println("Case #" + (caseNum + 1) + ": " + BASE_TIME);
            else
            {
                while((c /(2 + f * loops) + (x/(2 + f * (loops + 1)))) < x/(2 + f * loops))
                {
                    //System.out.println(c/(2 + loops * f));
                    totalTime += (c/(2 + loops * f));
                    loops++;
                }
                totalTime += (x/(2 + loops*f));
                System.out.println("Case #" + (caseNum + 1) + ": " + totalTime);
            }
        }
    }
}
