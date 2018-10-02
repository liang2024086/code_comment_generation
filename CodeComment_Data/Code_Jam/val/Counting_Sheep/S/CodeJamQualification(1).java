package methodEmbedding.Counting_Sheep.S.LYD1016;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CodeJamQualification {

	public static void main(String[] args) {
		Path in = Paths.get("/home/craig/workspace/CodeJamQualification/src/A-small-attempt0.in");
		Path out = Paths.get("/home/craig/workspace/CodeJamQualification/src/A-small-attempt0.out");
		List<String> input = null;
		List<String> output = new ArrayList<String>();

		try {
			input = Files.readAllLines(in);
		} catch (IOException e) {
			System.err.println("File did not open");
			e.printStackTrace();
			return;
		}
		
		int line = 0;
		int tests = Integer.valueOf(input.get(line));
		line++;
				
		for (int testN = 0; testN < tests; testN++) {
			int n = Integer.valueOf(input.get(line));
			line++;
			
			if (n == 0) {
				output.add("Case #" + (testN + 1) + ": INSOMNIA");
				continue;
			}
			
			int i = 1;
			int num = 0;
			ArrayList<String> found = new ArrayList<String>(10);
			
			while(found.size() < 10) { //only 10 digits
				num = i * n;
				String[] split = String.valueOf(num).split("");
				for (String s : split) {
					if (!found.contains(s)) {
						found.add(s);
					}
				}
				i++;
			}
			
			output.add("Case #" + (testN + 1) + ": " + num);
		}
		
		try {
			Files.write(out, output);
		} catch (IOException e) {
			System.err.println("File did not write");
			e.printStackTrace();
		}
	}

}
