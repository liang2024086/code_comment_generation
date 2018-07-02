package methodEmbedding.Magic_Trick.S.LYD737;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class TaskA {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws Exception {
        String dir = "H:\\workspace\\Algorithms\\data\\";
        String inputFile = dir + "A-small-attempt0.in";
        String outputFile = dir + "result";
        PrintStream writer = new PrintStream(new FileOutputStream(outputFile));
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line = reader.readLine();
        int testCases = Integer.parseInt(line);
        for (int tc = 1; tc <= testCases; tc++) {
            line = reader.readLine();
            int answer1 = Integer.parseInt(line);
            int[][] matrix1 = new int[4][4];
            for (int row = 0; row < 4; row++) {
                line = reader.readLine();
                String tokens[] = line.split(" ");
                for (int col = 0; col < tokens.length; col++) {
                    matrix1[row][col] = Integer.parseInt(tokens[col]);
                }
            }

            line = reader.readLine();
            int answer2 = Integer.parseInt(line);
            int[][] matrix2 = new int[4][4];
            for (int row = 0; row < 4; row++) {
                line = reader.readLine();
                String tokens[] = line.split(" ");
                for (int col = 0; col < tokens.length; col++) {
                    matrix2[row][col] = Integer.parseInt(tokens[col]);
                }
            }

            Set<Integer> workingSet = new HashSet<Integer>();
            Set<Integer> retainSet = new HashSet<Integer>();
            for (int col = 0; col < 4; col++) {
                workingSet.add(matrix1[answer1 - 1][col]);
            }

            for (int col = 0; col < 4; col++) {
                if (workingSet.contains(matrix2[answer2 - 1][col])) {
                    retainSet.add(matrix2[answer2 - 1][col]);
                }
            }
            if (retainSet.size() == 0) {
                writer.println("Case #" + tc + ": Volunteer cheated!");
            } else if (retainSet.size() == 1) {
                int answer = retainSet.iterator().next();
                writer.println("Case #" + tc + ": " + answer);
            } else {
                writer.println("Case #" + tc + ": Bad magician!");
            }
        }
        writer.close();
    }
}
