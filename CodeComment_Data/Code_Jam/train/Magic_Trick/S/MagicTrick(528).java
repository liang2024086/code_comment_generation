package methodEmbedding.Magic_Trick.S.LYD2138;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws FileNotFoundException{
	
		Scanner sc = new Scanner(new File("resources/A-small-attempt0.in"));
		int T = Integer.parseInt(sc.nextLine());		
		
		for(int c=1; c<=T; c++) {
			int row1 = Integer.parseInt(sc.nextLine());
			
			String []arrangement1 = new String[4];
			for(int i=0; i<4; i++) {
				arrangement1[i] = sc.nextLine();
			}
			
			int row2 = Integer.parseInt(sc.nextLine());

			String []arrangement2 = new String[4];
			for(int i=0; i<4; i++) {
				arrangement2[i] = sc.nextLine();
			}

			String []rowForArrangement1 = arrangement1[row1-1].split(" ");
			String []rowForArrangement2 = arrangement2[row2-1].split(" ");

			int match=0;
			String matchString = "";
			for(String i : rowForArrangement1) {
				for(String j : rowForArrangement2) {
					if(i.equals(j)) {
						match++;
						matchString = String.valueOf(i);
					}
				}
			}
			
			if(match>1)
				System.out.println("Case #" + c + ": Bad magician!");
			if(match==1)
				System.out.println("Case #" + c + ": " + matchString);
			if(match==0)
				System.out.println("Case #" + c + ": Volunteer cheated!");			
		}		
	}

}
