package methodEmbedding.Magic_Trick.S.LYD370;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class QualificationRoundA {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfCases = Integer.valueOf(br.readLine());
		for(int caseNumber = 1; caseNumber <= numOfCases; caseNumber++) {
			int row1 = Integer.valueOf(br.readLine());
			int[] row1Numbers = new int[4];
			for(int rowNumber = 1; rowNumber <= 4; rowNumber++) {
				String numbers = br.readLine();
				if(rowNumber == row1) {
					StringTokenizer st = new StringTokenizer(numbers);
					for(int i = 0; i < 4; i++) {
						row1Numbers[i] = Integer.valueOf(st.nextToken());
					}
				}
			}
			
			int row2 = Integer.valueOf(br.readLine());
			int[] row2Numbers = new int[4];
			for(int rowNumber = 1; rowNumber <= 4; rowNumber++) {
				String numbers = br.readLine();
				if(rowNumber == row2) {
					StringTokenizer st = new StringTokenizer(numbers);
					for(int i = 0; i < 4; i++) {
						row2Numbers[i] = Integer.valueOf(st.nextToken());
					}
				}
			}
			
			List<Integer> commonNumbers = new ArrayList<>();
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(row1Numbers[i] == row2Numbers[j]) {
						commonNumbers.add(row1Numbers[i]);
					}
				}
			}
			
			System.out.print("Case #" + caseNumber + ": ");
			if(commonNumbers.size() == 0) {
				System.out.println("Volunteer cheated!");
			} else if(commonNumbers.size() == 1) {
				System.out.println(commonNumbers.get(0));
			} else {
				System.out.println("Bad magician!");
			}
		}
	}

}
