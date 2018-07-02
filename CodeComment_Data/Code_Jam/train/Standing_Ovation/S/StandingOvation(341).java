package methodEmbedding.Standing_Ovation.S.LYD825;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {
	
	public static void main(String[] args) throws IOException{
		String fileInPath = "A-small-attempt0.in"; //needs to be added
		String fileOutPath = "ovation.txt";
		
//		if (args.length>=1) {
//			fileInPath = args[0];			
//		}
//		if (args.length>=2) {
//			fileOutPath = args[1];
//		}
		
		Scanner sc = new Scanner(new FileReader(fileInPath));
		FileWriter fOut = new FileWriter(fileOutPath);
		
		int numCases = sc.nextInt();
		for (int caseNo=1; caseNo<=numCases; caseNo++){
			int sLen = sc.nextInt() + 1;
			String s = sc.next();
			int people = 0;
			int sum = 0;
			int index0 = s.indexOf('0');
//			int last0 = s.lastIndexOf('0');
			int oldIndex = 0;
			while (index0 != -1 && index0 < sLen) {
				for (int i=oldIndex; i < index0; i++) {
					sum += Character.getNumericValue(s.charAt(i));
				}
				int difference = index0 + 1 - sum; // see if more will stand
				if (difference > 0) {
					people += difference;
					sum += difference;
				}
				oldIndex = index0;
				index0 = s.indexOf('0', index0 + 1);
			}
			
			fOut.write("Case #" + caseNo + ": " + people + '\r' + '\n');
		}
				
		sc.close();
		fOut.close();
		System.out.println("Done!");
	}
}
