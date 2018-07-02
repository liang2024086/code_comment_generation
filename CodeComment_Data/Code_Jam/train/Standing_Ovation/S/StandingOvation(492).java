package methodEmbedding.Standing_Ovation.S.LYD1060;


import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	static FileInputStream in = null;
	static PrintWriter out = null;
	static int[] numberOfPeopleWihShynessLevel;
	
	public static void main(String[] args) {

		try {
			in = new FileInputStream("A-small-attempt0.in");
			out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		    
			
			Scanner scan = new Scanner(in);
			int numberOfCases = scan.nextInt();
			for (int i = 0; i < numberOfCases; i++) {
				int result = 0;
				int numberOfClappedPeople = 0;
				int maxShyness = scan.nextInt();
				String shyness = scan.next();
				numberOfClappedPeople += shyness.charAt(0) - 48;
				for (int j = 1; j < shyness.length(); j++) {
					int levelJ = shyness.charAt(j) - 48;
					if(j > numberOfClappedPeople){
						result += j - numberOfClappedPeople;
						levelJ += j - numberOfClappedPeople;
					}
					numberOfClappedPeople += levelJ;
				}
				String outStr = "Case #" + (i+1) + ": " + result;
				out.println(outStr);
			}
			
			
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		} catch (IOException ex) {
			System.out.println("hmaaaadaaa :D");
		}
	}
}
