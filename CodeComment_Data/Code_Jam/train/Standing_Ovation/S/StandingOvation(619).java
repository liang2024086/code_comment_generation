package methodEmbedding.Standing_Ovation.S.LYD779;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	static String input = "";
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("E:/IO/A-small-attempt1.in"));
		File file = new File("E:/IO/A-small-attempt1.out");
		PrintWriter writer = new PrintWriter(new FileWriter(file));
		
		int T = scanner.nextInt();
		for(int t = 0; t < T; t++){
			int smax = scanner.nextInt();
			String level = scanner.next();
			
			int sum = Integer.parseInt(level.substring(0, 1));
			int frens = 0;
			
			for(int s= 1; s <= smax; s++ ){
				int cLevel = Integer.parseInt(level.substring(s,s+1));
				if( cLevel > 0 && (frens+sum) < s ){
					frens = frens + s - (frens+sum);
				}
				sum = sum + cLevel;
			}
			
			writer.println("Case #" + (t + 1) + ": " + frens);
			writer.flush();
		}
		
		scanner.close();
		writer.close();
	}

}
