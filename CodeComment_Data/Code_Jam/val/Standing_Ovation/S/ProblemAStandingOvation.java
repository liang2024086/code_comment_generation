package methodEmbedding.Standing_Ovation.S.LYD1556;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yaroslav
 * @since 11-Apr-15
 */
public class ProblemAStandingOvation {

    /**
     * Usage: java ProblemAStandingOvation < fileIn.txt > fileOut.txt
     *
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        // Scanner scanner = new Scanner(new File("C:\\Dropbox\\java\\projects\\google-codejam-2014\\inputs\\qualification\\Problem B. Cookie Clicker Alpha - sample.txt"));
        byte testCount = scanner.nextByte();

        for (byte t = 0; t < testCount; t++) {
            // read and transform inputs
            int Smax = scanner.nextInt();
            String audienceStr = scanner.next();

            byte[] audience = new byte[Smax+1];
            for (int i = 0; i < Smax + 1; i++) {
                audience[i] = Byte.parseByte(audienceStr.charAt(i) + "");
            }

            int friendsNeeded = 0;

            int shynessAcc = 0;
            for (int i = 0; i < audience.length; i++) {
                if (i > shynessAcc) {
                    friendsNeeded += i - shynessAcc;
                    shynessAcc += audience[i] + (i - shynessAcc);
                } else {
                    shynessAcc += audience[i];
                }
            }

            System.out.println("Case #"+ (t+1) + ": " + friendsNeeded);
        }
    }
}


