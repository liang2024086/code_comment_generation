package methodEmbedding.Magic_Trick.S.LYD331;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;

public class A_MagicTrick {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("A-small-attempt2.in"));
		System.setOut(new PrintStream(new FileOutputStream("A-small-attempt2.out")));
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int noCases = Integer.parseInt(bfr.readLine());
		
		String [] splitedLine;
		
		for (int i = 1; i <= noCases; i++) {
			Integer [][] first = new Integer[4][4];
			Integer [][] second = new Integer[4][4];
			
			int firstGuess = Integer.parseInt(bfr.readLine());
			
			for (int j = 0; j < 4; j++) {
				splitedLine = bfr.readLine().split(" ");
				for (int j2 = 0; j2 < 4; j2++) {
					first[j][j2] = Integer.parseInt(splitedLine[j2]);
				}
			}
			
			int secondGuess = Integer.parseInt(bfr.readLine());
			
			for (int j = 0; j < 4; j++) {
				splitedLine = bfr.readLine().split(" ");
				for (int j2 = 0; j2 < 4; j2++) {
					second[j][j2] = Integer.parseInt(splitedLine[j2]);
				}
			}
			
			// end of loading
			
			HashSet<Integer> firstRowSet = new HashSet<Integer>();
			for (int j = 0; j < 4; j++) {
				firstRowSet.add(first[firstGuess - 1][j]);
			}
			
			HashSet<Integer> secondRowSet = new HashSet<Integer>();
			for (int j = 0; j < 4; j++) {
				secondRowSet.add(second[secondGuess - 1][j]);
			}
			
			String result = null;
			
			firstRowSet.retainAll(secondRowSet);
			
			switch (firstRowSet.size()) {
			case 0:
				result = "Volunteer cheated!";
				break;
			case 1:
				result = "" + (firstRowSet.toArray())[0];
				break;

			default:
				result = "Bad magician!";
				break;
			}		
			
			System.out.println("Case #" + i + ": "+ result);			
		}
		
		bfr.close();
		
	}

}
