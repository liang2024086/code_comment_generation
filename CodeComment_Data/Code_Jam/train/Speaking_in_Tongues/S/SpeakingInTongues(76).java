package methodEmbedding.Speaking_in_Tongues.S.LYD1628;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SpeakingInTongues {


	public static void main(String[] args) throws FileNotFoundException {
		
		String filename = "C:\\Users\\kc\\workspace\\Google Code Jam\\src\\A-small-attempt4.in";
		File file = new File(filename);
		// fin = new FileInputStream (filename);
		Scanner in = new Scanner(file);
		// Scanner scanner = new Scanner(new FileInputStream(fFileName), fEncoding);
		
		String input = "";
		String inputString = "";
		int numTestCases = 0;
		
		
		input = in.nextLine();  
		numTestCases = Integer.parseInt(input);
		
		for (int i = 0; i<numTestCases; i++){ 
		
		
			inputString = in.nextLine(); 
			
			String newString = inputString.replace('a', 'Y')
			.replace('b', 'H')
			.replace('c', 'E')
			.replace('d', 'S')
			.replace('e', 'O')
			.replace('f', 'C')
			.replace('g', 'V')
			.replace('h', 'X')
			.replace('i', 'D')
			.replace('j', 'U')
			.replace('k', 'I')
			.replace('l', 'G')
			.replace('m', 'L')
			.replace('n', 'B')
			.replace('o', 'K')
			.replace('p', 'R')
			.replace('q', 'Z')
			.replace('r', 'T')
			.replace('s', 'N')
			.replace('t', 'W')
			.replace('u', 'J')
			.replace('v', 'P')
			.replace('w', 'F')
			.replace('x', 'M')
			.replace('y', 'A')
			.replace('z', 'Q').toLowerCase();
			
			System.out.println("Case #" + (i+1) + ": " + newString);
			
		}in.close();
	}	
}
