package methodEmbedding.Standing_Ovation.S.LYD1091;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author vanessi
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("Q1.in"));
        try (FileWriter output = new FileWriter("Q1.out")) {
            int cases = 1;
            int testcases = Integer.parseInt(input.readLine());
            while (testcases-- > 0) {
                StringTokenizer line = new StringTokenizer(input.readLine());
                int SM = Integer.parseInt(line.nextToken());
                String audience = line.nextToken();
                int past = 0;
                int need = 0;
                for (int i = 0; i <= SM; i++) {
                    int x = Integer.parseInt(audience.charAt(i) + "");
                    if (i > past) {
                        need += (i - past);
                        past += ((i - past) + x);
                    } else {
                        past += x;
                    }
                }
                output.append("Case #" + (cases++) + ": " + need + "\n");
            }
        }
    }
}
