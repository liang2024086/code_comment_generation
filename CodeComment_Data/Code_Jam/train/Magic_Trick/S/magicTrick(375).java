package methodEmbedding.Magic_Trick.S.LYD1147;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * User: Chester
 * Date: 4/12/14
 * Time: 7:46 AM
 */
public class magicTrick {

    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int cases = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < cases; i++) {

            int rowAnswer = Integer.parseInt(reader.readLine().trim());
            String[][] grid1 = {reader.readLine().split(" "), reader.readLine().split(" "), reader.readLine().split(" "), reader.readLine().split(" ")};
            int rowAnswer2 = Integer.parseInt(reader.readLine().trim());
            String[][] grid2 = {reader.readLine().split(" "), reader.readLine().split(" "), reader.readLine().split(" "), reader.readLine().split(" ")};
            Magician magician = new Magician(grid1, grid2, rowAnswer, rowAnswer2);
            System.out.println("Case #" + (i + 1) + ": " + magician.solve());

        }

    }


}
