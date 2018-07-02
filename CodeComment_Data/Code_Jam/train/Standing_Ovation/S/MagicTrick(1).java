package methodEmbedding.Standing_Ovation.S.LYD1492;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MagicTrick {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int totalCaseNumber = Integer.parseInt( reader.readLine() );
		for(int caseNo=1 ; caseNo<=totalCaseNumber ; caseNo++ ) {
			String line = reader.readLine();
			String[] part = line.split(" ");
			char[] chrs = part[1].toCharArray();
			int audCount = 0;
			int extraNeed = 0;
			int i = 0;
			for( char ch : chrs ) {
				int audNo = ch - '0';
				if( audNo > 0 ) {
					if( i > audCount ) {
						int diff = i - audCount;
						extraNeed += diff;
						audCount += diff + audNo ;
					} else {
						audCount += audNo;
					}
				}
				i++;
			}
			
			System.out.println("Case #" + caseNo + ": " + extraNeed);
		}
	}
}
