package methodEmbedding.Standing_Ovation.S.LYD1011;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;




public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException{
		String inputFile = "A-small-attempt1.in";
		String outputFile = "A-small-attempt1.out";
		
		
		
		Scanner sc = new Scanner(new File(inputFile));

		PrintStream ps = new PrintStream(new File(outputFile));
		
		int cases = Integer.parseInt(sc.nextLine().trim());
		
		for(int i = 1; i <= cases ; i++){
			String line = sc.nextLine();
			String[] lineArr = line.split("\\s");
			int maxShy = Integer.parseInt(lineArr[0].trim());
			int count= 0;
			int friendNeeded = 0;
			for(int j = 0; j<= maxShy ; j++){
				int kcount = Integer.parseInt( String.valueOf(lineArr[1].charAt(j)));
				
				if(count < j){
					friendNeeded += j-count;
					count += j-count;
				}
				count += kcount;
			}
			//
			ps.println("Case #" + i + ": " + friendNeeded);
		}
		sc.close();
		ps.close();
	}
	
	
}
