package methodEmbedding.Revenge_of_the_Pancakes.S.LYD878;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemB {
    private static final String FILENAME = "B-small-attempt0";

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new FileReader(FILENAME + ".in"));
        PrintWriter output = new PrintWriter(new FileWriter(FILENAME + ".out"));

        long start = System.currentTimeMillis();
        int testCase = input.nextInt();
        for (int t=1; t<=testCase; t++) {
        	String pancakes = input.next();
        	int size = pancakes.length();
        	int cnt = 0;
        	char prev = ' ';
        	char cur; 
        	for (int i=0; i<size; i++) {
        		cur = pancakes.charAt(i);
        		if (cur == prev) continue;
        		prev = cur;
        		cnt++;
        	}
        	if (prev == '+') cnt--;
        	output.print("Case #" + t + ": " + cnt + "\n");
        }
        System.out.print("Total duration: " + (System.currentTimeMillis() - start) + "ms\n");

        input.close();
        output.close();
	}
}
