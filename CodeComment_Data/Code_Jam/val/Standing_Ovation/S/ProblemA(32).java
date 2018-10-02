package methodEmbedding.Standing_Ovation.S.LYD1667;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemA {
    private static final String INPUT_FILENAME = "A-small-attempt0.in";
    private static final String OUTPUT_FILENAME = "A-small-attempt0.out";

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new FileReader(INPUT_FILENAME));
        PrintWriter output = new PrintWriter(new FileWriter(OUTPUT_FILENAME));
            
        int numberOfTestCase = input.nextInt();
        for (int caseNum=1; caseNum<=numberOfTestCase; caseNum++) {
        	int friends = 0;
        	int sMax = input.nextInt();
        	String sLevels = input.next();

        	int cum = 0;
        	for (int i = 0; i < sMax; i++) {
        		cum += (sLevels.charAt(i) - '0');

        		int min = i + 1;
        		if (cum < min) {
        			friends += (min - cum);
        			cum = min;
        		}
        	}
        	
        	output.format("Case #%d: %d\n", caseNum, friends);
        }
        
        input.close();
        output.close();
	}
}
