package methodEmbedding.Revenge_of_the_Pancakes.S.LYD180;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("input.in"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.out"));

		int totalTests = Integer.parseInt(reader.readLine());

		for (int t = 1; t <= totalTests; ++t) {
			int result = 0;

			boolean needFlip = false;
			char[] chars = reader.readLine().toCharArray();
			boolean[] stack = new boolean[chars.length];
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == '+') {
					stack[i] = true;
				} else {
					needFlip = true;
					stack[i] = false;
				}
			}

			int index = 0;
			while (needFlip) {
				needFlip = false;
				boolean last = stack[index];
				if (stack.length == 1 && !last) {
					result++;
					break;
				}

				for (int i = index + 1; i < stack.length; i++) {
					if (stack[i] != last) {
						// do flip
						for (int j = 0; j < i; j++) {
							stack[j] = !stack[j];
						}
						result++;
						needFlip = true;
						break;
					}
				}

				if (!needFlip && !last) {
					result++;
					break;
				}
			}

			System.out.println("Case #" + t + ": " + result);
			writer.write("Case #" + t + ": " + result);
			writer.newLine();
		}

		writer.flush();
		writer.close();
		reader.close();
	}
}
