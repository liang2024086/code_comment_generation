package methodEmbedding.Magic_Trick.S.LYD1901;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MagicTrick {
	static final int SIZE = 4;
	static final int CHOICES = 2;
	static final int MAX_NUMBERS = SIZE*SIZE;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("MagicTrickIn.txt"));
		PrintWriter writer = new PrintWriter("MagicTrickOut.txt");
		int testCases = scan.nextInt();
		for (int i = 0; i < testCases; i++) {
			int[] answers = new int[CHOICES];
			int[][][] distributions = new int[CHOICES][][];
			int[] selected = new int[MAX_NUMBERS+1];
			
			for (int choice = 0; choice < CHOICES; choice++) {
				//Reading input
				answers[choice] = scan.nextInt();
				distributions[choice] = new int[SIZE][];
				for (int row = 0; row < SIZE; row++) {
					distributions[choice][row] = new int[SIZE];
					for (int col = 0; col < SIZE; col++)
						distributions[choice][row][col] = scan.nextInt();
				}
				
				//Processing Row
				for (int j =0 ; j < SIZE; j++) {
					selected[distributions[choice][answers[choice]-1][j]]++;	//the number at the j-th col in the selected row in the <choice>-th choice was selected once again
				}
			}
			
			int guess = 0;
			boolean badMagician = false;
			for (int j = 1; j <= MAX_NUMBERS; j++) {
				if (selected[j] > 1) {
					if (guess > 0)
						badMagician = true;
					guess = j;
				}
			}
			
			writer.print("Case #"+(i+1)+": ");
			if (badMagician)
				writer.println("Bad Magician!");
			else if (guess == 0)
				writer.println("Volunteer cheated!");
			else
				writer.println(guess);			

		}
		scan.close();
		writer.close();
	}

}
