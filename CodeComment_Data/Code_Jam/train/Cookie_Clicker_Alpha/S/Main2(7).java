package methodEmbedding.Cookie_Clicker_Alpha.S.LYD809;

/**
 * Created by ffetters on 4/12/14.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;


public class Main2 {

    public static double X;
    public static double F;
    public static double C;

    public static void main(String [] strings) throws Exception{

        String file = "/tmp/B-small-attempt1.in";

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        int numCases = Integer.valueOf(br.readLine()).intValue();

        for( int y=0;y<numCases;y++){
            double result = 0.0d;
            double howLongItTakes = 0.0d;

            double currentCookies = 0;
            double cookieRate = 2.0d;

            String []vals = br.readLine().split(" ");
            C = Double.valueOf(vals[0]); // cookies to buy cookie farm
            F = Double.valueOf(vals[1]); // incremental cookies per second
            X = Double.valueOf(vals[2]); // cookies to win

            double lastTimeToWin = (X - currentCookies) / cookieRate;
            int count = 3;
            while(true) {
                // strategy;
                // either save for farm or wait to win
                double timeToFarm = C / cookieRate;
                double timeToWin = (X - currentCookies) / cookieRate;

                //System.out.println("timeToFarm: "+timeToFarm);
                //System.out.println("timeToWin: "+timeToWin);

                //System.out.println("lastTimeToWin="+lastTimeToWin+": vs :winNow:"+(timeToWin+howLongItTakes));

                if( lastTimeToWin < (timeToWin+howLongItTakes)){
                    result = lastTimeToWin;
                    break;
                }

                if (timeToWin <= timeToFarm) {
                    howLongItTakes += timeToWin;
                    result = howLongItTakes;
                    break;
                }

                lastTimeToWin = (timeToWin+howLongItTakes);
                howLongItTakes += timeToFarm;
                cookieRate += F;



                count--;
                //if( count < 0){ break;}
            }
            //howLongItTakes = buyOrWin(0,2.0d);

            System.out.println("Case #" + (1 + y) + ": " + result);
        }

        br.close();
    }
}
