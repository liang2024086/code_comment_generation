package methodEmbedding.Magic_Trick.S.LYD265;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * The first line of the input gives the number of test cases, 
 * T. T test cases follow. Each test case starts with a line containing an integer:
 *  the answer to the first question. The next 4 lines represent the 
 *  first arrangement of the cards: each contains 4 integers, separated by a single space.
 *   The next line contains the answer to the second question, and the following four 
 *   lines contain the second arrangement in the same format.
 * @author YingQing
 *
 *3
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 5 4
3 11 6 15
9 10 7 12
13 14 8 16
Case #1: 7
Case #2: Bad magician!
Case #3: Volunteer cheated!

 */
public class Magician {
	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("A-small-attempt0-output.txt", "UTF-8");
		int totalCases = Integer.parseInt(br.readLine());
		int[] ans = new int[totalCases + 1];
		for (int j = 1; j <= totalCases; j++){
			Set<Integer> possibleAns = new HashSet<Integer>();
			Set<Integer> bothTimes = new HashSet<Integer>();
			int currentRow = Integer.parseInt(br.readLine());
			for (int i = 1; i <= 4; i++) {
				String numbers = br.readLine();
				if (i == currentRow) {
					String[] tokens = numbers.split(" ");
					for (String token : tokens){
						possibleAns.add(Integer.parseInt(token));
					}
				}
			}
			
			currentRow = Integer.parseInt(br.readLine());
			for (int i = 1; i <= 4; i++) {
				String numbers = br.readLine();
				if (i == currentRow) {
					String[] tokens = numbers.split(" ");
					for (String token : tokens){
						if (possibleAns.contains(Integer.parseInt(token))){
							bothTimes.add(Integer.parseInt(token));
							ans[j] = Integer.parseInt(token);
						}
					}
				}
			}
			String toPrint = "Case #" + j + ": ";
			if (bothTimes.size() == 1) {
				toPrint += ans[j] ;
			} else if (bothTimes.size() == 0) {
				toPrint +=  "Volunteer cheated!";
			} else {
				toPrint += "Bad Magician!";
			}
			writer.println(toPrint);
		}
		br.close();
		writer.close();
	}
}
