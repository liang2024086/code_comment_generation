package methodEmbedding.Counting_Sheep.S.LYD757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestCases = Integer.parseInt(br.readLine());
        Integer inputs[] = new Integer[noOfTestCases];
        for (int i = 0; i < noOfTestCases; i++) {
            inputs[i] =  Integer.parseInt(br.readLine().trim());
        }

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] == 0) {
                System.out.println("Case #" + (i + 1) + ": INSOMNIA");
                continue;
            }
            if (inputs[i] == 1) {
                System.out.println("Case #" + (i + 1) + ": " + 10);
                continue;
            }
            Set<Character> digits = new HashSet<Character>();
            for (int j = 1; j != 0; j++) {
                int product = j * inputs[i];
                while (product > 0) {
                    int d = product / 10;
                    int k = product - d * 10;
                    product = d;
                    digits.add((char) k);
                }
                if (digits.size() == 10) {
                    System.out.println("Case #" + (i + 1) + ": " + j * inputs[i]);
                    break;
                }
            }
        }
    }
}
