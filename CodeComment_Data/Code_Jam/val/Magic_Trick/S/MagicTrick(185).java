package methodEmbedding.Magic_Trick.S.LYD1616;

import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrick {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		
		int t = scanner.nextInt();
		
		for (int i = 0; i < t; i++) {
			int a1 = scanner.nextInt();
			ArrayList <Integer> candidates = new ArrayList <Integer> ();
			
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					int next = scanner.nextInt();
					if (j == a1 - 1) {
						candidates.add(next);
					}
				}
			}
			
			int a2 = scanner.nextInt();
			int current = -1;
			boolean bad = false;
			
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					int next = scanner.nextInt();
					if (!bad && j == a2 - 1) {
						if (candidates.contains(next)) {
							if (current == -1) {
								current = next;
							}
							else {
								bad = true;
							}
						}
					}
				}
			}
			
			builder.append("Case #");
			builder.append(i + 1);
			builder.append(": ");
			if (bad) {
				builder.append("Bad magician!");
			}
			else if (current == -1) {
				builder.append("Volunteer cheated!");
			}
			else {
				builder.append(current);
			}
			builder.append("\n");
		}
		
		System.out.print(builder);
		scanner.close();
	}

}
