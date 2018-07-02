package methodEmbedding.Revenge_of_the_Pancakes.S.LYD607;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
		public static void main(String[] args) throws FileNotFoundException, IOException {
			List<List<String>> testCaseAll = new ArrayList<List<String>>();
			try (BufferedReader br = new BufferedReader(new FileReader("D:\\input.txt"))) {
				String line;
				br.readLine();
				while ((line = br.readLine()) != null) {
						List<String> testCase = new ArrayList<String>();
						for (char cha: line.toCharArray()) {
							testCase.add(String.valueOf(cha));
						}
						testCaseAll.add(testCase);
				}
				
				List<String> result = new ArrayList<>();

				for (List<String> stringList : testCaseAll) {
					Integer flips = 0;
					for (int i = 1; i < stringList.size(); i++) {
						if (!stringList.get(i).equals(stringList.get(i-1)))
							flips++;
					}
					if (stringList.get(stringList.size()-1).equals("-"))
						flips++;
					
					System.out.println("done");
					result.add(flips.toString());
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
