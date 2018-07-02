package methodEmbedding.Magic_Trick.S.LYD237;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class A_MagickTrick {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc= new Scanner(new File(args[0]));
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int ans1 = sc.nextInt();
			HashSet<Integer> cards1 = new HashSet<Integer>(4);
			for(int r=1;r<=4; r++) {
				for(int col=1; col<=4; col++) {
					int card = sc.nextInt();
					if(r == ans1) {
						cards1.add(card);
					}
				}
			}
			
			int ans2 = sc.nextInt();
			ArrayList<Integer> cards = new ArrayList<Integer>();
			for(int r=1;r<=4; r++) {
				for(int col=1; col<=4; col++) {
					int card = sc.nextInt();
					if(r == ans2 && cards1.contains(card)) {
						cards.add(card);
					}
				}
			}
			
			System.out.print("Case #" + t + ": ");
			if(cards.size() == 1) {
				System.out.println(cards.get(0));
			}
			else if(cards.size() == 0) {
				System.out.println("Volunteer cheated!");
			}
			else {// cards.size() > 1
				System.out.println("Bad magician!");
			}
		}
	}
}
