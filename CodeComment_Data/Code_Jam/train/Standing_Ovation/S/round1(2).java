package methodEmbedding.Standing_Ovation.S.LYD1811;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		File file = new File("C:/Users/michaelbrown17/Desktop/text.in");
		
		try {
			Scanner scan = new Scanner(file);
			
			int cases = scan.nextInt();
			 
			
			for(int i = 0; i < cases; i++) {
				
				int shyL = scan.nextInt();
				String levs = scan.nextLine();
				int num = 0;
				
				int tot = 0;
				for(int j = 1; j < shyL + 1; j++) {
					int beg = Character.getNumericValue(levs.charAt(j));
					tot += beg;
					if(tot < j) {
						num++;
						tot++;
					}
				}
				
				
				
				System.out.println("Case #" + (i + 1) + ": " + num);
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
