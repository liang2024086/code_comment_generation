package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1540;

import java.util.*;
import java.io.*;

public class CookieClicker
{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for (int count = 0; count < t; count++) {
            
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();
            
            
            boolean notDone = true;
            double timeToHere = 0.0;
            double currentRate = 2.0;
            double currentBest = timeToHere + (x/currentRate);
            
            while (notDone) {
                timeToHere += c/currentRate;
                currentRate += f;
                if (timeToHere + (x/currentRate) < currentBest) {
                    currentBest = timeToHere + (x/currentRate);
                } else {
                    notDone = false;
                }
            }
            
            System.out.println("Case #" + (count+1) + ": " + currentBest);
            
        }
        
    }

}
