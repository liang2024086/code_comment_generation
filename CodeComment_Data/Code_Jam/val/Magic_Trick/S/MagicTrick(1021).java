package methodEmbedding.Magic_Trick.S.LYD1813;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
				"output.txt")));

		List<Integer> firstCandidates = null;
		List<Integer> secondCandidates = null;

		int examples = Integer.parseInt(br.readLine());

		for (int i = 1; i <= examples; ++i) {
			if (i > 1)
				bw.write("\n");
			firstCandidates = new ArrayList<>();
			secondCandidates = new ArrayList<>();
			int firstAnswer = Integer.parseInt(br.readLine());
			for (int j = 1; j < 5; ++j) {
				if (j == firstAnswer) {
					for (String elem : br.readLine().split(" "))
						firstCandidates.add(Integer.parseInt(elem));
				} else
					br.readLine();

			}
			int secondAnswer = Integer.parseInt(br.readLine());
			for (int j = 1; j < 5; ++j) {
				if (j == secondAnswer) {
					for (String elem : br.readLine().split(" "))
						secondCandidates.add(Integer.parseInt(elem));
				} else
					br.readLine();

			}

			int result = 0;
			int elem = 0;

			for (Integer el : firstCandidates) {
				if (secondCandidates.contains(el)) {
					++result;
					elem = el;
				}
			}

			if (result == 0)
				bw.write("Case #" + i + ": " + "Volunteer cheated!");
			else if (result == 1)
				bw.write("Case #" + i + ": " + elem);
			else
				bw.write("Case #" + i + ": " + "Bad magician!");

		}

		br.close();
		bw.close();

	}

}
