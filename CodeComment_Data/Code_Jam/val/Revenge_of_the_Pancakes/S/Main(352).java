package methodEmbedding.Revenge_of_the_Pancakes.S.LYD618;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("input.txt"));
		File write = new File("output.txt");
		FileWriter fWriter = new FileWriter(write);

		int nb = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < nb; i++) {
			String s = sc.nextLine();
			int sum = 0;
			boolean[] pancakes = new boolean[s.length() + 1];
			pancakes[s.length()] = true;
			for (int j = 0; j < s.length(); j++) {
				pancakes[j] = (s.charAt(j) == '+');
			}

			for (int j = 0; j < pancakes.length - 1; j++) {
				if (pancakes[j] != pancakes[j + 1])
				{
					sum++;
				}
			}

			fWriter.write("Case #" + (i + 1) + ": " + sum + "\n");
		}
		fWriter.flush();
		fWriter.close();
		sc.close();
	}
}
