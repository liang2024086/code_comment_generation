package methodEmbedding.Cookie_Clicker_Alpha.S.LYD897;

import java.util.Scanner;

// We can either buy a farm or win
// We should only buy a farm if it saves us time
// How much time will buying a farm save us?
// It will only save us time if it can make its cost back by the end of the game

public class CookieClicker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int testCases = in.nextInt();

        for (int testCase = 1; testCase <= testCases; testCase++) {
            final double baseRate = 2;
            final double farmCost = in.nextDouble();
            final double farmProduction = in.nextDouble();
            final double target = in.nextDouble();


            double currentRate = baseRate;
            double currentCookies = 0;
            double currentTime = 0;

            int farms = 0;

            while (currentCookies < target) {
                // Step forward to the next important destination
                double nextDestination = Math.min(target, farmCost);
                currentTime += (nextDestination - currentCookies)/currentRate;
                currentCookies = nextDestination;

                // Try buying a farm if it's worthwhile
                if (currentCookies >= farmCost) {
                    double distance = target - currentCookies;
                    double currentETA = currentTime + (distance / currentRate);

                    double potentialNewRate = currentRate + farmProduction;
                    double potentialNewDistance = distance + farmCost;
                    double potentialETA = currentTime + (potentialNewDistance / potentialNewRate);

                    if (potentialETA < currentETA) {
                        // We should buy a farm!
                        currentCookies -= farmCost;
                        currentRate += farmProduction;
                        farms++;
                    }
                    else {
                        // No point buying a farm. Skip to the end
                        currentTime += (target - currentCookies)/currentRate;
                        currentCookies = target;
                    }
                }
            }

            System.out.println("Case #" + testCase + ": " + currentTime);
        }
    }
}
