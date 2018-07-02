package methodEmbedding.Counting_Sheep.S.LYD108;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readInFile {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(
					"C:\\Users\\Subhransu\\workspace\\Test\\file\\A-small-attempt2.in"));
			List<String> strings = new ArrayList<String>();
			while ((sCurrentLine = br.readLine()) != null) {
				strings.add(sCurrentLine);
			}

			ProblemA problemA = new ProblemA();
			List<String> outputs = problemA.execute(strings);

			FileWriter writer = new FileWriter(
					"C:\\Users\\Subhransu\\workspace\\Test\\file\\A-small-attempt2.out");
			for (String output : outputs) {
				writer.write(output + System.getProperty("line.separator"));
			}
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
