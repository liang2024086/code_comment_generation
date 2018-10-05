package methodEmbedding.Standing_Ovation.S.LYD193;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class StandingOvation {
	private static Scanner input;
	private static PrintStream output;
	private static int friends;
	private static int number;
	private static int testCases;
	
	public StandingOvation(){
		try {
			input = new Scanner(new File("input.in"));
			output = new PrintStream("output.out");
		} catch (FileNotFoundException e) {
		}
	}
	
	public static void main(String[] args){
		new StandingOvation();
		testCases = Integer.parseInt(input.nextLine());
		for (int i = 0; i < testCases; i++){
			friends = 0;
			number = 0;
			String[] split = input.nextLine().split(" ");
			int iter = Integer.parseInt(split[0]);
			String[] peeps = split[1].split("");
			int[] peepsInt = new int[peeps.length-1];
			for (int j = 1; j < peeps.length; j++){
				peepsInt[j-1] = Integer.parseInt(peeps[j]);
			}
			number += peepsInt[0];
			for (int k = 1; k < peepsInt.length; k++){
				if ((number < k) & (peepsInt[k] != 0)){
					friends += (k - number);
					number += (k - number);
				}
				number += peepsInt[k];
			}
			output.println(String.format("Case #%d: %d", (i+1), friends));
		}
	}
}
