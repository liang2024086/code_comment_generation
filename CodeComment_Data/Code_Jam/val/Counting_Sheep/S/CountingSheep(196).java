package methodEmbedding.Counting_Sheep.S.LYD879;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSheep {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.valueOf(br.readLine());
        List<Integer> testCases = new LinkedList<>();
        for (int i = 0; i < numOfTestCases; i++) {
            testCases.add(Integer.valueOf(br.readLine()));
        }

        List<String> results = testCases.parallelStream().map(testCase -> {
                    if (testCase == 0) return "INSOMNIA";
                    boolean seen[] = new boolean[10];
                    int countSeen = 0;
                    int count = 1;
                    Integer lastNum = 0;
                    while (countSeen != 10) {
                        lastNum = testCase * count++;
                        int rest = lastNum;
                        while (rest != 0) {
                            int lastDigit = rest % 10;
                            if (!seen[lastDigit]) {
                                seen[lastDigit] = true;
                                countSeen++;
                            }
                            rest = rest / 10;
                        }
                    }
                    return lastNum.toString();
                }
        ).collect(Collectors.toList());

        for (int i = 0; i < numOfTestCases; i++) {
            System.out.println("Case #" + (i+1) + ": " + results.get(i));
        }
    }

}
