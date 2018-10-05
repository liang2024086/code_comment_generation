package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1111;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Yaroslav
 * @since 12-Apr-14
 */
public class ProblemBCookieClickerAlpha {

    /**
     * Usage: java ProblemBCookieClickerAlpha < fileIn.txt > fileOut.txt
     *
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        // Scanner scanner = new Scanner(new File("C:\\Dropbox\\java\\projects\\google-codejam-2014\\inputs\\qualification\\Problem B. Cookie Clicker Alpha - sample.txt"));
        byte testsCount = scanner.nextByte();

        for (byte i = 0; i < testsCount; i++) {
            double C = scanner.nextDouble();
            double F = scanner.nextDouble();
            double X = scanner.nextDouble();

            double velocity = 2; // initial velocity
            double timeRequired = X / velocity;
            double timeToBuyANewFarm = C / velocity;
            double timeAlreadySpent = 0;

            while (true) {
                // consider to buy a farm
                if (timeRequired <= timeToBuyANewFarm) {
                    // no need to buy a new farm
                    System.out.println("Case #"+ (i+1) + ": " + timeRequired);
                    break;
                } else {
                    // if we would bought a farm
                    double timeRequiredAfterFarmIsBought = timeAlreadySpent + timeToBuyANewFarm + X / (velocity + F);
                    if (timeRequired <= timeRequiredAfterFarmIsBought) {
                        // no need to buy a new farm
                        System.out.println("Case #"+ (i+1) + ": " + timeRequired);
                        break;
                    } else {
                        // let's buy a farm
                        timeAlreadySpent = timeAlreadySpent + timeToBuyANewFarm;
                        timeRequired = timeRequiredAfterFarmIsBought;
                        velocity += F;
                        timeToBuyANewFarm = C / velocity;
                    }
                }
            }
        }
    }
}


