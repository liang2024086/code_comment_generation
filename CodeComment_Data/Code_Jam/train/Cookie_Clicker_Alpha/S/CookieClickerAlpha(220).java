package methodEmbedding.Cookie_Clicker_Alpha.S.LYD334;

import java.util.Scanner;

public class CookieClickerAlpha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numTests = in.nextInt();
        for (int t = 0; t < numTests; t++) {
            double farmCost = in.nextDouble();
            double farmProductionRate = in.nextDouble();
            double goal = in.nextDouble();

            double time = 0;
            int numberOfFarms = 0;
            double prevGoalEvent = Double.MAX_VALUE;

            while (true) {
                final double currentRateOfProduction = numberOfFarms * farmProductionRate + 2;
                double nextFarmBuyingEvent = farmCost / currentRateOfProduction;
                double nextGoalEvent = goal / currentRateOfProduction;
                if (prevGoalEvent < (nextGoalEvent + time)) {
                    time = prevGoalEvent;
                    break;
                } else if (nextFarmBuyingEvent < nextGoalEvent) {
                    goal -= (nextFarmBuyingEvent * currentRateOfProduction - farmCost);
                    prevGoalEvent = nextGoalEvent + time;
                    time += nextFarmBuyingEvent;
                    numberOfFarms++;

                } else {
                    time += nextGoalEvent;
                    break;
                }
            }

            System.out.format("Case #%d: %.7f\n", t + 1, time);
        }
    }
}
