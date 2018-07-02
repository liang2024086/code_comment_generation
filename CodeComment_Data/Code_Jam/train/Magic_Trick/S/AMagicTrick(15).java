package methodEmbedding.Magic_Trick.S.LYD1157;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AMagicTrick {
	public static void main(String[] args) throws IOException {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		Scanner s = new Scanner(new File(args[0]));
		File out = new File(args[1]);
		if(!out.exists()) {
			out.createNewFile();
		} else {
			out.delete();
			out.createNewFile();
		}
		FileWriter fw = new FileWriter(out);
		
		int numCases = s.nextInt();
		
		
		for(int i=1; i<=numCases; i++) {
			int firstRow;
			int secondRow;
			
			int[] buckets = new int [17];
			int[][] firstArrangment = new int[4][4];
			int[][] secondArrangement = new int[4][4];
			
			firstRow = s.nextInt()-1;
			for(int row=0; row<4; row++) {
				for(int col=0; col<4; col++) {
					firstArrangment[row][col] = s.nextInt();
				}
			}
			
			for(int j=0; j<4; j++) {
				buckets[firstArrangment[firstRow][j]]++;
			}
			
			secondRow = s.nextInt()-1;
			for(int row=0; row<4; row++) {
				for(int col=0; col<4; col++) {
					secondArrangement[row][col] = s.nextInt();
				}
			}
			
			for(int j=0; j<4; j++) {
				buckets[secondArrangement[secondRow][j]]++;
			}
			
			int result = -1;
			boolean badMagician = false;
			for(int j=1; j<=16; j++) {
				if (buckets[j]==2) {
					if(result!= -1) {
						badMagician = true;
						break;
					}
					result = j;
				}
			}
			
			if(badMagician) {
				fw.write("Case #"+i+": Bad magician!\n");
			} else if(result == -1) {
				fw.write("Case #"+i+": Volunteer cheated!\n");
			} else {
				fw.write("Case #"+i+": "+result+"\n");
			}
			
			
		}
		
		fw.close();
	}

}
