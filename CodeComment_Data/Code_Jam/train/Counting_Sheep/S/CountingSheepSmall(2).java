package methodEmbedding.Counting_Sheep.S.LYD804;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class CountingSheepSmall {

	public static void main(String[] args) {
		
		//Output Setup
		PrintWriter out = null;
		try {
			out = new PrintWriter("Output.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//Input
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("A-small-attempt3.in");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(fis)));
		int size = in.nextInt();
		
		int[] cases = new int[size];
		for (int i = 0; i < size; i++) {
			cases[i] = in.nextInt();
		}
		
		//Test all cases
		for (int i = 0; i < size; i++) {
			
			String digits = "";
			String number = "";
			if (cases[i] != 0) {
				//Calculate last number 
				for (int j = 1; digits.length() < 10; j++) {
					
					number = "" + (cases[i] * j);
					
					for (int k = 0; k < number.length(); k++) {
						
						String num = number.substring(k, k + 1);
						if (digits.indexOf(num) == -1) {
							digits += num;
						}
					}
				}
				out.println("Case #" + (i+1) + ": " + number);
			}
			else {
				out.println("Case #" + (i+1) + ": " + "INSOMNIA");
			}
		}
		
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
		
	}

}
