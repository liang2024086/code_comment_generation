package methodEmbedding.Standing_Ovation.S.LYD1567;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class StandingOvation {
    public static void main(String[] args) throws FileNotFoundException {
        int answer;
        int caseNum = 0;
        String[] arrayInt;
        Scanner scan = new Scanner(new File(args[0]));
        PrintStream out = new PrintStream(new File("output.txt"));
        String s = scan.nextLine();
        int lastIndex = 0;
        int sum = 0;
        int friends = 0;
        String ppl;
        while (scan.hasNext()) {
            caseNum++;
            s = scan.nextLine();
            arrayInt =  s.split(" ");
            lastIndex = Integer.parseInt(arrayInt[0]) + 1;
            ppl = arrayInt[1];
            for (int i = 0; i < lastIndex; i++) {
                if (i > sum) {
                    friends++;
                    sum++;
                }
                sum += Integer.parseInt(Character.toString(ppl.charAt(i)));
            }
            answer = (friends);
            out.println("Case #" + caseNum + ": " + answer);
            sum = 0;
            friends = 0;
        }
    }
}
