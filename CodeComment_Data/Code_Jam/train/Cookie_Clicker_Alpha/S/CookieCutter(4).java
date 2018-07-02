package methodEmbedding.Cookie_Clicker_Alpha.S.LYD341;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jamie
 */
public class CookieCutter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();

        for (int caseNum = 0; caseNum < numCases; caseNum++) {
            double C = scanner.nextFloat();
            double F = scanner.nextFloat();
            double X = scanner.nextFloat();
            boolean notDone = true;
            int farms = 0;
            double timeTaken = 0;
 
            while (notDone) {
                double cookiesPerSecond = 2 + (farms * F);

                //# seconds needed to afford next cookie farm
                double secondsTillFarm = C / cookiesPerSecond;
                //# seconds needed to finish if don't buy cookieFarm
                double secondsTillDone = (X / cookiesPerSecond);

                double secondsTillDoneWithNextFarm = X / (cookiesPerSecond + F);

                /**
                 * if the time it takes to buy another farm, plus the time it
                 * would take to get enough cookies with that farm is LESS than
                 * the time it would take to get enough cookies with only
                 * current farms then buy another farm
                 */
                double buyingNextFarmTime = secondsTillFarm + secondsTillDoneWithNextFarm;
                if (buyingNextFarmTime < secondsTillDone) {
                    farms++;//buy another farm
                    timeTaken += secondsTillFarm;
                } else {//dont buy a farm and finish up
                    timeTaken += secondsTillDone;
                    System.out.printf("Case #" + (caseNum + 1) + ": %.7f \n", timeTaken);
                    notDone = false;
                }
            }

        }
    }
}
