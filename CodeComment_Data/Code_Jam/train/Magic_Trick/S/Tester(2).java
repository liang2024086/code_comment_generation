package methodEmbedding.Magic_Trick.S.LYD945;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		try {
 
			String sCurrentLine;
			br = new BufferedReader(new FileReader("A-small-attempt0.in"));
 
			
			/*
			 * Read in the first initial parameters
			 */
			// Number of cases
			int numCases = Integer.parseInt( br.readLine() );
			
			/*
			 * Read input in a loop based on initial parameters
			 */
			for (int i = 0; i < numCases; i++) {
				
				// Read in the first answer
				int answer1 = Integer.parseInt( br.readLine() );
				
				// Read in blank lines until we get to the relevant row
				for (int j = 1; j < answer1; j++) {
					br.readLine();
				}
				
				// Initialize a HashSet for first table
				HashSet<Integer> table1Poss = new HashSet<Integer>();
				
				// Read in the answer line
				sCurrentLine = br.readLine();
				String[] vector1 = sCurrentLine.split("\\s+");
				for (String s : vector1) {
					// Add possible answers to hashset
					table1Poss.add(Integer.parseInt(s));
				}
				
				// Read in blank lines until we get to the end of the first matrix
				for (int j = 0; j < 4-answer1; j++) {
					br.readLine();
				}
				
				
				// Read in the second answer
				int answer2 = Integer.parseInt( br.readLine() );
				
				// Read in blank lines until we get to the relevant row
				for (int j = 1; j < answer2; j++) {
					br.readLine();
				}
				
				// Initialize a HashSet for second table
				HashSet<Integer> table2Poss = new HashSet<Integer>();
				
				// Read in the answer line
				sCurrentLine = br.readLine();
				String[] vector2 = sCurrentLine.split("\\s+");
				for (String s : vector2) {
					// Add possible answers to hashset
					table2Poss.add(Integer.parseInt(s));
				}
				
				// Read in blank lines until we get to the end of the second matrix
				for (int j = 0; j < 4-answer2; j++) {
					br.readLine();
				}
				
				// Find the answer
				table1Poss.retainAll(table2Poss);
				
				// Report the results
				int caseNum = i + 1;
				if (table1Poss.size() == 1) {
					int card = table1Poss.iterator().next();
					System.out.println("Case #" + caseNum + ": " + card);
				} else if (table1Poss.size() > 1) {
					System.out.println("Case #" + caseNum + ": Bad magician!");
				} else {
					System.out.println("Case #" + caseNum + ": Volunteer cheated!");
				}

			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
