package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1105;

import java.util.Scanner;
import java.util.HashMap;

public class pancakes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < length; i++) {
			int segmentCount = 1;
			String input = sc.nextLine();
			char pancake = input.charAt(0);
			for (int j = 1; j < input.length(); j++) {
				if (input.charAt(j) != pancake) {
					segmentCount += 1;
					pancake = input.charAt(j);
				}
			}
			if (pancake == '+') {
				segmentCount -= 1;
			}
			
			System.out.println("Case #" + (i+1) + ": " + segmentCount);
		}
	}
}
