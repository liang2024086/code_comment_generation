package methodEmbedding.Counting_Sheep.S.LYD796;


import java.io.*;
import java.util.*;

/**
 * Solver for the counting sheep problem of the Google Code Jam 2016 qualification round.
 *
 * @author Simon Posada Fishman
 */
public class Solver {


    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
            PrintWriter writer = new PrintWriter("output.txt", "UTF-8");

            String line;
            int numCases = Integer.valueOf(br.readLine());
            int caseNum = 1;


            while ((line = br.readLine()) != null && caseNum <= numCases) {
                HashSet<Character> digits = new HashSet<>();

                int n = Integer.valueOf(line);
                int i = 1;
                int result = -1;

                while (true) {

                    // Check for insomnia
                    if (result == n * i) {
                        writer.println("Case #" + caseNum + ": INSOMNIA");
                        break;
                    } else {
                        result = n * i; // Calculate
                    }

                    // Add to digits list
                    char[] ds = ("" + result).toCharArray();
                    for (char d : ds) {
                        digits.add(d);
                    }

                    // Check for completion of case
                    if (digits.size() == 10) {
                        writer.println("Case #" + caseNum + ": " + result);
                        break;
                    } else
                        i++;
                }
                caseNum ++;
            }

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
