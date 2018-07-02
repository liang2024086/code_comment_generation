package methodEmbedding.Magic_Trick.S.LYD2011;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Magic {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("Magic.out");
		
		int cases = scanner.nextInt();
		int count = 1;
		while (cases --> 0) {
			int first = scanner.nextInt();
			int[] row1 = new int[4];
			for (int i = 0; i < 4; ++i)
				for (int j = 0; j < 4; ++j)
					if (i == first - 1)
						row1[j] = scanner.nextInt();
					else
						scanner.nextInt();
			
			int second = scanner.nextInt();
			int[] row2 = new int[4];
			for (int i = 0; i < 4; ++i)
				for (int j = 0; j < 4; ++j)
					if (i == second - 1)
						row2[j] = scanner.nextInt();
					else
						scanner.nextInt();
			
			int numFound = 0;
			int val = 0;
			for (int i = 0; i < 4; ++i)
				for (int j = 0; j < 4; ++j)
					if (row1[i] == row2[j]) {
						numFound++;
						val = row1[i];
					}
			
			if (numFound == 0)
				writer.println("Case #" + count++ + ": Volunteer cheated!");
			else if (numFound == 1)
				writer.println("Case #" + count++ + ": " + val);
			else
				writer.println("Case #" + count++ + ": Bad magician!");
		}
		
		writer.close();
		
	}

}
