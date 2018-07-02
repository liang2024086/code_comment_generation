package methodEmbedding.Revenge_of_the_Pancakes.S.LYD254;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by evgenbar on 4/9/2016.
 */
public class RevengeOfThePancakes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.valueOf(br.readLine());
        List<String> testCases = new LinkedList<>();
        for (int i = 0; i < numOfTestCases; i++) {
            testCases.add(br.readLine());
        }

        List<Integer> results = testCases.parallelStream().map(testCase -> {
                    boolean faceUp[] = new boolean[testCase.length()];
                    for (int i = 0; i < testCase.length(); i++) {
                        faceUp[i] = testCase.charAt(i) == '+';
                    }
                    int flipTimes = 1;
                    int flippedCount = 0;
                    while (true) {
                        faceUp[flippedCount] = !faceUp[flippedCount];
                        if (flippedCount == (faceUp.length - 1))
                            break;
                        if (faceUp[flippedCount] == faceUp[flippedCount + 1]) {
                            flipTimes++;
                            flippedCount = 0;
                        } else {
                            flippedCount++;
                        }
                    }
                    return faceUp[0] ? flipTimes : flipTimes - 1;
                }
        ).collect(Collectors.toList());

        for (int i = 0; i < numOfTestCases; i++) {
            System.out.println("Case #" + (i + 1) + ": " + results.get(i));
        }
    }
}
