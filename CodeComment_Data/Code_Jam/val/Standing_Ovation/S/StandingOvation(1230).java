package methodEmbedding.Standing_Ovation.S.LYD715;

import java.util.*;
import java.io.*;

public class StandingOvation {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/yuchenyang/Documents/workspace/HelloWorld/src/A-small-attempt1.in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/yuchenyang/Documents/workspace/HelloWorld/src/standingovationout.txt")));
		
		int numOfCases = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= numOfCases; i++) {
			String line = br.readLine();
			int maxNeed = Integer.parseInt(line.charAt(0) + "");
			int nonFriendNum = 0;
			int friendNum = 0;
			int index = 2;
			while (index <= maxNeed + 2) {
				int curShyNum = Integer.parseInt(line.charAt(index) + "");
				if (curShyNum > 0 && (index - 2 > nonFriendNum + friendNum)) {
					friendNum += index - 2 - (nonFriendNum + friendNum);
				}
				
				nonFriendNum += curShyNum;
				
				index++;
			}
			
			bw.write("Case #" + i + ": " + friendNum + "\n");
		}
		
		br.close();
		bw.close();
	}

}
