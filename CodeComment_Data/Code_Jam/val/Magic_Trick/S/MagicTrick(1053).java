package methodEmbedding.Magic_Trick.S.LYD1662;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MagicTrick {
    private static String TEST_INPUT_FILENAME = "MagicTrick/test_input.txt";
    private static String SMALL_INPUT_FILENAME = "MagicTrick/A-small-attempt0.in";

    public static void main(final String[] args) {
        final String inputFileName = SMALL_INPUT_FILENAME;
        final String outputFileName = inputFileName + ".out";
        int totalTestCases;
        int firstQuestionAnswer;
        int secondQuestionAnswer;
        try (BufferedReader inputReader = new BufferedReader(new FileReader(inputFileName)); BufferedWriter outputWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            totalTestCases = Integer.parseInt(inputReader.readLine());
            for (int testCase = 1; testCase < totalTestCases + 1; testCase++) {
                firstQuestionAnswer = Integer.parseInt(inputReader.readLine());
                List<Set<Integer>>  firstCardSetup = new ArrayList<>();
                for (int i = 0; i < 4; i++) {
                    Set<Integer> lineSet = new HashSet<>();
                    String[] line = inputReader.readLine().split(" ");
                    for (String string : line) {
                        lineSet.add(Integer.parseInt(string));
                    }
                    firstCardSetup.add(lineSet);
                }
                secondQuestionAnswer = Integer.parseInt(inputReader.readLine());
                List<Set<Integer>>  secondCardSetup = new ArrayList<>();
                for (int i = 0; i < 4; i++) {
                    Set<Integer> lineSet = new HashSet<>();
                    String[] line = inputReader.readLine().split(" ");
                    for (String string : line) {
                        lineSet.add(Integer.parseInt(string));
                    }
                    secondCardSetup.add(lineSet);
                }
                // Do set checks
                Set<Integer> firstPickSet = firstCardSetup.get(firstQuestionAnswer - 1);
                Set<Integer> secondPickSet = secondCardSetup.get(secondQuestionAnswer - 1);
                firstPickSet.retainAll(secondPickSet);
                StringBuilder stringBuilder = new StringBuilder("Case #").append(testCase).append(": ");
                if (firstPickSet.size() == 0) {
                    // No joint results, player is cheating
                    stringBuilder.append("Volunteer cheated!");
                } else if (firstPickSet.size() == 1) {
                    // Only 1 match, get it
                    for (Integer output : firstPickSet) {
                        stringBuilder.append(output);
                    }
                } else {
                    // More than 1 match, magician error.
                    stringBuilder.append("Bad magician!");
                }
                outputWriter.write(stringBuilder.toString());
                outputWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
