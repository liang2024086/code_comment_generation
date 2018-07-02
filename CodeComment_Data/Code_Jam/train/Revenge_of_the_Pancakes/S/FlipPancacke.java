package methodEmbedding.Revenge_of_the_Pancakes.S.LYD60;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FlipPancacke {
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(new File("/home/bhavya/Downloads/B-small-attempt0.in"));
		int count = 0;
		int cases = 0;
		int num = 0;
		PrintWriter writer = new PrintWriter(new FileWriter("/home/bhavya/Downloads/B-small-attempt0.out"));

		while (scanner.hasNextLine()) {
			if (count == 0) {
				cases = Integer.parseInt(scanner.nextLine());
				num = cases;
				count++;
			}
			if (count > 1) {
				String line = scanner.nextLine();
				int pos = 0;
				int flips = 0;
				for (int i = 0; i < line.length(); i++) {
					if (((i+1) <  line.length()) && line.charAt(i) == '-' && line.charAt(i+1) == '-') {
						continue;
					} else if (line.charAt(i) == '-') {
						if (pos != 0) {
							pos = 0;
							flips += 2;
						} else {
							flips += 1;
						}
					} else {
						if (((i+1) <  line.length()) && line.charAt(i) == '+' && line.charAt(i+1) == '+') {
					        continue;
						} else if (line.charAt(i) == '+') {
						    pos ++;
					    }
				    }
			    }
				writer.println("Case #" + (num-cases+1) + ": " + flips);
				cases --;	
		    }
			count ++;
		}
		writer.close();
		scanner.close();
	}
}

