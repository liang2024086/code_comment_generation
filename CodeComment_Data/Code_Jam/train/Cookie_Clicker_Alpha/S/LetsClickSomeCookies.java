package methodEmbedding.Cookie_Clicker_Alpha.S.LYD12;

/**
 * @author BigMacDaddy 
 */

import java.util.*;
import java.io.*;
public class LetsClickSomeCookies
{
    public static void main(String args[]) throws IOException
    {
        PrintWriter outputs = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        File cookieInput = new File("Cookies.txt");
        Scanner sf = new Scanner(cookieInput);
        int repeats = Integer.parseInt(sf.nextLine());
        double[] endArray = new double[3];
        for (int i = 1; i <= repeats; i++)
        {
            String line = sf.nextLine() + " ";
            for (int r = 0; r < endArray.length; r++)
            {
                endArray[r] = Double.parseDouble(line.substring(0, line.indexOf(" ")));
                line = line.substring(line.indexOf(" ") + 1);
            }

            int counter = 0;
            double farmCost = 0;
            double farmCost2 = 0;
            double farmRate = 0;
            double farmRate2 = 0;
            double timer = 0;
            double rate = 2;
            double cookieGoal = 0;
            double endTime = 0;
            double farmTime = 0;
            double timeTemp = 0;
            double finalTime = 0;
            boolean check = true;
            farmCost = endArray[0];
            farmRate = endArray[1];
            cookieGoal = endArray[2];

            while (check == true)
            {
                endTime = cookieGoal/rate;
                farmTime = farmCost/rate;
                rate = rate + farmRate;
                timeTemp = cookieGoal/rate;
                if (endTime < (farmTime + timeTemp))
                {
                    check = false;
                    finalTime = endTime + timer;
                    outputs.println("Case #" + i + ": " + finalTime);
                }
                else
                {
                    timer = timer + farmTime;
                }
            }
        }
        sf.close();
        outputs.close();
    }
}
