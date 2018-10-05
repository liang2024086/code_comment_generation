package methodEmbedding.Magic_Trick.S.LYD1716;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MagicTrick {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
		String line = br.readLine();
		int cases = new Integer(line);
		for(int i = 1; i <= cases; i++) {
			line = br.readLine();
			int line1 = new Integer(line);
			int [] cards1 = new int[4];
			for(int j = 1; j < 5; j++) {
				String linetmp = br.readLine();
				if(j == line1)
					line = linetmp;
			}
			String[] cardsString = line.split(" ");
			for(int k = 0; k < 4; k++) {
				cards1[k] = new Integer(cardsString[k]);
			}
			
			line = br.readLine();
			int line2 = new Integer(line);
			int [] cards2 = new int[4];
			for(int j = 1; j < 5; j++) {
				String linetmp = br.readLine();
				if(j == line2)
					line = linetmp;
			}
			cardsString = line.split(" ");
			for(int k = 0; k < 4; k++) {
				cards2[k] = new Integer(cardsString[k]);
			}
			
			int cardChosen = 0;
			boolean skip = false;
			outerloop:
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					if(cards1[j] == cards2[k]) {
						if(cardChosen != 0) {
							System.out.println("Case #" + i +": Bad magician!");
							skip = true;
							break outerloop;
						}
						cardChosen = cards1[j];
					}
				}
			}
			if(skip)
				continue;
			if(cardChosen == 0)
				System.out.println("Case #" + i +": Volunteer cheated!");
			else
				System.out.println("Case #" + i +": " + cardChosen);
		}
		
	}

}
