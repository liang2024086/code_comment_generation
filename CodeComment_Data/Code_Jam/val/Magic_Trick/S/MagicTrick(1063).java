package methodEmbedding.Magic_Trick.S.LYD483;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int kase = 0;
		
		while(kase++ < t) {
			int [] array1 = new int[4];
			int choice1 = Integer.parseInt(br.readLine());
			for (int i = 1; i <= 4; i++) {
				String [] temp = br.readLine().split(" ");
				
				if(i == choice1) {
					for (int j = 0; j < temp.length; j++) {
						array1[j] = Integer.parseInt(temp[j]);
					}
				}
			}
			
			int [] array2 = new int[4];
			int choice2 = Integer.parseInt(br.readLine());
			for (int i = 1; i <= 4; i++) {
				String [] temp = br.readLine().split(" ");
				
				if(i == choice2) {
					for (int j = 0; j < temp.length; j++) {
						array2[j] = Integer.parseInt(temp[j]);
					}
				}
			}
			
			int count = 0;
			int lastChoice = 0;
			for (int i : array1) {
				for (int j : array2) {
					if (i == j) {
						count++;
						lastChoice = i;
						break;
					}
				}
			}
			System.out.print("Case #" + kase + ": ");
			if (count == 1) {
				System.out.println(lastChoice);
			}
			else if(count == 0) {
				System.out.println("Volunteer cheated!");
			}
			else {
				System.out.println("Bad magician!");
			}
		}
	}

}
