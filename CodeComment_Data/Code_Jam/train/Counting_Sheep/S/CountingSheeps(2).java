package methodEmbedding.Counting_Sheep.S.LYD1230;

import sun.java2d.pipe.SpanIterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * Created by ashwinch on 4/9/16.
 */
public class CountingSheeps {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String fileName = "A-small-attempt1";
        File inFile = new File(fileName + ".in");
        File outFile = new File(fileName + ".out");
        Scanner in = new Scanner(inFile);
        PrintWriter pr = new PrintWriter(new FileWriter(outFile));

        int T = in.nextInt();

        for (int t = 0; t < T; t++) {

            int N = in.nextInt();
            if (N == 0) {
                pr.println("Case #" + (t + 1) + ": INSOMNIA");
                continue;
            }

            boolean val[] = new boolean[10];
            int count = 0, n = N, counter = 1;

            while (count != 10) {
                while (n > 0) {
                    int d = n % 10;
                    n = n / 10;
                    count = val[d] == false ? count + 1 : count;
                    val[d] = true;
                }

                if (count != 10) {
                    counter++;
                    n = counter * N;
                }
            }

            pr.println("Case #" + (t + 1) + ": " + counter * N);
            //System.out.println(counter*N);
        }

        pr.close();
    }
}
