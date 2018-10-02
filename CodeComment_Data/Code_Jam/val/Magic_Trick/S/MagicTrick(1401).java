package methodEmbedding.Magic_Trick.S.LYD1560;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String outputBuf = "";
			String nstr = reader.readLine();
			int n = Integer.parseInt(nstr);
			
			for(int ca=1; ca<=n; ca++) {
				outputBuf = outputBuf + "Case #" + Integer.toString(ca) + ": ";
				
				int firstRowNum = Integer.parseInt(reader.readLine());
				
				int[] possibleCardNums = new int[4];
				for(int rowIdx=1; rowIdx<=4; rowIdx++) {
					String row = reader.readLine();
					if( firstRowNum != rowIdx ) {
						continue;
					}
					
					String[] cardsStr = row.split(" ");
					
					for(int cardIdx=0; cardIdx<4; cardIdx++) {
						possibleCardNums[cardIdx] = Integer.parseInt(cardsStr[cardIdx]);
					}
				}
				
				boolean multipleAns = false;
				int ans = -1;
				int secondRowNum = Integer.parseInt(reader.readLine());
				for(int rowIdx=1; rowIdx<=4; rowIdx++) {
					String row = reader.readLine();
					if( secondRowNum != rowIdx ) {
						continue;
					}
					
					String[] cardsStr = row.split(" ");
					
					for(int cardIdx=0; cardIdx<4; cardIdx++) {
						int cardNum = Integer.parseInt(cardsStr[cardIdx]);
						for(int pCardIdx=0; pCardIdx<4; pCardIdx++) {
							if( cardNum == possibleCardNums[pCardIdx] ) {
								if( ans != -1 ) {
									multipleAns = true;
								}
								ans = cardNum;
							}
						}
					}
				}
				
				String result = "";
				if( ans == -1 ) {
					result = "Volunteer cheated!";
				} else if( multipleAns ) {
					result = "Bad magician!";
				} else {
					result = Integer.toString(ans);
				}
			
				outputBuf = outputBuf + result;
				
				outputBuf = outputBuf + "\n";
			}
			
			System.out.println(outputBuf);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
