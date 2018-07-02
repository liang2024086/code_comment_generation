package methodEmbedding.Magic_Trick.S.LYD1923;

import com.google.common.collect.*;
import com.google.common.io.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter myOut = Files.newWriter(new File("output.txt"), Charset.defaultCharset());
        Scanner myScanner = new Scanner(new File("input.txt"));

        int numCases = myScanner.nextInt();
        System.out.println(numCases + " cases\n");

        for (int i = 0; i < numCases; i++) {
            int answer1 = myScanner.nextInt();
            Set<Integer> row1 = Sets.newHashSet();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int nextInt = myScanner.nextInt();
                    if (answer1 == j + 1) {
                        row1.add(nextInt);
                    }
                }
            }

            int answer2 = myScanner.nextInt();
            Integer answer = null;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int nextInt = myScanner.nextInt();
                    if (answer2 == j + 1) {
                        if (row1.contains(nextInt)) {
                            answer = answer == null ? nextInt : -1;
                        }
                    }
                }
            }
            String ansStr = answer == null ? "Volunteer cheated!" : answer == -1 ? "Bad magician!" : answer.toString();
            System.out.print("Case #" + (i+1) + ": " + ansStr);
            myOut.append("Case #" + (i+1) + ": " + ansStr);
            myOut.append("\n");
            System.out.println("\n");
        }
        myOut.close();
    }
}
