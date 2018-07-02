package methodEmbedding.Cookie_Clicker_Alpha.S.LYD54;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author gmann
 */
public class CookieClicker
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try
        {
            br = new BufferedReader(new FileReader("/Volumes/Grace Data/Developer/NetBeansProjects/CodeJam/input.in.txt"));
            bw = new BufferedWriter(new FileWriter("/Volumes/Grace Data/Developer/NetBeansProjects/CodeJam/output.txt"));

            // get T from line 1
            Integer t = Integer.parseInt(br.readLine());

            // for each test case line
            for (int i = 1; i <= t; i++)
            {
                // get c, f, x
                String[] line = br.readLine().split(" ");
                Double c = Double.parseDouble(line[0]);
                Double f = Double.parseDouble(line[1]);
                Double x = Double.parseDouble(line[2]);

                Double rate = 2.00000;
                Double y = 0.00000;
                Double timeToCookies = x / rate;
                Double timeToFarm = c / rate;
                Double timeToFarmAndCookies = timeToFarm + (x / (rate + f));

                while (timeToCookies > timeToFarmAndCookies)
                {
                    y += timeToFarm;
                    rate += f;
                    timeToCookies = x / rate;
                    timeToFarm = c / rate;
                    timeToFarmAndCookies = timeToFarm + (x / (rate + f));
                }

                y += x / rate;
                bw.write("Case #" + i + ": " + String.format("%.7f", y));
                bw.newLine();
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (br != null)
                {
                    br.close();
                }
                if (bw != null)
                {
                    bw.close();
                }
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }

}
