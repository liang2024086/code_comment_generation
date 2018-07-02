package methodEmbedding.Magic_Trick.S.LYD697;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SolveTrick {
	private final static int SETS_PER_CASE = 2;
	private final static int ROWS = 4;
	public static void main(String[] args) {
		
		String inputFile = "magictrick/input.txt";
		
		int cases = 0;
		
		BufferedReader reader = null;
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("magictrick/output.txt", "UTF-8");
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
		try {
			reader = new BufferedReader(new FileReader(inputFile));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		String line = null;
		try {
		
			if((line = reader.readLine()) != null)
				cases = Integer.valueOf(line);
			int[] rowChoices = new int[2];
			String[] strBits = new String[4];
			int[][] set1 = new int[4][4];
			int[][] set2 = new int[4][4];
			int[][] currSet = null;
			String answer;
			for(int testCase = 1; testCase <= cases; testCase++ ) {
				
				for(int set = 0; set < SETS_PER_CASE; set++) {
					if(set == 0)
						currSet = set1;
					else
						currSet = set2;
					rowChoices[set] = Integer.valueOf((line = reader.readLine())) - 1;
					for(int i = 0; i < ROWS; i++) {
						line = reader.readLine();
						strBits = line.split(" ", ROWS);
						for(int strBit = 0; strBit < ROWS; strBit++) {
							
							currSet[i][strBit] = Integer.valueOf(strBits[strBit]);
						}
					}
				}
				MagicTrick trick1 = new MagicTrick(set1,rowChoices[0]);
				MagicTrick trick2 = new MagicTrick(set2,rowChoices[1]);
				
				answer = MagicTrick.findAnswer(trick1.getRow(), trick2.getRow());
				
				writer.println("Case #"+testCase+": "+answer);
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		writer.close();
	}
}
