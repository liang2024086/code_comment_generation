package methodEmbedding.Counting_Sheep.S.LYD303;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRunner {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {			
			int testCases = Integer.parseInt(br.readLine());
			for (int i = 0; i < testCases; i++) {
				String line = br.readLine();
				CountingSheep countingSheep = new CountingSheep(line);
				String output = countingSheep.run();
				System.out.println("Case #" + (i+1) + ": " + output);
			}
		}
	}
}
