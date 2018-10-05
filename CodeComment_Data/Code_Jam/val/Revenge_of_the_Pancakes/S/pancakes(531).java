package methodEmbedding.Revenge_of_the_Pancakes.S.LYD272;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) throws Exception
    {
		
		String inPath = "/Users/Lynn/Downloads/test.txt";
        String outPath = "/Users/Lynn/Downloads/test.out.txt";
		
//		String inPath = "/Users/Lynn/Downloads/A-large.in.txt";
//        String outPath = "/Users/Lynn/Downloads/A-large.out.txt";

        Scanner input = new Scanner(new FileReader(inPath));

        File outFile = new File(outPath);
        BufferedWriter bw = new BufferedWriter(new FileWriter(outPath));
        
        int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {

        	String line = (String) input.next();
        	char[] P = line.toCharArray();
        	
        	int y = 0;
        	
        	for (int i = 0; i < P.length; i ++) {
        		char p = P[P.length - i - 1];
        		boolean e = ((y%2)==0);
        		if (p == '-' && (e || y == 0)) {
        			y ++;
        		} else if (p == '+' && !e) {
        			y ++;
        		}
        	}
        

            bw.write("Case #" + (n + 1) + ": " + y);
            bw.newLine();
        }
     
        bw.close();
    }
	
	
}
