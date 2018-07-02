package methodEmbedding.Standing_Ovation.S.LYD1369;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            String persons = in.next();
            int alreadyStand = new Integer(persons.charAt(0) + "");
            int friends = 0;
            for (int j = 1; j < n + 1; j++) {
                if (alreadyStand < j) {
                    friends += j - alreadyStand;
                    alreadyStand = j;
                }
                alreadyStand += new Integer(persons.charAt(j) + "");
            }

            out.println("Case #" + (i + 1) + ": " + friends);
        }
        out.close();
    }
}
