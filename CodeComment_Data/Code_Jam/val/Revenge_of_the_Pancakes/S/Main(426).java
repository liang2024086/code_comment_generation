package methodEmbedding.Revenge_of_the_Pancakes.S.LYD653;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("B-small-attempt1.in");
        Scanner scanner = new Scanner(inputFile);
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        int nTests = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nTests; i++) {
            int flipCount = 0;
            String string = scanner.nextLine();
            char[] stack = string.toCharArray();
            char previous = stack[0];
            for (int j = 1; j < stack.length; j++) {
                char current = stack[j];
                if (previous != current) {
                    flipCount += 1;
                }
                previous = current;
            }
            if (stack[stack.length - 1] == '-') {
                flipCount += 1;
            }

            writer.write("Case #" + (i + 1) + ": " + flipCount);
            writer.newLine();
            writer.flush();
        }
    }
}
