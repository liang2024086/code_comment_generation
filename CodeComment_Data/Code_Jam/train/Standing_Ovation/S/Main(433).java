package methodEmbedding.Standing_Ovation.S.LYD661;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file = new File("src/main/A-small-attempt2.in");
	
		try {
			Scanner sc = new Scanner(file);
			int t = sc.nextInt();
			
			for (int tc = 1; tc <= t; tc++) {
			
				int sMax = sc.nextInt();
				char[] shyArray = sc.nextLine().trim().toCharArray();
				int friends = 0;
				int standing = 0;
				
				for (int sl = 0; sl <= sMax; sl++) {
					int p = Character.getNumericValue(shyArray[sl]);
					if (sl == 0) {
						standing = p;
					} else {		
						
						if (standing < sl && p > 0) {
							friends += sl - standing;
							standing += (friends + p);
						} else {
							standing += p;
						}
					}
				}
				
				
				System.out.println("Case #"+tc+": "+friends);
				
			}
			
			sc.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
