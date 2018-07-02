package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1115;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class RevengePancakes {

	public static void main(String[] args) {

		// I/O		
		FileInputStream fis = null;
		PrintWriter out = null;
		
		try {
			fis = new FileInputStream("B-small-attempt0.in");
			out = new PrintWriter("Output.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(fis)));
		int size = in.nextInt();
		
		for (int i = 0; i < size; i++) {
			//Get Stack
			String testCase = in.next();
			int flips = 0;
			String sign = "+";
			
			//First sign
			if (!(testCase.substring(0,1).equals("+"))) {
				sign = "-";
			}
			
			if (testCase.substring(testCase.length() - 1).equals("+")) {
				flips--;
			}
			
			//Find changes
			int j = 0;
			while (j != -1) {

				//Switch sign
				if (sign.equals("+")) {
					sign = "-";
				}
				else {
					sign = "+";
				}
				
				j = testCase.indexOf(sign, j);

				flips++;
			}
			
			//Output
			out.println("Case #" + (i+1) + ": " + flips);
		}
		
		in.close();
		out.close();
	}
}
