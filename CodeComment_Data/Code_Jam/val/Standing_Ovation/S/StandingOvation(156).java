package methodEmbedding.Standing_Ovation.S.LYD352;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(new FileOutputStream("StandingOvationOutput.txt"));
		int t = scan.nextInt();
		int count;
		for (int i = 1; i <= t; i++) {
			count = 0;
			int nPeople = 0;
			int max = scan.nextInt();
			String s = scan.next();
			for (int j = 0; j < s.length(); j++) {
				if(j > nPeople && s.charAt(j) != '0') {
					count += j - nPeople;
					nPeople += j - nPeople;
				}
				nPeople += (s.charAt(j) - '0');
			}
			pr.print("Case #"+i+": "+ count);
			
			pr.println();
		}
		
		pr.close();
		scan.close();


	}
	

}
