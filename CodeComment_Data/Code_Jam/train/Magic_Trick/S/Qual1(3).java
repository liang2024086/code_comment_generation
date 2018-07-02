package methodEmbedding.Magic_Trick.S.LYD1575;

import java.util.*;
import java.io.*;

public class Qual1 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("c:\\Users\\frank\\Desktop\\a.in"));
		int cases = inFile.nextInt();
		for(int i=0;i<cases;i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int answer = 0;
			int number = 0;
			boolean cheater = false;
			for(int j=0;j<2;j++) {
				int cardRow = inFile.nextInt()-1;
				for(int row=0;row<4;row++)
					for(int column=0;column<4;column++) {
						if(row==cardRow) {
							if(j==0) 
								list.add(inFile.nextInt());								
							else
								if(list.contains(number=inFile.nextInt())) {
									if(answer==0)
										answer = number;
									else
										cheater=true;
								}
									
						}
						else 
							inFile.next();
						
					}
			}
			System.out.print("Case #"+(i+1)+": ");
			if(cheater) System.out.println("Bad Magician!");
			else if(answer==0) System.out.println("Volunteer Cheated!");
			else System.out.println(answer);
		}
	}

}
