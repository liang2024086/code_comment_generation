package methodEmbedding.Speaking_in_Tongues.S.LYD942;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestClass {

	public static void main (String[] args) throws IOException, InterruptedException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\in.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\out.txt"));
		MyTest myTest = new MyTest();
		myTest.getTranslation();

		int caseNum = Integer.parseInt(reader.readLine());
		for(int i=0; i<caseNum; i++) {
			String line = reader.readLine();
			//			String[] numbers = line.split(" ");
			//			List<Integer> bases = new ArrayList<Integer>();
			//			for(int j=0; j<numbers.length; j++) {
			//				bases.add(Integer.parseInt(numbers[j]));
			//			}

			//			int K = Integer.parseInt(numbers[1]);

			writer.write("Case #" + (i+1) + ": " + myTest.getTranslation(line) + "\n");
			writer.flush();
		}
	}
}
