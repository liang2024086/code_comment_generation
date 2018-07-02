package methodEmbedding.Standing_Ovation.S.LYD336;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StandingOvation {
    public static void main(String[] args) throws IOException {
        FileOutputStream fop = null;
        PrintStream printStream = null;

        try {
            Scanner in = new Scanner(System.in);
            File file = new File("C:\\java\\codejam\\out\\out.txt");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            fop = new FileOutputStream(file);
            printStream = new PrintStream(fop);

            int numTests = in.nextInt();
            for (int t = 0; t < numTests; t++) {
                int sMax = in.nextInt();
                int[] s = new int[sMax+1];
                int[] cummulativeS = new int[sMax+1];
                String digitString = in.next();
                for (int i = 0; i <= sMax; i++) {
                    s[i] = Integer.parseInt(Character.toString(digitString.charAt(i)));
                    cummulativeS[i] = s[i] + (i == 0 ? 0 : cummulativeS[i-1]);
                }

                int totalAddedFriends = 0;
                for (int i = sMax; i > 0 ; i--) {
                    if (cummulativeS[i-1] >= i) {
                        continue;
                    } else {
                        int addedFriends = i - cummulativeS[i-1];
                        for (int j = 0; j <= sMax; j++) {
                            cummulativeS[j] += addedFriends;
                        }
                        totalAddedFriends += addedFriends;
                    }
                }

                printStream.format("Case #%d: %d\n", t + 1, totalAddedFriends);
            }
        } finally {
            if (printStream != null) {
                try {
                    printStream.close();
                } catch (Exception e) {}
            }
            if (fop != null) {
                try {
                    fop.close();
                } catch (Exception e) {}
            }
        }
    }

}
