package methodEmbedding.Revenge_of_the_Pancakes.S.LYD549;


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
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("src/testInput.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int caseNum = Integer.parseInt(lines.get(0));

        for (int i = 1; i < caseNum + 1; i++) {
            String lineInput = lines.get(i);
            char[] lineChar = lineInput.toCharArray();
            int breakCount = 0;
            if (lineChar.length > 1) {
                for (int j = 0; j < lineChar.length - 1; j++) {
                    if (lineChar[j] != lineChar[j + 1]) {
                        breakCount++;
                    }
                }
            }
            if (lineChar[lineChar.length - 1] == '+') {
                System.out.println("Case #" + i + ": " + breakCount);
            } else if (lineChar[lineChar.length - 1] == '-') {
                breakCount = breakCount + 1;
                System.out.println("Case #" + i + ": " + breakCount);
            }
        }
    }
}
