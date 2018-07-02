package methodEmbedding.Magic_Trick.S.LYD779;

import java.util.*;
import java.io.*;

class MagicTrick{
	public static void main(String args[]){

		try{
			Scanner s = new Scanner(new File("A-small-attempt0.in"));
			FileWriter writer = new FileWriter("magic_trick_out.txt");
		
			int numTests = s.nextInt();
			int[] row1 = new int[4];
			int[] row2 = new int[4];

			// solve each test case
			for (int i = 0; i < numTests; i++){
				
				int fstRow = s.nextInt() - 1;
				for (int j = 0; j < 4; j++)
					for (int k =0; k < 4; k++){
						int elem = s.nextInt();
						if (j == fstRow) row1[k] = elem;
					}

				int sndRow = s.nextInt() - 1;
				for (int j = 0; j < 4; j++)
					for (int k =0; k < 4; k++){
						int elem = s.nextInt();
						if (j == sndRow) row2[k] = elem;
					}

				boolean stop = false;
				String res = "";
				for (int j = 0; j < 4 && !stop; j++){
					for (int k = 0; k < 4 && !stop; k++)
						if (row1[j] == row2[k]){
							if (res.length() == 0){
								res = Integer.toString(row1[j]);
								break;
							}
							else if (res.length() != 0 && row1[j] == row2[k]){
								res = "Bad magician!";
								stop = true;
							}
						}
				}
				if (res.length() == 0) res = "Volunteer cheated!";

				writer.write("Case #"+(i+1)+": " + res + "\n");
			}
			writer.close();
		}
		catch(Exception e){
			// file not according to the format
		}
	}
}
