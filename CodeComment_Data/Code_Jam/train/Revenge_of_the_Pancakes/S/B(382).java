package methodEmbedding.Revenge_of_the_Pancakes.S.LYD896;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		Integer t = Integer.parseInt(sc.nextLine());
		PrintWriter pw = new PrintWriter(new File("output.txt"));
		for (int i = 1; i <= t; i++) {
			String line = sc.nextLine();
			char currentChar;
			currentChar = line.toCharArray()[0];
			int count = 0;
			for (char character : line.toCharArray()) {
				if (currentChar != character) {
					count ++;
					currentChar = character;
				}
			}
			if (currentChar == '-') {
				count ++;
			}
			pw.write("Case #" + i + ": " + count + "\n");
		}
		sc.close();
		pw.close();
	}

}
