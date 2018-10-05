package methodEmbedding.Standing_Ovation.S.LYD692;


import java.io.*;
import java.util.Scanner;

/**
 * Created by Kevin on 2015-04-11.
 */
public class ProblemA {

    public static void main(String[] args) {
        Scanner input = null;
        PrintWriter output = null;
        try {
            input = new Scanner(new File("C:/Users/Kevin/IdeaProjects/Google Code Jam 2015/src/qualification/input.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("FILE NOT FOUND!");
        }
        try {
            output = new PrintWriter(new FileWriter("C:/Users/Kevin/IdeaProjects/Google Code Jam 2015/src/qualification/output.txt"));
        } catch (IOException e) {
            System.err.println("COULD NOT CREATE OUTPUT!");
        }

        int cases = input.nextInt();
        for (int i = 1; i <= cases; ++i) {
            int answer = 0;

            int maxS = input.nextInt();
            String line = input.next();

            int surplus = 0;
            for (char c : line.toCharArray()) {
                int val = c - '0';
                surplus += val - 1;
                if (surplus < 0) {
                    answer -= surplus;
                    surplus = 0;
                }
            }

            String formattedAnswer = "Case #" + i + ": " + answer;
            System.out.println(formattedAnswer);
            output.println(formattedAnswer);
        }

        input.close();
        output.close();
    }

}
