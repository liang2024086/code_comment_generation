package methodEmbedding.Counting_Sheep.S.LYD1410;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Task1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Integer> testCaseAll = new ArrayList<Integer>();
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\input.txt"))) {
			String line;
			br.readLine();
			while ((line = br.readLine()) != null) {
				testCaseAll.add(Integer.valueOf(line));
			}
			List<String> result = new ArrayList<>();

			
			for (Integer number : testCaseAll) {
				List<Long> goalList = new ArrayList<Long>();
				for (long i = 0; i < 10; i++) {
					goalList.add(i);
				}
				
				Long resultValue = 0L;
				for (int i = 1; i < 201; i++) {
					Long resultI = (long) (i * number);
					while (resultI > 0) {
						goalList.remove(resultI % 10);
						resultI = resultI / 10;
					}
					if (goalList.size() == 0) {
						resultValue = (long) (i * number);
						break;
					}
				}
				if (resultValue != 0)
					result.add(resultValue.toString());
				else
					result.add("INSOMNIA");
			}

			PrintWriter pw = new PrintWriter(new FileWriter("D:\\outPut.txt"));

			int i = 1;
			for (String string : result) {
				pw.println("Case #" + i + ": " + string);
				i++;
			}
			pw.close();

		}
	}
}
