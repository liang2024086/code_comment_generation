package methodEmbedding.Standing_Ovation.S.LYD1732;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream("A-small-attempt0.in")));

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("output.txt")));

		int t = Integer.parseInt(reader.readLine());
		for (int i = 0; i < t; i++) {
			String[] parts = reader.readLine().split(" ");
			int Smax = Integer.parseInt(parts[0]);
			int[] arr = new int[Smax + 1];

			int index = 0;
			for (char c : parts[1].toCharArray()) {
				arr[index++] = c - '0';
			}

			int res = 0;

			int cur = 0;
			for (int n = 0; n < Smax + 1; n++) {
				if (n > cur) {
					res += n - cur;
					cur += n - cur;
				}
				cur += arr[n];
			}

			writer.write("Case #" + (i + 1) + ": " +res);
			writer.newLine();
		}
		reader.close();
		writer.close();
	}

}
