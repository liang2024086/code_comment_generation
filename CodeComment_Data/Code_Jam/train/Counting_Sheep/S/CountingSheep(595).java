package methodEmbedding.Counting_Sheep.S.LYD1692;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountingSheep {
    public static void main(String[] args) throws Exception {
        String inputFile = "test.txt";
        BufferedReader br = new BufferedReader(new FileReader(new File(inputFile)));
        String line;
        int caseNum = 0;
        int counter = 0;
        while ((line = br.readLine()) != null) {
            if (caseNum == 0) {
                caseNum = Integer.parseInt(line);
                continue;
            } else {
                counter++;
            }
            int n = Integer.parseInt(line);
            int[] seen = new int[10];
            if (n == 0) {
                System.out.format("Case #%d: INSOMNIA\n", counter);
                continue;
            }
            int sum = 0;
            int orig = n;
            int c = 2;
            int fin = 0;
            while (true) {
                while (n > 0) {
                    seen[n % 10] = 1;
                    n /= 10;
                }
                for (int num : seen) {
                    sum += num;
                }
                if (sum == 10) {
                    break;
                } else {
                    sum = 0;
                    n = orig * c;
                    fin = orig * c;
                    c++;
                }
            }
            System.out.format("Case #%d: %d\n", counter, fin);
        }
        br.close();
    }
}
