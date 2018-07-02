package methodEmbedding.Cookie_Clicker_Alpha.S.LYD147;

import java.util.*;
import java.io.*;
public class CookieClickerAlphaB
{
    public static void main (String[] args)
    {
        String line = null;
        int reps = 0;
        double unwrap[][];
        try{
            FileReader r = new FileReader("inputsB.txt");
            BufferedReader b = new BufferedReader(r);
            line = b.readLine();
            reps = Integer.parseInt(line);
            unwrap = new double [reps][3];
            for(int i = 0; i < reps; i++)
            {
                line = b.readLine();
                double c = Double.parseDouble(line.substring(0,line.indexOf(" ")));
                line = line.substring(line.indexOf(" ")+1);
                double f = Double.parseDouble(line.substring(0,line.indexOf(" ")));
                line = line.substring(line.indexOf(" ")+1);
                double x = Double.parseDouble(line);
                unwrap[i][0] = c;
                unwrap[i][1] = f;
                unwrap[i][2] = x;
            }
            double[] out = new double[reps];
            int temp = 0;
            for (int i = 0; i<unwrap.length; i++)
            {
                double time = 0;
                double farmTime = 0;
                double timeTemp = 0;
                double finalTime = 0;
                double cost = 0;
                double cookieBonus = 0;
                double timer = 0;
                double addCookie = 2;
                double goal = 0;
                boolean bool = true;
                cost = unwrap[i][0];
                cookieBonus = unwrap[i][1];
                goal = unwrap[i][2];
                while (bool == true)
                {
                    time = goal/addCookie;
                    farmTime = cost/addCookie;
                    addCookie = addCookie + cookieBonus;
                    timeTemp = goal/addCookie;
                    if (time < (farmTime + timeTemp))
                    {
                        bool = false;
                        finalTime = time + timer;
                        System.out.println(finalTime);
                        out[temp] = finalTime;
                        temp++;
                    }
                    else
                    {
                        timer = timer + farmTime;
                    }
                }
            }
            int temp2 = 1;
            ArrayList<String> fina = new ArrayList<String>();
            for(int i = 0; i<reps; i++)
            {
                String x = ("Case #" + temp2 + ": " + out[i]);
                System.out.println(x);
                fina.add(x);
                temp2++;
            }
            FileWriter writer = new FileWriter("outputs.txt");
            for (String inp: fina)
            {
                writer.write(inp + "\r\n");
            }
            writer.close();
        }
        catch(IOException e)
        {
        }
    }
}
