package methodEmbedding.Magic_Trick.S.LYD1305;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
		
		int testCases = input.nextInt();
		for(int i = 0; i < testCases; i++) {
			int counterx = input.nextInt();
			List<int[]> cards = new ArrayList<int[]>();
			
			cards.add(new int[] {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()});
			cards.add(new int[] {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()});
			cards.add(new int[] {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()});
			cards.add(new int[] {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()});
			
			int countery = input.nextInt() + 4;
			cards.add(new int[] {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()});
			cards.add(new int[] {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()});
			cards.add(new int[] {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()});
			cards.add(new int[] {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()});
			
			int z = 0;
			int card = 0;
			for(int valuex : cards.get(counterx - 1)) {
				for(int valuey : cards.get(countery - 1)) {
					if(z == 0 && valuex == valuey) {
						card = valuex;
						z = 1;
					} else if(z == 1 && valuex == valuey) {
						z = 2;
					} else {
						// do nothing
					}
						
				}
			}
			if(z == 2) {
				out.write("Case #" + (i + 1) + ": Bad magician!");
			} else if(z == 1) {
				out.write("Case #" + (i + 1) + ": " + card);
			} else {
				out.write("Case #" + (i + 1) + ": Volunteer cheated!");
			}
			out.newLine();
			
		}
		input.close();
		out.close();
	}
}
