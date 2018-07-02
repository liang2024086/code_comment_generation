package methodEmbedding.Cookie_Clicker_Alpha.S.LYD845;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int trials = sc.nextInt();
        for (int i = 0; i < trials; i++) {
            double CPS = 2;
            double farmCost = sc.nextDouble();
            double farmCPS = sc.nextDouble();
            double goal = sc.nextDouble();
            double runningTime = 0;
            double prevTimeToGoal = Double.MAX_VALUE;
            double timeToGoal = (goal / CPS);
            double timeToFarm = (farmCost / CPS);
            // double timeToGoal = runningTime + (goal / CPS);
            while (timeToGoal <= prevTimeToGoal) {
                prevTimeToGoal = timeToGoal;
                if (timeToGoal < timeToFarm) {
                    // Don't buy a farm, its cheaper to just go to the goal
                    runningTime += timeToGoal;
                    break;
                } else {
                    // Buy the farm, its cheaper than to get to the goal
                    runningTime += (farmCost / CPS);
                    CPS += farmCPS;
                    timeToGoal = runningTime + (goal / CPS);
                    // System.out.println("Added farm, current time to goal: " +
                    // timeToGoal);
                }
                // Now that I've added a farm, this is the new time to get to
                // the goal, is it better than the previous?
                // System.out.println("Previous time to goal: " +
                // prevTimeToGoal);
            }
            System.out.printf("Case #%d: %.7f%n", (i + 1), prevTimeToGoal);
        }
        sc.close();
    }
}
