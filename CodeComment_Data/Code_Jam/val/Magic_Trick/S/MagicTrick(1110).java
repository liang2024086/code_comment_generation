package methodEmbedding.Magic_Trick.S.LYD362;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;


public class MagicTrick {

	private static String inputFile = "input.txt";
			
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(inputFile));
		int numberOfTest = scanner.nextInt(); 
		
		FileOutputStream fop = new FileOutputStream(new File("result.txt")); 
		BufferedOutputStream bos = new BufferedOutputStream(fop);
		for(int i = 0 ; i < numberOfTest ; i++) {
			int firstArray[][]  	= new int[4][4]; 
			int secondArray[][]  	= new int[4][4]; 
			int firstLine = scanner.nextInt()  -1;
			
			for(int x = 0 ; x < 4 ; x++) {
				for(int y = 0 ; y < 4 ; y++)
					firstArray[x][y] = scanner.nextInt();
			}
			int secondLine = scanner.nextInt() - 1;
			for(int x = 0 ; x < 4 ; x++) {
				for(int y = 0 ; y < 4 ; y++)
					secondArray[x][y] = scanner.nextInt();
			}	
			
			int found = 0 ;
			int matchedInt = -1;
			for(int k = 0 ; k < 4 ; k++) {
				for(int l = 0 ; l < 4 ; l++) {
					if(secondArray[ secondLine ][l] == firstArray[ firstLine ][k]){
						found++;
						matchedInt = secondArray[ secondLine ][l];
					}
				}
			}
				
			if(found == 1)
				System.out.println ("Case #"+(i+1)+": "+ matchedInt);
			else if(found > 1)
				System.out.println ("Case #"+(i+1)+": Bad magician!");
			else if(found == 0 )
				System.out.println ("Case #"+(i+1)+": Volunteer cheated!");
		}
	}

}
