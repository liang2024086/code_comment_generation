package methodEmbedding.Magic_Trick.S.LYD1557;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;

public class MagicTrick {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new java.io.BufferedReader(
				new FileReader(
						"C:/google/GoogleQualifying/src/quallifying/A-small-attempt0.in"));
		PrintWriter writer = new PrintWriter(
				"C:/google/GoogleQualifying/src/quallifying/output.txt",
				"UTF-8");

		int testCases = Integer.parseInt(br.readLine());

		int caseNo = 0;

		do {

			caseNo++;
			writer.print("Case #" + caseNo + ": ");
			System.out.print("Case #" + caseNo + ": ");

			int firstAnsRow = Integer.parseInt(br.readLine());
			int[][] firstCards = new int[5][5];

			for (int i = 1; i < 5; i++) {
				String lineString = br.readLine();
				String[] numberStrings = lineString.split(" ");
				if (numberStrings.length != 4) {
					i--;
					continue;
				}
				for (int j = 1; j < 5; j++) {
					firstCards[i][j] = Integer.parseInt(numberStrings[j-1]);
				}
			}

			int secondAnsRow = Integer.parseInt(br.readLine());
			int[][] secondCards = new int[5][5];

			for (int i = 1; i < 5; i++) {
				String lineString = br.readLine();
				String[] numberStrings = lineString.split(" ");
				if (numberStrings.length != 4) {
					i--;
					continue;
				}
				for (int j = 1; j < 5; j++) {
					secondCards[i][j] = Integer.parseInt(numberStrings[j-1]);
				}
			}

			/*
			 * System.out.println(firstAnsRow); for (int i = 1; i < 5; i++) {
			 * for (int j = 1; j < 5; j++) { System.out.print(firstCards[i][j] +
			 * " "); } System.out.println(""); }
			 * System.out.println(secondAnsRow); for (int i = 1; i < 5; i++) {
			 * for (int j = 1; j < 5; j++) { System.out.print(secondCards[i][j]
			 * + " "); } System.out.println(""); }
			 */
			
			HashSet<Integer> theRow = new HashSet<Integer>();
			int count = 0;
			int resCard = 0;
			
			for(int j=1;j<5;j++){
				theRow.add(firstCards[firstAnsRow][j]);
			}
			
			for(int j=1;j<5;j++){
				if(!(theRow.add(secondCards[secondAnsRow][j]))){
					count++;
					resCard = secondCards[secondAnsRow][j]; 
				}
			}

			if(count == 1){
				writer.println(resCard);
				System.out.println(resCard);
			}else if(count>1){
				writer.println("Bad magician!");
				System.out.println("Bad magician!");
			}else{
				writer.println("Volunteer cheated!");
				System.out.println("Volunteer cheated!");
			}
			
			
			testCases--;
		} while (testCases != 0);

		writer.close();
	}

}
