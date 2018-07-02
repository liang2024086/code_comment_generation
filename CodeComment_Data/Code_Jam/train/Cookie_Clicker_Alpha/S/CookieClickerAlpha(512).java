package methodEmbedding.Cookie_Clicker_Alpha.S.LYD228;

import java.io.File;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
            Scanner scanner = new Scanner(new File("input/cookieClickerAlpha2.txt"));
            int numCases = scanner.nextInt();
            int current = 1;
            
            //long ticks = new Date().getTime();

            while(current <= numCases) {
                System.out.print("Case #" + current + ": ");
                
                double farmCost = scanner.nextDouble();
                double farmProductionRate = scanner.nextDouble();
                double cookieGoal = scanner.nextDouble();
                
                double currentRate = 2.0f;         
                double totalTime = 0.0f;
                
                // Which is better.  Adding a farm or just getting cookies?
                while(true) {
                	double timeToWait = cookieGoal / currentRate;
                	double timeWithFarm = (cookieGoal / (currentRate + farmProductionRate)) + (farmCost / currentRate);
                	if(timeToWait <= timeWithFarm) {
                		totalTime += timeToWait;
                		break;
                	} else {
                		totalTime += farmCost / currentRate;
                		currentRate += farmProductionRate;
                	}
                }
                
                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(7);
                nf.setMinimumFractionDigits(7);
                System.out.println(nf.format(totalTime));
                
                current++;
            }
            
            //System.out.println("Time: " + ((new Date().getTime() - ticks) / 1000) + " seconds");
            scanner.close();
        } catch (Exception ex) {
            System.out.println("An error occurred: " + ex.getMessage());
            ex.printStackTrace();
        }

	}

}
