package methodEmbedding.Magic_Trick.S.LYD589;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\prateek\\Desktop\\A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"C:\\Users\\prateek\\Desktop\\file.out"));
		int testCase;
		try {
			testCase = Integer.parseInt(br.readLine());
			int firstGuess, secondGuess;
			for (int i = 0; i < testCase; i++) {
				firstGuess = Integer.parseInt(br.readLine());
				Set<Integer> set1 = new HashSet<Integer>();
				Set<Integer> set2 = new HashSet<Integer>();
				for (int j = 0; j < 4; j++) {
					String line = br.readLine();
					if (j == firstGuess - 1) {
						String[] result = line.split("\\s");
						for (int k = 0; k < result.length; k++) {
							set1.add(Integer.parseInt(result[k]));
						}
					}
				}
				secondGuess = Integer.parseInt(br.readLine());
				for (int j = 0; j < 4; j++) {
					String line = br.readLine();
					if (j == secondGuess - 1) {
						String[] result = line.split("\\s");
						for (int k = 0; k < result.length; k++) {
							set2.add(Integer.parseInt(result[k]));
						}
					}
				}
				set1.retainAll(set2);
				String output = "Case #" + i + ":";
				if (set1.isEmpty()) {
					output += "Volunteer cheated!";
				} else if (set1.size() == 1) {
					output += set1.iterator().next();
				} else {
					output += "Bad magician!";
				}
				System.out.println(output);
				bw.write(output + "\n");
			}
		} finally {
			br.close();
			bw.flush();
			bw.close();
		}

	}

}
