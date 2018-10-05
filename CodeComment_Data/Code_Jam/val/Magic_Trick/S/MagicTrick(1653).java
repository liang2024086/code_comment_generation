package methodEmbedding.Magic_Trick.S.LYD2184;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class MagicTrick {

    public static void main(String[] args) throws IOException {
        Scanner myscanner = new Scanner(new File("A-small-attempt0.in"));
        int cases = myscanner.nextInt();
        myscanner.nextLine();
        for (int i = 1; i <= cases; ++i) {
            int[] numberCount = new int[16];
            for (int j = 0; j < 16; ++j) {
                numberCount[j] = 0;
            }
            for (int r = 1; r <= 2; ++r) {
                int rowNumber = myscanner.nextInt();
                myscanner.nextLine();
                for (int j = 1; j < rowNumber; ++j) {
                    myscanner.nextLine();
                }
                for (int j = 1; j <= 4; ++j) {
                    numberCount[myscanner.nextInt() - 1]++;
                }
                myscanner.nextLine();
                for (int j = rowNumber + 1; j <= 4; ++j) {
                    myscanner.nextLine();
                }
            }
            int candidate = 0;
            for (int j = 0; j < 16; ++j) {
                if (numberCount[j] == 2) {
                    if (candidate == 0) {
                        candidate = j + 1;
                    }
                    else {
                        candidate = -1;
                        break;
                    }
                }
            }
            if (candidate == 0) {
                System.out.println("Case #" + i + ": Volunteer cheated!");
            }
            else if (candidate == -1) {
                System.out.println("Case #" + i + ": Bad magician!");
            }
            else {
                System.out.println("Case #" + i + ": " + candidate);
            }
        }
    }
}
