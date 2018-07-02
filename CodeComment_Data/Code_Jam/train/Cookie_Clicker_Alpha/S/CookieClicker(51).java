package methodEmbedding.Cookie_Clicker_Alpha.S.LYD794;

import java.io.*;
import java.util.ArrayList;

public class CookieClicker {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Wrong number of args.");
			return;
		}

		BufferedReader input;
		FileWriter output;
		
		try {
			input = new BufferedReader(new FileReader(args[0]));
			output = new FileWriter(args[1]);
			
			int testCases = Integer.parseInt(input.readLine());

			for (int i = 1; i <= testCases; i++) {
				
				String line = input.readLine();
				String[] lineSplitted = line.split(" ");
				
				double C = Double.parseDouble(lineSplitted[0]);
				double F = Double.parseDouble(lineSplitted[1]);
				double X = Double.parseDouble(lineSplitted[2]);
				
				double gain = 2.0;
				double solution = Double.MAX_VALUE;
				double prevSolution = Double.MAX_VALUE;
				double parent = 0; 
				do {
					prevSolution = solution;
					solution = parent + X / gain;
					parent += C / gain;
					gain += F; 
				} while (solution < prevSolution);

				output.write("Case #"+i+": "+ String.format("%.7f", prevSolution) +"\n");

			}

			input.close();
			output.close();

		} catch (IOException e) {
			System.out.println("IOException occurred");
			e.printStackTrace();
		}
		
	}
}
