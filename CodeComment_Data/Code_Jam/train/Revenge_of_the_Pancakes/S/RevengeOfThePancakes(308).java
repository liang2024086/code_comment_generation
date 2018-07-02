package methodEmbedding.Revenge_of_the_Pancakes.S.LYD17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevengeOfThePancakes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestCases = Integer.parseInt(br.readLine());
        String inputs[] = new String[noOfTestCases];
        for (int i = 0; i < noOfTestCases; i++) {
            inputs[i] = br.readLine().trim();
        }

        for (int i = 0; i < noOfTestCases; i++) {
            StringBuilder initialStack = new StringBuilder(inputs[i]);
            int j = 0;
            while (initialStack.indexOf("-") != -1) {
                int lastBlankSide = initialStack.lastIndexOf("-");
                initialStack = new StringBuilder(initialStack.substring(0, lastBlankSide+1));
                for (int k = 0; k < initialStack.length(); k++) {
                    if (initialStack.charAt(k) == '-') {
                        initialStack.replace(k, k+1, "+");
                    }else{
                        initialStack.replace(k, k+1, "-");
                    }
                }
                j++;
            }
            System.out.println("Case #" + (i + 1) + ": " + j);
        }
    }
}
