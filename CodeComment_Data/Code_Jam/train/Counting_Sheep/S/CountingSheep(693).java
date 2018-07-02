package methodEmbedding.Counting_Sheep.S.LYD1067;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingSheep {

	public static void main(String[] args) throws IOException {
		String folder = "Z:/Tools/eclipse/sts-3.7.2.RELEASE/workspace/codeJam2016R1/src/com/google/";
		String fileName = folder + "A-small-attempt0";

		List<Long> Ns = new ArrayList<>();
		int T = -1;
		List<String> lines = new ArrayList<>();

		// read T and all N
		try (Stream<String> stream = Files.lines(Paths.get(fileName + ".in"))) {
			boolean firstNumber = true;
			List<String> entries = stream.collect(Collectors.toList());

			for (String entry : entries) {
				if (firstNumber) {
					firstNumber = false;
					T = Integer.parseInt(entry);
				} else {
					Ns.add(Long.parseLong(entry));
				}

			}

			System.out.println("T = " + T);
			System.out.println("Ns = " + Ns);

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int j = 0; j < T; j++) {
			long N = Ns.get(j);
			Set<Character> allNumbers = new HashSet<>();
			boolean foundAllNumbers = false;
			String line = "";

			for (int i = 1; i < 100; i++) {
				String number;
				boolean firstElement = i == 1;

				if (firstElement) {
					number = "" + N;
					System.out.println("number: " + number);
				} else {
					number = "" + (i * N);
					// System.out.println("other number: (" + i + " * " + N + ")
					// = " + number);
				}
				number.chars().mapToObj(c -> (char) c).forEach(allNumbers::add);
				foundAllNumbers = allNumbers.size() == 10;
				if (foundAllNumbers) {
					line = "Case #" + (j + 1) + ": " + number;
					foundAllNumbers = true;
					break;
				}
			}
			if (!foundAllNumbers) {
				line = "Case #" + (j + 1) + ": INSOMNIA";
			}
			System.out.println(line);
			lines.add(line);
		}
		Files.write(Paths.get(fileName + ".out"), lines);

	}
}
