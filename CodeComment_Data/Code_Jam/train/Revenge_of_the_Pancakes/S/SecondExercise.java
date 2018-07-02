package methodEmbedding.Revenge_of_the_Pancakes.S.LYD101;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by proson on 4/9/16.
 */
public class SecondExercise {

    public static void main(String[] args) throws IOException {
        String inputFileName = "B-small-attempt0";
        String basePath = "/opt/dev/java/wspace_intellij/codejam/Round_1C_2010/src/main/resources/prosonf.codejam.april2016/SecondExercise";
        String inputPathName = basePath + "/" + inputFileName + ".in";
        String outputPathName = basePath + "/" + inputFileName + ".out";
        Scanner scanner = new Scanner(new FileInputStream(new File(inputPathName)));

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(outputPathName), StandardOpenOption.CREATE_NEW)) {
        }

        int testCases = scanner.nextInt();
        scanner.nextLine();
        IntStream.rangeClosed(1, testCases).forEach(testCase -> {

            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(outputPathName), StandardOpenOption.APPEND)) {

                String stack = scanner.nextLine();
                String[] stackBasicArray = stack.split("");
                ArrayList<String> stackArray = new ArrayList<>(stackBasicArray.length);
                stackArray.addAll(Arrays.asList(stackBasicArray));

                long numberOfFlips = 0;

                int startingFlipPoint = stackArray.lastIndexOf("-");
                while (startingFlipPoint >= 0) {
                    IntStream.rangeClosed(0, startingFlipPoint).forEach(index ->
                            stackArray.set(index, "+".equals(stackArray.get(index)) ? "-" : "+")
                    );

                    numberOfFlips++;
                    startingFlipPoint = stackArray.lastIndexOf("-");
                }

                bufferedWriter.write(String.format("Case #%d: %d\n", testCase, numberOfFlips));

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
