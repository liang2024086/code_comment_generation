package methodEmbedding.Standing_Ovation.S.LYD2046;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by singhp3 on 4/11/2015.
 */
public class StandingOvation {

    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new FileReader(
                    "data/codejam/2015/StandingOvation/A-small-attempt0.in"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "data/codejam/2015/StandingOvation/A-small-attempt0.out"));

            Scanner s = new Scanner(reader);
            int t = s.nextInt();

            for (int z = 0; z < t; z++) {

                int smax = s.nextInt();
                String slevels = s.next();

                int standing = 0;
                int needed = 0;

                for (int sl = 0; sl <= smax; sl++) {


                    int nPersons = slevels.charAt(sl) - '0';

                    int diff = sl - standing;
                    diff = diff > 0 ? diff : 0;

                    needed += diff;
                    standing += nPersons + diff;
                }

                writer.write("Case #" + (z + 1) + ": " + needed);
                writer.newLine();
            }

            reader.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
