package methodEmbedding.Standing_Ovation.S.LYD133;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StandingOvation {

    public static void main(String[] args) {
        Scanner input;
        PrintWriter printWriter;
        try {
            input = new Scanner(new File("A-small-attempt0.in"));
            File file = new File("A-small-attempt0.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            printWriter = new PrintWriter(file);

            int t = Integer.parseInt(input.nextLine().trim());
            String[] line;
            int audCount, friendCount;
            for (int i = 0; i < t; i++) {
                audCount = 0;
                friendCount = 0;

                line = input.nextLine().trim().split(" ");
                int sMax = Integer.parseInt(line[0]);
                for (int j = 0; j <= sMax; j++) {
                    audCount += Integer.parseInt(String.valueOf(line[1].charAt(j)));
                    if ((j + 1) > audCount) {
                        friendCount++;
                        audCount++;
                    }
                }
                printWriter.println("Case #" + (i + 1) + ": " + friendCount);
                input.hasNext();
            }

            printWriter.flush();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StandingOvation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StandingOvation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
