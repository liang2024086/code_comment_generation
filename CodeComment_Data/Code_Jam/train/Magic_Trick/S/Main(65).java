package methodEmbedding.Magic_Trick.S.LYD82;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	static int T, fRow, sRow;
	static int[] fCards, sCards;

	public static void main(String[] args) throws IOException {

		File inDataFile = new File("src/A-small-attempt2.in");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(inDataFile);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		}
		
		T = Integer.parseInt(br.readLine());
		
		fCards = new int[4];
		sCards = new int[4];

		StringBuffer resultSB = new StringBuffer();
		for (int i = 0; i < T; i++) {// for each case

			resultSB.append("Case #"+(i+1)+": ");
			
			fRow = Integer.parseInt(br.readLine());
			
			String[] chosenRowStrings;
			for (int j = 0; j < 4; j++) {// firstCards by row of fRow
				if( j == fRow -1 ){// only store the chosen row cards
					chosenRowStrings = br.readLine().split(" ");
					for(int k=0;k<chosenRowStrings.length;k++){
						fCards[k] = Integer.parseInt(chosenRowStrings[k]);
					}
				}else{
					br.readLine();
				}
			}
			
			sRow = Integer.parseInt(br.readLine());

			for (int j = 0; j < 4; j++) {// secondCards by row of sRow
				if( j == sRow -1 ){// only store the chosen row cards
					chosenRowStrings = br.readLine().split(" ");
					for(int k=0;k<chosenRowStrings.length;k++){
						sCards[k] = Integer.parseInt(chosenRowStrings[k]);
					}
				}else{
					br.readLine();
				}
			}
			
			int matchedNum = 0;
			int card = 0;
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if(fCards[j] == sCards[k]){
						matchedNum++;
						card = fCards[j];
					}
				}
			}
			
			switch(matchedNum){
				case 0:
					resultSB.append("Volunteer cheated!\n");
					break;
				case 1:
					resultSB.append(card+"\n");
					break;
				default:
					resultSB.append("Bad magician!\n");
					break;
			}

		}// end of for each case

		
		//print results
		System.out.println(resultSB.toString());
		
		File outputFile = new File("src/MagicTrickOutput.txt");
		FileWriter fw = new FileWriter(outputFile);
		fw.write(resultSB.toString());
		fw.flush();
		br.close();
		fr.close();
		fw.close();
	}
}
