package methodEmbedding.Standing_Ovation.S.LYD395;

/**
 * 
 */

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author warcops
 *
 */
public class A {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fileIn = new FileInputStream("C:/Users/Anvesh/Desktop/inA.in");
		FileOutputStream fileOut = new FileOutputStream("C:/Users/Anvesh/Desktop/outA.txt");
		OutputStreamWriter outStreamWriter = new OutputStreamWriter(fileOut);
		BufferedWriter bufFileOut = new BufferedWriter(outStreamWriter);
		Scanner input = new Scanner(fileIn);
		int noOfCases = input.nextInt();
		
		for(int caseNo = 1; caseNo <= noOfCases; caseNo++) {
			int maxShyness = input.nextInt();
			String shynessLevel = input.next();
			
			int friendsRequired = 0, standing = 0;
			for(int shynessCount = 0; shynessCount < shynessLevel.length(); shynessCount++) {
				int considered = Integer.parseInt(shynessLevel.charAt(shynessCount) + "");
				if(standing < shynessCount && considered  > 0) {
					friendsRequired = friendsRequired + shynessCount - standing;
					standing += friendsRequired;
				}
				standing += considered;
				if(maxShyness < standing) {
					break;
				}
			}
			
			bufFileOut.append("Case #" + caseNo + ": " + friendsRequired);
			bufFileOut.newLine();
		}
		
		input.close();
		fileIn.close();
		bufFileOut.close();
		outStreamWriter.close();
		fileOut.close();
	}

}
