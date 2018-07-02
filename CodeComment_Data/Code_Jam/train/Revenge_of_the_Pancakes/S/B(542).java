package methodEmbedding.Revenge_of_the_Pancakes.S.LYD51;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class B {

	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\Wenjuan\\Desktop\\B.txt"));
		PrintWriter output = new PrintWriter(new FileWriter("C:\\Users\\Wenjuan\\Desktop\\answer.txt"));
		
		int T = Integer.parseInt(input.readLine());
		
		for (int t = 1; t <= T; t++) {
			
			String pancakes = input.readLine();
			
			int differences = 0;
			
			for (int i = 0; i < pancakes.length() - 1; i++) {
				
				if (pancakes.charAt(i) != pancakes.charAt(i + 1)) {
					
					differences++;
					
				}
				
			}
			
			if (pancakes.substring(pancakes.length() - 1, pancakes.length()).equals("-")) {
				
				differences++;
				
			}
			
			output.println("Case #" + t + ": " + differences);
			
		}
		
		input.close();
		output.close();
		
		
	}

}
