package methodEmbedding.Counting_Sheep.S.LYD840;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileReader file = null;
		try {
			file = new FileReader("G:\\ChromeDownload\\Asmallattempt0.in");
		}
		catch (FileNotFoundException e) {
			System.exit(1);
		}
		BufferedReader in = new BufferedReader(file);
		int tests = 0;
		try {
			tests = Integer.parseInt(in.readLine());
		}
		catch (IOException e) {
			System.exit(1);
		}
		for (int i = 0; i < tests; i++) {
			String value = null;
			try {
				value = in.readLine();
			}
			catch (IOException e) {
				
			}
			int n = Integer.parseInt(value);
			if (n == 0) {
				Terminal.printLine("Case #" + (i + 1) + ": INSOMNIA");
				continue;
			}
			boolean[] track = new boolean[10];
			for (int j = 1;; j++) {
				int m = n * j;
				char[] numbers = Integer.toString(m).toCharArray();
				for (int k = 0; k < numbers.length; k++) {
					String temp = Character.toString(numbers[k]);
					int l = Integer.parseInt(temp);
					track[l] = true;
				}
				boolean isOver = true;
				for (int k = 0; k < track.length; k++) {
					if (track[k] == false) {
						isOver = false;
					}
				}
				if (isOver) {
					Terminal.printLine("Case #" + (i + 1) + ": " + m);
					break;
				}
				else {
					continue;
				}
			}
		}
	}
}
