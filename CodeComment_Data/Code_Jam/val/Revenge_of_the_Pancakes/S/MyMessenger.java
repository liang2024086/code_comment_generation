package methodEmbedding.Revenge_of_the_Pancakes.S.LYD162;

import java.io.*;
import java.util.Scanner;

public class MyMessenger {
    public static void main(String... args) throws IOException {
        Scanner in = new Scanner(new File("java/B-small-attempt0.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter(new File("java/out.txt")));

        int problemCount = in.nextInt();
        in.nextLine();

        for (int problem = 1; problem <= problemCount; problem++) {
            char[] line = in.nextLine().toCharArray();
            char current = line[line.length - 1];
            int result = 0;

            if (current == '-') {
                result++;
            }

            for (int index = line.length - 2; index >= 0; index--) {
                if (line[index] != current) {
                    current = line[index];
                    result++;
                }
            }

            out.write(String.format("Case #%d: %d\n", problem, result));
        }

        out.close();
    }
}

