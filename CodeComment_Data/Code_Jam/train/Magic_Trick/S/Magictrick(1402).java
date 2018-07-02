package methodEmbedding.Magic_Trick.S.LYD123;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Magictrick {
	
	public static final int WIDTH = 4;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));

		int cases = sc.nextInt();
		
		ArrayList<Integer> guessedNums = new ArrayList<Integer>(WIDTH);
		for (int k = 0; k < cases; k++) {
			guessedNums.clear();
			int guessLine = sc.nextInt();
			sc.nextLine();
			
			for (int i = 1; i < WIDTH + 1; i++) {
				if (i == guessLine) {
					for (int j = 0; j < WIDTH; j++) {
						guessedNums.add(sc.nextInt());
					}
					sc.nextLine();
				} else {
					sc.nextLine();
				}
			}
						
			int removed = 0;
			guessLine = sc.nextInt();
			sc.nextLine();
			for (int i = 1; i < WIDTH + 1; i++) {
				if (i == guessLine) {
					for (int j = 0; j < WIDTH; j++) {
						int num = sc.nextInt();
						if (guessedNums.contains(new Integer(num))) {
							removed = num;
							guessedNums.remove(new Integer(num));
						}
					}
					sc.nextLine();
				} else {
					sc.nextLine();
				}
			}
			
			if (guessedNums.size() == WIDTH - 1) {
				System.out.println("Case #" + (k+1) + ": " + removed);
			} else if (guessedNums.size() == WIDTH) {
				System.out.println("Case #" + (k+1) + ": Volunteer cheated!");
			} else {
				System.out.println("Case #" + (k+1) + ": Bad magician!");
			}
		}
	}
	

}
