package methodEmbedding.Speaking_in_Tongues.S.LYD1390;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class A {

	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new FileReader("/home/ramzy/Desktop/codejam/A-small.in"));
			PrintWriter output = new PrintWriter("/home/ramzy/Desktop/codejam/A-small.out");
			String line = input.readLine();
			int T = Integer.valueOf(line);
			for(int i = 0; i < T; i++) {
				line = input.readLine();
				line = line.replace("a", "Y"); //
				line = line.replace("b", "H"); //
				line = line.replace("c", "E"); //
				line = line.replace("d", "S"); //
				line = line.replace("e", "O"); //
				line = line.replace("f", "C"); //
				line = line.replace("g", "V"); //
				line = line.replace("h", "X"); //
				line = line.replace("i", "D"); //
				line = line.replace("j", "U"); //
				line = line.replace("k", "I"); //
				line = line.replace("l", "G"); //
				line = line.replace("m", "L"); //
				line = line.replace("n", "B"); //
				line = line.replace("o", "K"); //
				line = line.replace("p", "R"); //
				line = line.replace("q", "Z"); //
				line = line.replace("r", "T"); //
				line = line.replace("s", "N"); //
				line = line.replace("t", "W"); //
				line = line.replace("u", "J"); //
				line = line.replace("v", "P"); //
				line = line.replace("w", "F"); //
				line = line.replace("x", "M"); //
				line = line.replace("y", "A"); // 
				line = line.replace("z", "Z"); // 
				output.println("case #" + (i+1) + ": " + line.toLowerCase());
				System.out.println("case #" + (i+1) + ": " + line.toLowerCase());
			}
			output.close();
			input.close();
		} catch(IOException e) {
			System.err.println(e);
		}
	}
	
}
