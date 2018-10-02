package methodEmbedding.Magic_Trick.S.LYD1435;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) {
		Integer[][] formation = new Integer[4][4];

		File f = new File("input.in");
		try {
			Scanner s = new Scanner(f);
			int N = Integer.parseInt(s.nextLine());

			for (int c = 0; c < N; c++) {
				ArrayList<Integer> possibles = new ArrayList<>();
				ArrayList<Integer> answer = new ArrayList<>();
				int row = s.nextInt();
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						formation[i][j] = s.nextInt();
					}
				}

				for (Integer i : formation[row - 1]) {
					possibles.add(i);
				}

				row = s.nextInt();
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						formation[i][j] = s.nextInt();
					}
				}
				
				for(Integer i : formation[row-1]){
					if(possibles.contains(i)){
						answer.add(i);
					}
				}
				if(answer.size()>1)
					System.out.println("Case #" + (c+1) + ": Bad magician!");
				else if(answer.size() == 1)
					System.out.println("Case #" + (c+1) + ": " + answer.get(0));
				else
					System.out.println("Case #" + (c+1) + ": Volunteer cheated!");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
