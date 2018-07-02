package methodEmbedding.Counting_Sheep.S.LYD759;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(new FileOutputStream("outputcodejam"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(printStream);
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/testInput.txt"), StandardCharsets.UTF_8);
            int testCases = Integer.parseInt(lines.get(0));
            for (int i = 1; i < testCases + 1; i++) {
                int multiple = 1;
                int number = Integer.parseInt(lines.get(i));
                int foundNumber = 0;
                boolean found = false;
                boolean[] testArray = new boolean[10];
                int numberCopy = number;

                    for (int j = 0; j < 10; j++) {
                        testArray[0] = false;
                    }
                    while (!found) {
                        int numberMultiple = numberCopy * multiple;
                        if (number != 0) {
                            while ((numberMultiple) > 0) {
                                int digit = numberMultiple % 10;
                                testArray[digit] = true;
                                numberMultiple = numberMultiple / 10;
                            }
                            numberCopy = number;
                            for (int j = 0; j < 10; j++) {
                                if (testArray[j] == false) {
                                    found = false;
                                    multiple++;
                                    break;
                                }
                                foundNumber = number * (multiple);
                                found = true;
                            }
                        } else {
                            found = true;
                        }
                    }
                if (number != 0) {
                    System.out.println("Case #" + i + ": " + foundNumber);
                } else {
                    System.out.println("Case #" + i + ": " + "INSOMNIA");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
