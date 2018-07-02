package methodEmbedding.Standing_Ovation.S.LYD1059;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Gennadiy on 11.04.2015.
 */
public class InputOutput {

    public static final  String OUTPUT_FORMATTER = "Case #%d: %d \r\n";
    public static final String INPUT_FOLDER = "C:\\JavaProject\\InputFiles\\";
    public static final String OUTPUT_FOLDER = "C:\\JavaProject\\OutputFiles\\";

    public static void main(String[] args) {

        int numberOfTestCases;
        final List<List<Integer>> testCasesList = new ArrayList<List<Integer>>();

        try {
            Files.lines(Paths.get(INPUT_FOLDER,"A-small-attempt0.in")).skip(1).forEach(new Consumer<String>() {
                @Override
                public void accept(String s) {
                    testCasesList.add(Opera.parseInput(s));
                }
            });



            for (int i = 0; i < testCasesList.size(); i++) {
                String outputLine = String.format(OUTPUT_FORMATTER, i + 1, Opera.getNumberOfFrineds(testCasesList.get(i)));
                Files.write(Paths.get(OUTPUT_FOLDER, "output.txt"), outputLine.getBytes(), i == 0 ? StandardOpenOption.CREATE : StandardOpenOption.APPEND);

                System.out.println(outputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
