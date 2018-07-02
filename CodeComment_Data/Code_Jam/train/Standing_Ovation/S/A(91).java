package methodEmbedding.Standing_Ovation.S.LYD255;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		if (args.length > 0) {
			System.setIn(new FileInputStream(args[0] + ".in"));
			System.setOut(new PrintStream(new FileOutputStream(args[0] + "output.txt")));
		}
		
		Scanner s = new Scanner(System.in);
		
		int cases = s.nextInt();
		s.nextLine();
		
		for (int i = 0; i<cases; i++){
			String[] line = s.nextLine().split(" ");
			String[] list = line[1].split("");
			int clapping = 0, needed = 0;
			for (int j = 0; j<=Integer.parseInt(line[0]); j++){
				if (j > clapping){
					needed += j - clapping;
					clapping += j - clapping;
				}
				clapping += Integer.parseInt(list[j]);
			}

			System.out.println("Case #" + (i+1) + ": " + needed);
			
		}
		
	}


}
