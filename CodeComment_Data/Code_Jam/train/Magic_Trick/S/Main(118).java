package methodEmbedding.Magic_Trick.S.LYD725;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Codejam 2014
 * User: maurya
 * Date: 12/4/14
 * Time: 12:23 PM
 */
public class Main {
    public static void main(String args[]) throws Exception {
        InputStream is = System.in;
        if (args != null && args.length > 0 && args[0] != null) {
            is = new FileInputStream(new File(args[0]));
        }
        Scanner in = new Scanner(is);
        int _tests = in.nextInt();
        for (int _t = 1; _t <= _tests; _t++) {
            System.out.print("Case #" + _t + ": ");
            int choice1 = in.nextInt();
            List<Integer> row = new ArrayList<Integer>();
            for (int i = 1; i <= 4; i++) for (int j = 1; j <= 4; j++){
                int card = in.nextInt();
                if (i == choice1) {
                    row.add(card);
                }
            }
            int choice2 = in.nextInt();
            int totGuess = 0, guessedCard = 0;
            for (int i = 1; i <= 4; i++) for (int j = 1; j <= 4; j++) {
                int card = in.nextInt();
                if (i == choice2 && row.contains(card)) {
                    totGuess++;
                    guessedCard = card;
                }
            }
            System.out.println(totGuess > 0 ? (totGuess == 1 ? guessedCard : "Bad magician!"):("Volunteer cheated!"));
        }
    }
}

