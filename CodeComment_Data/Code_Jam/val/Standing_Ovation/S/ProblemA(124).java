package methodEmbedding.Standing_Ovation.S.LYD2081;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

public class ProblemA
{
    public static void main(String[] args) throws Exception {
        File inputFile = new File("A-small-attempt0.in");
        File outputFile = new File("A-small-attempt0_output.txt");
        Scanner sc = new Scanner(inputFile);
        System.setOut(new PrintStream(outputFile));
        int trials = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < trials; i ++) {
            String[] s = sc.nextLine().split(" ");
            int maxShy = Integer.parseInt(s[0]);
            int curPeople = 0;
            int peopleNeeded = 0;
            for(int j = 0; j < maxShy+1; j ++) {
                if(curPeople < j) {
                    peopleNeeded += (j-curPeople);
                    curPeople += (j-curPeople);
                }
                curPeople += Integer.parseInt("" + s[1].charAt(j));
            }
            System.out.println("Case #" + (i+1) + ": " + peopleNeeded);
        }
    }

}
