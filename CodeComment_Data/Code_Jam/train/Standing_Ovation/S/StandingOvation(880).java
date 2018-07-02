package methodEmbedding.Standing_Ovation.S.LYD1749;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author Chen
 */
public class StandingOvation {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new FileWriter("standingovationout.txt"));
        int maxInput = Integer.parseInt(in.readLine());
        for (int counter = 0; counter < maxInput; counter++) {
            StringTokenizer reader = new StringTokenizer(in.readLine());
            int maxLine = Integer.parseInt(reader.nextToken());
            String people = reader.nextToken();
            int peopleNeeded = 0;
            int temp = 0;
            for (int counter2 = 0; counter2 < people.length(); counter2++) {
                if (temp + peopleNeeded < counter2) {
                    peopleNeeded += counter2 - temp - peopleNeeded;
                }
                temp += (people.charAt(counter2) - '0');
            }
            System.out.println("Case #"+(counter+1)+": "+peopleNeeded);
            out.println("Case #"+(counter+1)+": "+peopleNeeded);
        }
        out.close();
        System.exit(0);
    }
}
