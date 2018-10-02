package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1171;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProblemB {
    private static final String INPUT_FILENAME = "B-small-attempt0.in";
    private static final String OUTPUT_FILENAME = "B-small-attempt0.out";

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new FileReader(INPUT_FILENAME));
        PrintWriter output = new PrintWriter(new FileWriter(OUTPUT_FILENAME));
            
        int numberOfTestCase = input.nextInt();
        for (int caseNum=1; caseNum<=numberOfTestCase; caseNum++) {
        	double c = input.nextDouble();
        	double f = input.nextDouble();
        	double x = input.nextDouble();
        	double min = x / 2;
        	
        	double e = 2;
        	double ft = 0;
        	double r;
        	while(true) {
        		ft += c / e;
        		e += f;
        		r = ft + x / e;
        		if (r < min) {
        			min = r;
        		} else {
        			break;
        		}
        	}
        	
        	output.format("Case #%d: %.7f\n", caseNum, min);
        }
        
        input.close();
        output.close();
	}
}
