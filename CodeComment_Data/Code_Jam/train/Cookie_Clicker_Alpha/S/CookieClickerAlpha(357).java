package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1503;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class CookieClickerAlpha {
    public static void main(String[] args) throws IOException {

        int[] remainingCredit = new int[1000];
        Arrays.fill(remainingCredit, -1);

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        int numCases = Integer.parseInt(br.readLine());
        PrintWriter writer = new PrintWriter("out.txt", "UTF-8");

        for (int i = 0; i < numCases; i++) {
            final String[] input = br.readLine().split(" ");
            final double farmCost = Double.parseDouble(input[0]);
            final double farmRate = Double.parseDouble(input[1]);
            final double target   = Double.parseDouble(input[2]);
            
            double time = 0;
            double cookies = 0;
            int farms = 0;
            
            while(cookies < target) {
                
                // Remaining time at current rate
                double remainingCookies = target-cookies;
                double currentRate = 2 + (double)(farms * farmRate);
                double remainingTime = remainingCookies / currentRate;
                
                // Can I afford a farm?
                if(cookies < farmCost) {
                    double timeTilNextFarm = (farmCost-cookies) / currentRate;
                    if(timeTilNextFarm < remainingTime) {
                        time += (farmCost-cookies) / currentRate;
                        cookies = farmCost;
                    } else {
                        time += remainingTime;
                        cookies = target;
                    }
                } else {
                    // Should I buy a farm?
                    double remainingCookiesAfterFarm = target-(cookies-farmCost);
                    double rateAfterFarm = 2 + (double)((farms+1) * farmRate);
                    double remainigTimeAfterFarm = remainingCookiesAfterFarm / rateAfterFarm;
                    
                    if(remainigTimeAfterFarm < remainingTime) {
                        cookies -= farmCost;
                        farms++;
                    } else {
                        cookies = target;
                        time += remainingTime;
                    }
                    
                    //System.out.println("remainingTime: " + remainingTime);
                    //System.out.println("remainingTimeAfterFarm: " + remainigTimeAfterFarm);

                }

//                System.out.println("cookies: " + cookies + 
//                                   " target: " + target + 
//                                   " farmCost: " + farmCost + 
//                                   " farms: " + farms + 
//                                   " cookies " + cookies +
//                                   " time " + time);
                
            }
            
            writer.println(String.format("Case #%d: %f", i+1, time));
        }
        br.close();
        writer.close();

    }
}
