package methodEmbedding.Revenge_of_the_Pancakes.S.LYD863;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProblemA {

    private static final String TEST_PATHS = "/Users/boney/projects/codejam/inout/";

    public static void main(String[] args) throws IOException {
        String problemA = "ProblemA";
        FileWriter fw = new FileWriter(TEST_PATHS + problemA + ".out");
        Scanner in = new Scanner(new FileInputStream(TEST_PATHS + problemA + ".in"));


        int totalTests = in.nextInt();
        for (int i = 0; i < totalTests; i++) {
            String line = in.next();
            char[] arr = line.toCharArray();
            int last = arr.length - 1;
            int flips = 0;
            while(last >= 0) {
                if (arr[last] == '-') {
                    int start = 0;
                    char startChar = arr[start];
                    char alt = '+';
                    if (startChar == '+') {
                        alt = '-';
                    }
                    while (start <= last && arr[start] == startChar) {
                        arr[start++] = alt;
                    }
                    flips++;
                }
                while (last >= 0 && arr[last] == '+') {
                    last--;
                }
            }
            fw.write("Case #" + (i + 1) + ": " + flips + "\n");
        }
        fw.flush();
        fw.close();
    }

}
