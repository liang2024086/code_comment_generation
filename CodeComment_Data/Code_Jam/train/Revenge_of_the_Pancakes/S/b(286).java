package methodEmbedding.Revenge_of_the_Pancakes.S.LYD737;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int caseCount = Integer.parseInt(br.readLine());
            for (int caseNum = 1; caseNum <= caseCount; caseNum++) {
                int flips = 0;
                String line = br.readLine();
                for (int i = line.length() - 1; i >= 0; i--) {
                    if (line.charAt(i) == '-' && flips % 2 == 0 || line.charAt(i) == '+' && flips % 2 == 1) {
                        flips++;
                    }
                }
                System.out.println("Case #" + caseNum + ": " + flips);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
