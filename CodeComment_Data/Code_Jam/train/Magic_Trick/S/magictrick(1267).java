package methodEmbedding.Magic_Trick.S.LYD106;

import java.io.*;
import java.util.StringTokenizer;

public class magictrick {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("magictrick.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("magictrick.out")));
        int numCases = Integer.parseInt(f.readLine());
        for (int i = 0; i < numCases; i++) {
            boolean[] checks = new boolean[16];
            int answer1 = Integer.parseInt(f.readLine());

            for (int j = 0; j < 4; j++) {
                StringTokenizer stringTokenizer = new StringTokenizer(f.readLine());
                if (j + 1 == answer1) {
                    continue;
                }
                for (int k = 0; k < 4; k++) {
                    int x = Integer.parseInt(stringTokenizer.nextToken());
                    checks[x - 1] = true;
                }
            }
            int answer2 = Integer.parseInt(f.readLine());

            for (int j = 0; j < 4; j++) {
                StringTokenizer stringTokenizer = new StringTokenizer(f.readLine());
                if (j + 1 == answer2) {
                    continue;
                }
                for (int k = 0; k < 4; k++) {
                    int x = Integer.parseInt(stringTokenizer.nextToken());
                    checks[x - 1] = true;
                }
            }
            int numFound = 0;
            int numberPossibleAnswer = 0;
            for (int j = 0; j < 16; j++) {
                if (!checks[j]) {
                    numFound++;
                    numberPossibleAnswer = j + 1;
                }
            }
            if (numFound == 0) {
                out.println("Case #" + (i + 1) + ": Volunteer cheated!");
            } else if (numFound > 1) {
                out.println("Case #" + (i + 1) + ": Bad magician!");
            } else {
                out.println("Case #" + (i + 1) + ": " + numberPossibleAnswer);
            }
        }
        out.close();
    }
}
