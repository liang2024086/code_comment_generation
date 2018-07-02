package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1049;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: dreamadmin
 * Date: 4/12/14
 * Time: 8:47 AM
 * To change this template use File | Settings | File Templates.
 */

public class CookieClickerAlpha {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("B-small-attempt0.in"));
        BufferedWriter wr = new BufferedWriter(new FileWriter("B-small.out"));
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            Double C = sc.nextDouble();
            Double F = sc.nextDouble();
            Double X = sc.nextDouble();
            int noOfFarms = 0;

            Double overallTime = 0.0;


            Double bestTime = 0.0;
            Double prevBestTime = 0.0;
            Double timeNeededForFarm = 0.0;
            Double time = (X/((F * noOfFarms) + 2.0));
            prevBestTime = bestTime;
            bestTime = time;
            timeNeededForFarm = (C / ((F * noOfFarms) + 2.0));
            noOfFarms++;
            overallTime = timeNeededForFarm;

            while (true) {
                time = (X/((F * noOfFarms) + 2.0));
                prevBestTime = bestTime;
                bestTime = overallTime + time;
                if (prevBestTime < bestTime) {
//                    System.out.println(prevBestTime);
                    wr.write("Case #"+(i+1)+": "+prevBestTime+"\n");
                    break;
                }
                timeNeededForFarm = (C / ((F * noOfFarms) + 2.0));
                noOfFarms++;
                overallTime += timeNeededForFarm;
            }

        }
        wr.close();
    }
}
