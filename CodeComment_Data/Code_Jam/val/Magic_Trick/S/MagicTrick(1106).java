package methodEmbedding.Magic_Trick.S.LYD378;

//import libraries needed
import java.net.*;
import java.io.*;
import java.util.*;
import java.lang.*;
																						
class MagicTrick {
	public static void main(String [] args){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int cases = Integer.parseInt(br.readLine());
			int firstGuess = 0;
			int[][] firstLayout = new int[4][4];
			int secondGuess = 0;
			int[][] secondLayout = new int[4][4];

			int[] firstGuessedRow = new int[4];
			int[] secondGuessedRow = new int[4];

			int currCase = 1;
			while (cases >= currCase) {
				firstGuess = Integer.parseInt(br.readLine());
				for (int i = 0; i < 4; i++) {
					String[] row = br.readLine().split(" ");
					int j = 0;
					for (String s : row) {
						firstLayout[i][j] = Integer.parseInt(s);
						j++;
					}
				}

				firstGuess--;
				firstGuessedRow = firstLayout[firstGuess];

				secondGuess = Integer.parseInt(br.readLine());
				for (int i = 0; i < 4; i++) {
					String[] row = br.readLine().split(" ");
					int j = 0;
					for (String s : row) {
						secondLayout[i][j] = Integer.parseInt(s);
						j++;
					}
				}

				secondGuess--;
				secondGuessedRow = secondLayout[secondGuess];
				//do logic on lists

				ArrayList<Integer> intersection = new ArrayList<Integer>();
				for(int i = 0; i < firstGuessedRow.length; i++) {
					for(int j = 0; j < secondGuessedRow.length; j++) {
						if(firstGuessedRow[i] == secondGuessedRow[j]) {
							intersection.add(firstGuessedRow[i]);
							break;
						}
					}
				}
				
				if (intersection.size() == 0) {
					//cheated
					System.out.println("Case #" + currCase + ": " + "Volunteer cheated!");
				}
				else if (intersection.size() != 1) {
					//bad magician
					System.out.println("Case #" + currCase + ": " + "Bad magician!");
				} else {
					//quessed
					System.out.println("Case #" + currCase + ": " + intersection.get(0));
				}
				currCase++;
			}
		}
		catch (Exception ex) {
		}
	}
}
