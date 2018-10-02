package methodEmbedding.Standing_Ovation.S.LYD1114;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {

	private Scanner input;
	private int T, Smax, clapping, friends, total;
	private String S;
	private String[] SArray;
	private char[] audience;
	private PrintWriter output;
	
	public StandingOvation() throws IOException{
		
		input = new Scanner(new File("input.txt"));
		T = new Integer(input.nextLine());
		output = new PrintWriter(new File("output.txt"));
		
		for (int i = 0; i < T; i++){
			
			S = input.nextLine();
			SArray = S.split(" ");
			Smax = new Integer(SArray[0]);
			audience = SArray[1].toCharArray();
			clapping = 0;
			friends = 0;
			
			for (int j = 0; j < Smax + 1; j++){
				total = j - clapping - friends;
				if (total > 0){
					friends += total;
					clapping += total;
				}
				clapping += Integer.parseInt(String.valueOf(audience[j]));
				if (total == 0 && audience[j] == '0') friends++;
			}
			
			output.println("Case #" + (i + 1) + ": " + friends);
			System.out.println("Case #" + (i + 1) + ": " + friends);
			
		}
		
		output.close();
		
	}
	
	public static void main(String[] args){
		try {
			new StandingOvation();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
