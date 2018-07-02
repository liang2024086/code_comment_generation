package methodEmbedding.Revenge_of_the_Pancakes.S.LYD848;

import java.util.*;

public class RevengePancakes {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		
		int testcase = Integer.parseInt(cin.nextLine());
		
//		System.out.println("testcases: " + testcase);
		
		for (int i = 0; i < testcase; i++) {
			String pancakes = cin.nextLine();
//			System.out.println(pancakes);
			char top = pancakes.charAt(0);
			
			int flips = 0;
			boolean done = false;
			
			while (done == false) {
				
//				System.out.println(pancakes);
			
				int firstOccurence = 0;
				boolean first = false;
				int lastOccurence = 0;
				
				top = pancakes.charAt(0);
				char opposite;
				
				if (top == '+') {
					opposite = '-';
				}
				else {
					opposite = '+';
				}
			
				for (int x = 0; x < pancakes.length(); x++) {
					if (pancakes.charAt(x) == top && first == false) {
						firstOccurence = x;
						first = true;
					}
					if (pancakes.charAt(x) == opposite && first == true) {
						lastOccurence = x-1;
						first = false;
						break;
					}
				}
				
				//if first stays true at end of loop, just check what top is and flip accordingly for last result
				if (first == true) {
					break;
				}
				else {
				//else..
				
				String newpancakes = "";
				
				//flip lastOccurence+1
				for (int j = 0; j < pancakes.length(); j++) {
					if (j < lastOccurence+1) {
						newpancakes += opposite;
					}
					else {
						newpancakes += pancakes.charAt(j);
					}
				}
				pancakes = newpancakes;
				flips++;
				}
			}
			
			if (top == '-') {
				flips++;
			}
			
			System.out.println("Case #" + (i+1) + ": " + flips);
		}
	}
}
