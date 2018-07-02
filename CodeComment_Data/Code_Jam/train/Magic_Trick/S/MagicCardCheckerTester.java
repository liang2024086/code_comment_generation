package methodEmbedding.Magic_Trick.S.LYD1060;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MagicCardCheckerTester {
	
	public static void main(String[] args) throws Exception {
		//String fileName = "/tmp/test";
		String fileName = "/home/batman/Downloads/A-small-attempt1.in";
		BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
		
		String line = reader.readLine();
		line = line.trim();
		int numCases = Integer.parseInt(line);
		
		for (int caseNum = 0; caseNum < numCases; ++caseNum) {
			line = reader.readLine();
			int rowNum1 = Integer.parseInt(line);
			
			int curLineNum = 1;
			while (curLineNum++ < rowNum1) {
				reader.readLine();
			}
			
			line = reader.readLine();
			String[] cards1 = line.split("\\s");
			
			while(curLineNum++ < 5) {
				reader.readLine();
			}
			
			line = reader.readLine();
			int rowNum2 = Integer.parseInt(line);
			
			curLineNum = 1;
			while (curLineNum++ < rowNum2) {
				reader.readLine();
			}
			
			line = reader.readLine();
			String[] cards2 = line.split("\\s");
			
			while(curLineNum++ < 5) {
				reader.readLine();
			}
			
			String returnValue = MagicCardsChecker.check(caseNum+1, rowNum1, cards1, rowNum2, cards2);
			System.out.println(returnValue);
		}		
	}
}
