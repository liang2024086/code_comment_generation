package methodEmbedding.Magic_Trick.S.LYD13;

import java.util.*;

public class a {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for (int i = 0; i < cases; i++){
			int first = sc.nextInt() - 1;
			int[] fish = new int[4];
			for (int y = 0; y < 4; y++) {
				for (int x = 0; x < 4; x++) {
					int in = sc.nextInt();
					if (first == y){
						fish[x] = in;
					}
				}
			}
			int second = sc.nextInt() - 1;
			int[] cake = new int[4];
			for (int y = 0; y < 4; y++) {
				for (int x = 0; x < 4; x++) {
					int in = sc.nextInt();
					if (second == y){
						cake[x] = in;
					}
				}
			}
			int count = 0;
			int value = 0;
			for (int q = 0; q < 4; q++) {
				for (int w = 0; w < 4; w++) {
					if (fish[q] == cake[w]) {
						count++;
						value = fish[q];
					}
				}
			}
			if (count == 0) System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			else if (count == 1) System.out.println("Case #" + (i + 1) + ": " + value);
			else System.out.println("Case #" + (i + 1) + ": Bad magician!");
		}
	}
}
