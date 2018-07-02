package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1088;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MainLine {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("data.txt"));
		int testCases = 0;
		int caseCounter = 1;
		testCases = scan.nextInt(); scan.nextLine();
		double C = 0.0;
		double F = 0.0;
		double X = 0.0;
		double timeGain = 2;
		double totalTime = 0.0;
		
		while(testCases-- > 0){
			C = scan.nextDouble();
			F = scan.nextDouble();
			X = scan.nextDouble();
			scan.nextLine();
			timeGain = 2;
			totalTime = 0.0;
			
			while(true){
				if((X/timeGain) > ((C/timeGain)+(X/(timeGain+F)))){
					totalTime += (C/timeGain);
					timeGain += F;
				}
				else{
					totalTime = totalTime + (X/timeGain);
					System.out.printf("Case #%d: %.7f\n", caseCounter, totalTime);
					break;
				}
			}
			caseCounter++;
		}
	}
}
