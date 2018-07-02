package methodEmbedding.Standing_Ovation.S.LYD513;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		Path inputPath = Paths
				.get("/Users/anandsaikrishnakhandrika/Desktop/A-small-attempt0.in");
		Path outputPath = Paths
				.get("/Users/anandsaikrishnakhandrika/Desktop/output.txt");
		try (Scanner scanner = new Scanner(inputPath);
				BufferedWriter writer = Files.newBufferedWriter(outputPath,
						Charset.defaultCharset(), StandardOpenOption.CREATE);) {
			int testCases = scanner.nextInt();

			for (int i = 0; i < testCases; i++) {
				int sMax = scanner.nextInt();
				String sString = scanner.nextLine();
				int output = 0;
				int totalParticipants = 0;
				for (int j = sMax, s = 0; j >= 0; j--, s++) {
					int localOutput = 0;
					Character charAtS = sString.charAt(s+1);
					int numberAtS = Integer.parseInt(charAtS.toString());
					if (numberAtS > 0 && totalParticipants < s) {
						localOutput += (s - totalParticipants);
					}
					totalParticipants += (numberAtS+localOutput);
					output+=localOutput;
				}
				System.out.println("Case #"+(i+1)+": "+output);
				writer.write(output);
				writer.newLine();
			}
		}
	}

}
