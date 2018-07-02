package methodEmbedding.Standing_Ovation.S.LYD1169;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class StandingOvation {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numCases = Integer.parseInt(in.readLine());
		
		for (int c = 1; c <= numCases; c++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int sMax = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int[] slots = new int[sMax+1];
			for (int i = 0; i < slots.length; i++) {
				slots[i] = Integer.parseInt(s.substring(i, i+1));
			}
			
			int numClapping = 0;
			int numNewPeople = 0;
			for (int i = 0; i < slots.length; i++) {
				if (slots[i] == 0) {
					continue;
				} else if (numClapping >= i) {
					numClapping+=slots[i];
				} else {
//					System.out.printf("Don't have enough people clapping. Have: %d, Need: %d\n", numClapping, i);
					int peopleNeeded = i - numClapping;
					numClapping += peopleNeeded + slots[i];
					numNewPeople += peopleNeeded;
				}
			}
			System.out.printf("Case #%s: %s\n", c, numNewPeople);
		}
	}

}
