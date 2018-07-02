package methodEmbedding.Counting_Sheep.S.LYD240;

import java.io.*;
import java.util.Scanner;

public class MyMessenger {
    public static void main(String... args) throws IOException {
        Scanner in = new Scanner(new File("java/A-small-attempt0.in"));
        BufferedWriter out = new BufferedWriter(new FileWriter(new File("java/out.txt")));

        int problemCount = in.nextInt();

        for (int problem = 1; problem <= problemCount; problem++) {
            int base = in.nextInt();
            int current = base;
            String result = "INSOMNIA";

            boolean[] checked = new boolean[10];
            int checkedCount = 0;

            while (current != 0) {
                System.out.println(current);
                char[] chars = String.valueOf(current).toCharArray();

                for (char c : chars) {
                    int digit = c - '0';
                    if (!checked[digit]) {
                        checked[digit] = true;
                        checkedCount++;
                    }
                }

                if (checkedCount == 10) {
                    result = String.valueOf(current);
                    break;
                }

                current += base;
            }

            out.write(String.format("Case #%d: %s\n", problem, result));
        }

        out.close();
    }
}

