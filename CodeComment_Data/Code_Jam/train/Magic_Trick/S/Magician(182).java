package methodEmbedding.Magic_Trick.S.LYD101;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Magician {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		
		int numCases = scanner.nextInt();
		
		int caseNum = 1;
		
		ArrayList<String> res = new ArrayList<String>();
		
		while (caseNum <= numCases) {
			int rowNum = scanner.nextInt();
			System.out.println(rowNum);
			ArrayList<Integer> possible = new ArrayList<Integer>();
			ArrayList<Integer> ultimate = new ArrayList<Integer>();
			
			int rowTempNum = 1;
		
			while (rowTempNum < rowNum) {
				scanner.nextInt();
				scanner.nextInt();
				scanner.nextInt();
				scanner.nextInt();
				rowTempNum++;
			}
		
			for (int i = 0; i < 4; i++) {
				possible.add(scanner.nextInt());
			}
		
			for (int i = 1; i <= 4 - rowNum; i++) {
				scanner.nextInt();
				scanner.nextInt();
				scanner.nextInt();
				scanner.nextInt();
			}
			
			rowNum = scanner.nextInt();
			System.out.println(rowNum);
			rowTempNum = 1;
			
			while (rowTempNum < rowNum) {
				scanner.nextInt();
				scanner.nextInt();
				scanner.nextInt();
				scanner.nextInt();
				rowTempNum++;
			}
			
			for (int i = 0; i < 4; i++) {
				int num = scanner.nextInt();
				if (possible.contains(num)) {
					ultimate.add(num);
				}
			}
			
			for (int i = 1; i <= 4 - rowNum; i++) {
				scanner.nextInt();
				scanner.nextInt();
				scanner.nextInt();
				scanner.nextInt();
			}
			
			String fin = null;
			
			if (ultimate.size() == 0) {
				fin = "Volunteer cheated!";
			} else if (ultimate.size() == 1) {
				fin = "" + ultimate.get(0);
			} else {
				fin = "Bad magician!";
			}
			
			res.add("Case #" + caseNum + ": " + fin);
			
			caseNum++;
			possible = new ArrayList<Integer>();
			ultimate = new ArrayList<Integer>();
		}
		
		PrintWriter result = new PrintWriter(new FileWriter("result.txt"));
		for (int i = 0; i < res.size() - 1; i++) {
			result.println(res.get(i));
		}
		result.print(res.get(res.size() - 1));
		result.close();
	}

}
