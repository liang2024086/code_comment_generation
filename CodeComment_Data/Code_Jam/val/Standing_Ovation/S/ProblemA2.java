package methodEmbedding.Standing_Ovation.S.LYD883;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ProblemA2 {

	public static void main(String[] args) {
		
		Scanner sc = null;
		try {
			sc = new Scanner (new File("A-small-attempt2.in"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("A-small-attempt2.out"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int sets = sc.nextInt();
		for (int i=1; i <= sets; i++) {
			int sMax = sc.nextInt();
			String data = sc.next();
			int totalPeople = 0;
			int peopleToAdd = 0;
			
			for (int j=0; j <= sMax; j++) {
				if (j > totalPeople) {
					peopleToAdd += j - totalPeople;
					totalPeople = j;
				}
				totalPeople += Character.getNumericValue( data.charAt(j) );
				//System.out.println (Character.getNumericValue( data.charAt(j) ));
			}
			
			pw.println("Case #" + i + ": " + peopleToAdd);
		}
		pw.close();
		sc.close();
	}

}
