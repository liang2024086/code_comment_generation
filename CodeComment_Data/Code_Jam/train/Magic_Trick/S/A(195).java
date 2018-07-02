package methodEmbedding.Magic_Trick.S.LYD2141;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class A {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner (System.in);
		int nbProbleme = in.nextInt();
		
		for (int i = 0; i < nbProbleme; i++) {
			int round1Answer = in.nextInt() - 1;
			int[][] round1Card = {
					{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()},
					{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()},
					{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()},
					{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()}
			};
			int round2Answer = in.nextInt() - 1;
			int[][] round2Card = {
					{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()},
					{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()},
					{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()},
					{in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()}
			};
			List<Integer> listRound1 = new ArrayList<Integer>();
			List<Integer> listRound2 = new ArrayList<Integer>();
			for (int j = 0; j < 4; j++) {
				listRound1.add(round1Card[round1Answer][j]);
				listRound2.add(round2Card[round2Answer][j]);
			}
			
			List<Integer> inter = new ArrayList<Integer>();
			for (Integer card : listRound1) {
				if (listRound2.contains(card)) {
					inter.add(card);
				}
			}
			
			if (inter.isEmpty()) {
				System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
			} else if (inter.size() == 1) {
				System.out.println("Case #" + (i+1) + ": " + inter.get(0));
			} else if (inter.size() > 1) {
				System.out.println("Case #" + (i+1) + ": Bad magician!");
			}
		}
		
		in.close();
	}

}
