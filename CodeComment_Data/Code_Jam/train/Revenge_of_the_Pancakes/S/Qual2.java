package methodEmbedding.Revenge_of_the_Pancakes.S.LYD716;

/*
	JOHN LIMA
	2.21.2015
*/


import java.io.*;
import java.util.Scanner;

public class Qual2 {
	
	public static void main(String args[]) {

		File file = new File("in.in");	
		Scanner input = null;

		try {
			input = new Scanner(file);
		} catch (FileNotFoundException ex) {
			System.out.println(" File not found" );
			System.exit(1);
		}
		
		String out = "";

		//skip first line
		int num = Integer.parseInt(input.nextLine());
		
		
		for (int i = 0; i < num; i++) {
			
			String stack = input.nextLine();
			int flips = 0;
			
			char current = stack.charAt(0);
			
			if (stack.length() > 1) {
				for (int p = 0; p < stack.length(); p++) {
					if (stack.charAt(p) != current) {
						current = stack.charAt(p);
						flips++;
					}
				}
			}
			
			if (stack.charAt(stack.length()-1) == '-')
					flips++;
			
			out += "Case #" + (i+1) + ": " + flips + "\n";
		}
		
		//make censor.out
		Writer writer = null;	
	
		try {
			writer = new FileWriter("out.txt", true);
		}
		catch (IOException ex) {
			System.out.println("Cannot create file");
			System.exit(1);
		}
	
		//write to censor.out
		PrintWriter output = new PrintWriter(writer);
		output.print(out);
		output.close();
	}
}
