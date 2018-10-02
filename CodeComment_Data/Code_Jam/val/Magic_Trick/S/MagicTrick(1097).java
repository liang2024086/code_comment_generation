package methodEmbedding.Magic_Trick.S.LYD717;

/**
 * Name:			MagicTrick.java
 * Description:		Google Jam - Problem A
 * Input: 			Name of the file for the program's input.
 * Date:			12/04/2014
 * Author:			Cristian Medina
 */
import java.io.*;

public class MagicTrick {
	
	public static void main(String[] args) {
		
		// check if there is any input
		/*if (args.length < 1) {
			System.out.println("No input.");
			System.exit(0);
		}
		*/
		// VARIABLES
		int[][] cardArrange = new int[4][4];	//Matrix for the first card arrangement.
		int pick1, pick2;						//Number of row picked.
		int numCases;							//Number of cases to work.
		int pickedCard = -1;
		String[] line, lineCopy = null;

		try {	
			
			BufferedReader bReader = new BufferedReader( new FileReader( "A-small-attempt0.in" ) );
			// Get number of cases
			numCases = Integer.parseInt( bReader.readLine() );
			// Work every cases
			for (int i = 0; i < numCases; i++){
				
				boolean cheated = true;
				boolean moreThanOne = false;
				
				pick1 =Integer.parseInt( bReader.readLine() ) - 1;
				for (int j = 0; j < 4; j++){
					
					line = bReader.readLine().split(" ");
					for (int k = 0; k < 4; k++){
						cardArrange[j][k] = Integer.parseInt( line[k] );
					}
				}
				
				pick2 =Integer.parseInt( bReader.readLine() ) - 1;
				
				for (int j = 0; j < 4; j++){
					line = bReader.readLine().split(" ");
					if ( j == (pick2) ){
						lineCopy = line;
					}
				}
				for (int j = 0; j < 4; j++){
					for (int k = 0; k < 4; k++){
						
						if ( cardArrange[pick1][j] == ( Integer.parseInt( lineCopy[k] ) ) ){
							pickedCard = cardArrange[pick1][j];
							if (!cheated){
								moreThanOne = true;
							}
							cheated = false;
						}
					}
				}
				System.out.print("Case #" + (i+1) + ": ");
				if (cheated){
					System.out.println("Volunteer cheated!");
				} else {
					if (moreThanOne){
						System.out.println("Bad magician!");
					} else {
						System.out.println(pickedCard);
					}
				}
			}
			
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


}
