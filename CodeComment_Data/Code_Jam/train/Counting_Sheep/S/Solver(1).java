package methodEmbedding.Counting_Sheep.S.LYD272;


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
			String result = "";

			boolean[] seen = new boolean[10];
			int remaining = 10;
			int n = Integer.parseInt(reader.readLine());
			int multi = 1;
			int current = n;
			if (n == 0) {
				result = "INSOMNIA";
			} else {
				while (remaining != 0) {
					int tmp = current;
					while (tmp > 0) {
						if (!seen[tmp % 10]) {
							seen[tmp % 10] = true;
							remaining--;
						}
						tmp = tmp / 10;
					}
					result = String.valueOf(current);

					current = multi * n;
					multi++;
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
