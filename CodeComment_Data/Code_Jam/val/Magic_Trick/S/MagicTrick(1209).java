package methodEmbedding.Magic_Trick.S.LYD1612;

import java.util.HashSet;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases;
		int guess;
		while(sc.hasNext()) {
			testCases = sc.nextInt();
			for(int i = 1; i <= testCases; i++) {
				guess = sc.nextInt();
				HashSet<Integer> set = new HashSet<Integer>();
				for(int j = 1; j <= 4; j++) {
					if(j==guess){
						set.add(sc.nextInt());
						set.add(sc.nextInt());
						set.add(sc.nextInt());
						set.add(sc.nextInt());
					} else {
						sc.nextInt();
						sc.nextInt();
						sc.nextInt();
						sc.nextInt();
					}
				}
				guess = sc.nextInt();
				int match = 0;
				int value = 0;
				int finalValue = 0;
				for(int j = 1; j <= 4; j++) {
					if(j==guess){
						for(int x = 0; x < 4;x++) {
							value = sc.nextInt();
							if(set.contains(value)) {
								match++;
								finalValue = value;
							}
						}
					} else {
						sc.nextInt();
						sc.nextInt();
						sc.nextInt();
						sc.nextInt();
					}
				}
				if(match == 1) {
					System.out.println("Case #"+i+": " + finalValue);
				} else if (match == 0) {
					System.out.println("Case #"+i+": Volunteer cheated!");
				} else {
					System.out.println("Case #"+i+": Bad magician!");
				}
			}
		}

	}

}
