package methodEmbedding.Magic_Trick.S.LYD1570;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MagicTrick {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try {
				
				
				int numberOfTestCases = Integer.parseInt(reader.readLine());
				
				for (int testCase = 1; testCase <= numberOfTestCases; testCase++) {
					
					int firstAnswer = Integer.parseInt(reader.readLine());
					
					int[][] firstArrangement = new int[4][4];
					for (int row = 0; row < 4; row++) {
						String[] split = reader.readLine().split(" ");
						for (int col = 0; col < 4; col++) {
							firstArrangement[row][col] = Integer.parseInt(split[col]);
						}
					}
					
					int secondAnswer = Integer.parseInt(reader.readLine());
					
					int[][] secondArrangement = new int[4][4];
					for (int row = 0; row < 4; row++) {
						String[] split = reader.readLine().split(" ");
						for (int col = 0; col < 4; col++) {
							secondArrangement[row][col] = Integer.parseInt(split[col]);
						}
					}
					
					int[] rowFirstAnswer = firstArrangement[firstAnswer-1];
					int[] rowSecondAnswer = secondArrangement[secondAnswer-1];
					
					int possibleCard = 0;
					boolean multipleCards = false;
					
					outerLoop: for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							if (rowSecondAnswer[j] == rowFirstAnswer[i]) {
								
								if (possibleCard > 0) {
									multipleCards = true;
									break outerLoop;
								}
								
								possibleCard = rowFirstAnswer[i];
							}
						}
					}
					
					System.out.print("Case #" + testCase + ": ");
					
					if (multipleCards) {
						System.out.println("Bad magician!");
					} else if (possibleCard > 0) {
						System.out.println(possibleCard);
					} else {
						System.out.println("Volunteer cheated!");
					}
				}
				
				
			} finally {
				reader.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
