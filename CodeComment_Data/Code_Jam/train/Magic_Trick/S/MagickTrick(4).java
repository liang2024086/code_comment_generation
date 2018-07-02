package methodEmbedding.Magic_Trick.S.LYD50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MagickTrick {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\smelaatifi\\Documents\\jam\\A-small-attempt2.out"));
		System.setOut(out);
		
		Scanner scanner = new Scanner(new FileInputStream(new File("C:\\Users\\smelaatifi\\Documents\\jam\\A-small-attempt.in")));
		String caseCountStr = scanner.nextLine();
		int caseCount = Integer.parseInt(caseCountStr);
		Set<String> solutionSet = new HashSet<String>();
		String row ="";
		for(int i = 1; i <= caseCount; i++) {
			int rowNumber = Integer.parseInt(scanner.nextLine());
			for(int j = 1; j <= 4; j++) {
				if(j == rowNumber){
					row = scanner.nextLine();
				}else{
					scanner.nextLine();
				}
			}
			solutionSet = new HashSet<String>(Arrays.asList(row.split("\\s")));

			rowNumber = Integer.parseInt(scanner.nextLine());
			for(int j = 1; j <= 4; j++) {
				if(j == rowNumber){
					row = scanner.nextLine();
				}else{
					scanner.nextLine();
				}
			}
			solutionSet.retainAll(new HashSet<String>(Arrays.asList(row.split("\\s"))));
			
			if(solutionSet.isEmpty()){
				System.out.println("Case #"+i+": " + "Volunteer cheated!");
			} else if (solutionSet.size() == 1) {
				System.out.println("Case #"+i+": " + solutionSet.iterator().next());
			} else {
				System.out.println("Case #"+i+": " + "Bad magician!");
			}
		}
		
		scanner.close();
	}
}
