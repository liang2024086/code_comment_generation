package methodEmbedding.Revenge_of_the_Pancakes.S.LYD543;

import java.io.*;
import java.util.*;

public class solver2 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\zahido\\Downloads\\B-small-attempt0.in");
		File outFile = new File("C:\\Development\\B-small-attempt0.out");
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
		int testCases = Integer.parseInt(br.readLine());
		String pancakeStack;
		
		for (int t = 1; t <= testCases; t++) {
			pancakeStack = br.readLine();
			int maneuver = 0;			
			
			while (pancakeStack.indexOf('-') >= 0) {
				int indexFirstBlankFace = pancakeStack.indexOf('-');
				
				if (indexFirstBlankFace > 0) {
					// Maneuver.
					pancakeStack = pancakeStack.substring(0,  indexFirstBlankFace).replace('+', '-').concat(
							pancakeStack.substring(indexFirstBlankFace));
					maneuver++;
				}
				
				int indexFirstHappyFace = pancakeStack.indexOf('+', indexFirstBlankFace);
				
				if (indexFirstHappyFace >= 0) {
					// Maneuver.
					pancakeStack = pancakeStack.substring(0,  indexFirstHappyFace).replace('-', '+').concat(
							pancakeStack.substring(indexFirstHappyFace));
					maneuver++;
				} else {
					pancakeStack = pancakeStack.replace('-', '+');
					maneuver++;
				}
			} 
			
			bw.write("Case #" + t + ": " + maneuver + "\n");
		}
		br.close();
		bw.close();
	}
}
