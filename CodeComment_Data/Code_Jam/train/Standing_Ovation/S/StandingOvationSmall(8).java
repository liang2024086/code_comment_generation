package methodEmbedding.Standing_Ovation.S.LYD2181;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StandingOvationSmall {
	public static void main(String[] args) {

		int count = 1;
		try {			
			Scanner fileScanner = new Scanner(new File("src/com/vipul/codejam15/textfiles/text.txt"));
			
			while (fileScanner.hasNextLine()) {
			  boolean hasNext = false;
			  String line = fileScanner.nextLine();
			  int iFriendCount = 0; 
			  Scanner lineScanner = new Scanner(line);
			  
			  int iMaxShyness = lineScanner.nextInt();
				
			  if (lineScanner.hasNext()) {
				hasNext = true;
				String nextString = lineScanner.next();
				if ( (nextString.length() - 1)  <= iMaxShyness) {
					int totalCount = Character.getNumericValue(nextString.charAt(0));
					for (int i = 0; i < nextString.length(); i++) {
						int iCharacter = Character.getNumericValue(nextString.charAt(i));
						if (iCharacter != 0) {
							if ((totalCount < i) && (Character.getNumericValue(nextString.charAt(nextString.length() - 1)) != 0)) {
								iFriendCount = iFriendCount + (i - totalCount);
							}
						}
						if ((i != 0) && (iCharacter != 0)) {
							totalCount = iFriendCount + totalCount + iCharacter;
						}
					
					}
				}
			  }
			  if (hasNext) {
				System.out.println("Case #" + count + ": " + iFriendCount);
				count++;
			  }
			  lineScanner.close();
			}
			fileScanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
