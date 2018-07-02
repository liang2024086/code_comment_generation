package methodEmbedding.Magic_Trick.S.LYD1484;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author Tom
 */
public class GoogleCodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = null;
        MagicTrick[] puzzles;
        try {
            input = new Scanner(new FileInputStream("input.txt"));
            puzzles = MagicTrick.readFile(input);
            input.close();
        }
        catch(Exception e) {
            System.out.println(e);
            System.exit(0);
            return;
        }
        
        String[] results = new String[puzzles.length];
        for(int i = 0; i < puzzles.length; ++i) {
            results[i] = "Case #" + (int)(i + 1) + ": " + puzzles[i].solve();
            //System.out.println(results[i]);
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
