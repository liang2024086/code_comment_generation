package methodEmbedding.Counting_Sheep.S.LYD1525;


import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;


public class Sheep {
    private static final String TEST_FILE_NAME = "/Users/apovh/projects/GooglePractice/src/jam2016/A-small";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(TEST_FILE_NAME + ".in.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter(TEST_FILE_NAME + ".out"));

        Integer casesNum = Integer.valueOf(reader.readLine());
        System.out.println("index = " + casesNum);
        long startTime = System.currentTimeMillis();

        Collection<Integer> numbersPreset = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        for (int i = 1; i <= casesNum; i++) {
            int startNum = Integer.parseInt(reader.readLine());
            int multiplier = 1;
            int prevNum = -1;
            int currentNum = -1;
            HashSet<Integer> seenNumbers = new HashSet<Integer>(numbersPreset);
            String lastNumber = null;
            while (!seenNumbers.isEmpty()) {
                currentNum = multiplier * startNum;

                if (multiplier > 1 && currentNum == prevNum) {
                    lastNumber = "INSOMNIA";
                    break;
                }
                multiplier++;
                prevNum = currentNum;

                int tempValue = currentNum;
                while (tempValue > 0) {
                    seenNumbers.remove(tempValue % 10);
                    tempValue /= 10;
                }
            }

            lastNumber = lastNumber != null ? lastNumber : Integer.toString(currentNum);

            String caseResult = "Case #" + i + ": " + lastNumber;
            System.out.println(caseResult);
            writer.write(caseResult);
            writer.newLine();
        }

        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));

        reader.close();
        writer.close();
    }
}
