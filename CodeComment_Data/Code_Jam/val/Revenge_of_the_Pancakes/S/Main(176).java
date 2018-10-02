package methodEmbedding.Revenge_of_the_Pancakes.S.LYD259;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))){
			scanner.useLocale(Locale.ENGLISH);
			BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
			int tests = scanner.nextInt();
			for (int i = 0; i < tests; i++) {
				String cakes = scanner.next();
				int result = 0;
				for (int j = 0; j < cakes.length() - 1; j++) {
					if(cakes.charAt(j) != cakes.charAt(j+1)) {
						result++;
					}
				}
				if (cakes.charAt(cakes.length() - 1) == '-') {
					result++;
				}
				out.write("Case #" + (i + 1) + ": " + result + "\n");
			}
			out.close();
		} catch (FileNotFoundException e) {
			// ????
		} catch (IOException e) {
			// ????
		}
	}
}
