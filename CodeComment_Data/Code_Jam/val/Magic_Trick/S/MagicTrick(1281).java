package methodEmbedding.Magic_Trick.S.LYD762;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		String fileName = "A-small-attempt1";
		BufferedReader br = new BufferedReader(new FileReader
				(new File(fileName+".in")));
		PrintWriter pw = new PrintWriter(new File(fileName + ".txt"));
		
		int testCases = Integer.parseInt(br.readLine());
		
		for (int testCase = 1; testCase <= testCases; testCase++) {
			int answer1, answer2;
			Integer[][] arrgn1 = new Integer[4][4];
			Integer[][] arrgn2 = new Integer[4][4];
			
			answer1 = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < 4 ; i++) {
				String[] words = br.readLine().split(" ");
				for (int j = 0; j<4; j++) {
					arrgn1[i][j] = Integer.parseInt(words[j]);
				}
			}
			
			answer2 = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < 4 ; i++) {
				String[] words = br.readLine().split(" ");
				for (int j = 0; j<4; j++) {
					arrgn2[i][j] = Integer.parseInt(words[j]);
				}
			}
			
			int matches = 0;
			int matchedNumber = 0;
			for (int i =0 ; i<4;i++) {
				for (int j=0; j< 4; j++) {
					if (arrgn1[answer1-1][i] == arrgn2[answer2-1][j]) {
						matches++;
						matchedNumber = arrgn1[answer1-1][i];
					}
				}
			}
			
			//System.out.print("Case #" + testCase + ":");
			pw.print("Case #" + testCase + ":");
			if (matches == 0) {
				pw.println(" Volunteer cheated!");
			} else if (matches == 1) {
				pw.println(" " + matchedNumber);
			} else {
				pw.println(" Bad magician!");
			}
		}
		br.close();
		pw.flush();
		pw.close();		
	}

}
