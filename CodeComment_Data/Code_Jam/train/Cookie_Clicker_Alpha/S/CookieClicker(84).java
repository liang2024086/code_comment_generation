package methodEmbedding.Cookie_Clicker_Alpha.S.LYD166;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CookieClicker
{
    // private static String FILENAME = "sample.in";
    private static String FILENAME = "B-small-attempt0.in";
    // private static String FILENAME = "A-large-practice.in";
    
    public static void main(String[] args)
    {
        BufferedReader br = null;
        String outFileName;
        if (FILENAME.contains("small"))
        {
            outFileName = "small.out";
        }
        else if (FILENAME.contains("large"))
        {
            outFileName = "large.out";
        }
        else
        {
            outFileName = "sample.out";
        }

        try
        {
            FileWriter fstream = new FileWriter(outFileName);
            BufferedWriter out = new BufferedWriter(fstream);

            br = new BufferedReader(new FileReader(FILENAME));
            int numberTestCases = Integer.parseInt(br.readLine());

            System.out.println("Number of Cases: " + numberTestCases);
            
            for (int i = 1; i <= numberTestCases; i++)
            {
                double stdRate = 2.0;
                
                // get C, F, & X
                String[] inputVar = br.readLine().split(" ");
                double cFarm = Double.parseDouble(inputVar[0]);
                System.out.println("C= " + cFarm);
                double fRateAdd = Double.parseDouble(inputVar[1]);
                System.out.println("F= " + fRateAdd);
                double xWin = Double.parseDouble(inputVar[2]);
                System.out.println("X= " + xWin);
                
                double currentWinTime = xWin / stdRate;
                System.out.println("currentWinTime= " + currentWinTime);
                double firstFarmTime = cFarm / stdRate;
                System.out.println("firstFarmTime= " + firstFarmTime);
                
                double bestTime = currentWinTime;
                System.out.println("bestTime= " + bestTime);
                
                if (currentWinTime > firstFarmTime)
                {
                    boolean done = false;
                    double runningTime = 0.0;
                    
                    while (!done)
                    {
                        runningTime += (cFarm / stdRate);
                        stdRate += fRateAdd;
                        double nextWin = xWin / stdRate;
                        
                        System.out.println(bestTime + " vs. " + (runningTime + nextWin));
                        
                        if (bestTime <= (runningTime + nextWin))
                        {
                            System.out.println("DONE!!!!!!!");
                            done = true;
                        }
                        else
                        {
                            bestTime = (runningTime + nextWin);
                        }
                    }
                    
                    //output results
                    System.out.println("Case #" + i + ": " + String.format("%.7f", bestTime));
                    out.write("Case #" + i + ": " + String.format("%.7f", bestTime) + "\r\n");
                }
                else
                {
                    System.out.println("Case #" + i + ": " + String.format("%.7f", bestTime));
                    out.write("Case #" + i + ": " + String.format("%.7f", bestTime) + "\r\n");
                }
                
            }
            
            
            out.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                br.close();
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
        }
          
    }
}
