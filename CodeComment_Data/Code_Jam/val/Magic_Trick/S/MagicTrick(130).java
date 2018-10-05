package methodEmbedding.Magic_Trick.S.LYD631;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class MagicTrick {
	
	public static final String BAD_MAGICAN = "Bad magician!";
	public static final String VOL_CHEATED = "Volunteer cheated!";
	public static int test_cases;


	public static void main(String[] args) throws FileNotFoundException {
		
		test_cases = Integer.parseInt(args[0]);
		
		
		String output = "";
		String caseStr = "Case #";
		
		int rowNum1;
		int[] row1 = new int[4];
		int rowNum;
		int[] row = new int[4];
		boolean isFirst = true;
		
		int index = 1;
		int caseNum = 1;
		
		while (index < args.length){
			if (isFirst){
				rowNum1 = Integer.parseInt(args[index]);
				isFirst = false;
				for (int i = 0; i < 4; i++){
					row1[i] = Integer.parseInt(args[index + 1 + i + ((rowNum1 - 1) * 4)]);
				}
			}
			else{
				rowNum = Integer.parseInt(args[index]);
				isFirst = true;
				for (int i = 0; i < 4; i++){
					row[i] = Integer.parseInt(args[index + 1 + i + ((rowNum - 1) * 4)]);
				}
				
				int count = 0;
				int guessNum = 0;
				
				for (int c : row1){
					for(int r : row){
						if (c == r){
							count++;
							guessNum = c;
						}
					}
				}
				
				if (count == 1)
					output += caseStr + caseNum/2 + ": " + guessNum + "\n";
				else if (count == 0)
					output += caseStr + caseNum/2 + ": " + VOL_CHEATED + "\n";
				else if (count > 1)
					output += caseStr + caseNum/2 + ": " + BAD_MAGICAN + "\n";
			}
			
			caseNum++;
			index += 17;
		}
		
		PrintWriter writer = new PrintWriter("output_MagicTrick.txt");
		writer.write(output.substring(0, output.length()-1));
		writer.close();
	}
}
