package methodEmbedding.Standing_Ovation.S.LYD2154;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Administrator on 11.04.2015.
 */
public class ProblemA {
	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Administrator.HP4520\\Desktop\\google code jam\\A-small-attempt0.in"), Charset.defaultCharset());
		int numberOfSamples = Integer.parseInt(lines.get(0).trim());
		for(int i = 1; i <= numberOfSamples; i++){
			int index = lines.get(i).indexOf(' ');
			int levelCount = Integer.parseInt(lines.get(i).substring(0, index));
			String digits = lines.get(i).substring(index + 1);

			int additionalFriends = 0;
			int totalSoFar = 0;
			for(int j = 0; j < digits.length(); j++) {
				if(totalSoFar < j) {
					int add = j - totalSoFar;
					additionalFriends += add;
					totalSoFar += add;
				}
				totalSoFar += Integer.parseInt(digits.charAt(j) + "");
			}
			System.out.println("Case #" + i + ": " + additionalFriends);
		}
	}
}
