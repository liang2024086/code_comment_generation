package methodEmbedding.Magic_Trick.S.LYD193;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.in"));
		String line = br.readLine();
		int noTestCases = Integer.valueOf(line);
		Set<String> firstRow = null;
		Set<String> secondRow = null;
		int firstAnsewer;
		int secondAnsewer;
		List<String> result;
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < noTestCases; i++) {
			firstAnsewer = Integer.valueOf(br.readLine());
			for (int j = 1; j <= 4; j++){
				if(j == firstAnsewer)
					firstRow = new HashSet<String>(Arrays.asList(br.readLine().split(" ")));
				else
					br.readLine();
			}
			
			secondAnsewer = Integer.valueOf(br.readLine());
			for (int j = 1; j <= 4; j++){
				if(j == secondAnsewer)
					secondRow = new HashSet<String>(Arrays.asList(br.readLine().split(" ")));
				else
					br.readLine();
			}
			
			result = new LinkedList<String>();
			for (String num : firstRow) 
				if(secondRow.contains(num))
					result.add(num);
			
			log.append("Case #").append(i+1).append(": ");
			if (result.isEmpty())
				log.append("Volunteer cheated!").append("\n");
			else if(result.size() > 1)
				log.append("Bad magician!").append("\n");
			else
				log.append(result.get(0)).append("\n");
		}
		br.close();
		
		System.out.println(log.toString());
	}
	
}
