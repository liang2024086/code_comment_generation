package methodEmbedding.Standing_Ovation.S.LYD680;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StandingOvation {

	public static void main(String[] args) {
		String name = "A-small-attempt0.in";
		String path = "/home/lukas/Downloads/" + name;
		File input = new File(path);
		File output = new File(path + ".out");

		try (BufferedReader reader = new BufferedReader(new FileReader(input));
				BufferedWriter writer = new BufferedWriter(new FileWriter(
						output))) {
			int testCases = Integer.parseInt(reader.readLine());
			for (int i = 0; i < testCases; i++) {
				String line = reader.readLine();
				String[] parts = line.split(" ");
				int[] audience = parts[1].chars().map(c -> (int) (c - '0'))
						.toArray();
				int standing = 0;
				int invite = 0;
				for (int k = 0; k < audience.length; k++) {
					while (standing < k) {
						invite++;
						standing++;
					}
					standing += audience[k];
				}
				writer.write("Case #" + (i+1) + ": " + invite + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
