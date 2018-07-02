package methodEmbedding.Standing_Ovation.S.LYD1656;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class StandingOvation {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan =  new Scanner(new File(args[0]));
        PrintStream out = new PrintStream(new File("Output.txt"));
        String s = scan.nextLine();
        int lastIndex;
        int total = 0;
        int caseNum = 0;
        int friends = 0;
        while (scan.hasNext()) {
            caseNum += 1;
            s = scan.nextLine();
            String[] sArray = s.split(" ");
            lastIndex = Integer.parseInt(sArray[0]);
            String crowd = sArray[1];
            for(int i = 0; i <= lastIndex; i++) {
                if (total + friends < i) {
                    friends = i - total;
                }
                total += Integer.parseInt(Character.toString(crowd.charAt(i)));
            }
            out.println("Case #" + caseNum + ": " + friends);
            total = 0;
            friends = 0;
        }
    }
}
