package methodEmbedding.Counting_Sheep.S.LYD752;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountingSheep {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			String sCurrentLine;
			int t = 0;
			br = new BufferedReader(new FileReader("/Users/bhavesh.patel/Downloads/A-small-attempt0.in"));
			File file = new File("/Users/bhavesh.patel/Downloads/output.txt");
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			if ((sCurrentLine = br.readLine()) != null) {
				t = Integer.parseInt(sCurrentLine.trim());
			}
			for (int i = 0; i < t; i++) {
				int number = 0;
				StringBuilder output = new StringBuilder("Case #" + (i + 1) + ": ");
				if ((sCurrentLine = br.readLine()) != null) {
					number = Integer.parseInt(sCurrentLine.trim());
				}
				if (number == 0) {
					output.append("INSOMNIA");
				} else {
					long current = number;
					int count[] = new int[10];
					while (true) {
						char value[] = String.valueOf(current).toCharArray();
						for (int j = 0; j < value.length; j++) {
							count[value[j] - '0']++;
						}
						int j = 0;
						for (; j < count.length; j++) {
							if (count[j] <= 0) {
								break;
							}
						}
						if (j >= count.length) {
							output.append(value);
							break;
						}
						current += number;
					}
				}
				if (i + 1 < t) {
					output.append("\n");
				}
				writer.write(output.toString());
				System.out.print(output.toString());
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
