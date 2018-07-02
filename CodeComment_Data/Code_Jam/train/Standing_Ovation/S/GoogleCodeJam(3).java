package methodEmbedding.Standing_Ovation.S.LYD1946;

import java.io.*;
import java.util.*;

/**
 *
 * @author Tom
 */
public class GoogleCodeJam {
    public static void main(String[] args) {
        Scanner input = null;
        //MagicTrick[] puzzles;
        //CookieClickerAlpha[] puzzles;
        StandingOvation[] puzzles;
        try {
            input = new Scanner(new FileInputStream("input.in"));
            //puzzles = MagicTrick.readFile(input);
            //puzzles = CookieClickerAlpha.readFile(input);
            puzzles = StandingOvation.readFile(input);
            input.close();
        }
        catch(Exception e) {
            System.out.println("hi");
            System.out.println(e);
            System.exit(0);
            return;
        }
        
        String[] results = new String[puzzles.length];
        for(int i = 0; i < puzzles.length; ++i) {
            results[i] = "Case #" + (int)(i + 1) + ": " + puzzles[i].solve();
        }
        
        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileOutputStream("output.txt"));
            for(int i = 0; i < results.length; ++i) {
                output.println(results[i]);
            }
            output.close();
        }
        catch(Exception e) {
            System.out.println(e);
            System.exit(0);
            return;
        }
    }
}
