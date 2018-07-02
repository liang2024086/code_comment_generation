package methodEmbedding.Counting_Sheep.S.LYD904;

import java.util.Scanner;
import java.io.*;
import java.util.HashSet;

public class main {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = new FileInputStream("A-small-attempt1.in");
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(inputStream)));
		int first = scanner.nextInt();
		File file = new File("output.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		
		for (int i = 0; i < first; i++) {
			int index = 1;
			HashSet<Character> set = new HashSet<>();
			int N = scanner.nextInt();
			if(N == 0) {
				writer.write("Case #" + (i + 1) + ": INSOMNIA\n");
			}
			else {
				while(true) {
					int localValue = N * index;
					String stringValue = Integer.toString(localValue);
					for(int j = 0; j < stringValue.length(); ++j) {
						set.add(stringValue.charAt(j));
					}
					if (set.size() == 10) {
						writer.write("Case #" + (i + 1) + ": " + localValue + "\n");
						break;
					}
					index++;
				}
			}
		}
		
		writer.flush();
		writer.close();
	}
}
