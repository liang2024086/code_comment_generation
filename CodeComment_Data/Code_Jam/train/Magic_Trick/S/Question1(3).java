package methodEmbedding.Magic_Trick.S.LYD500;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Question1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File(System.getProperty("user.dir")+"/"+"A-small-attempt0.in"));
		
		int tests = input.nextInt(); 
		for (int i = 1; i <= tests; i++) {
			
			// first part
			int row = input.nextInt(); 
			for (int j = 0; j < 4 * (row - 1); j++) {
				input.next(); 
			}
			
			Set<Integer> choices = new HashSet<Integer>(); 
			for (int j = 0; j < 4; j++) {
				choices.add(input.nextInt()); 
			}
			
			input.nextLine(); 
			for(int j = 0; j < 4 - row; j++) {
				input.nextLine(); 
			}
			
			// second part
			row = input.nextInt(); 
			for (int j = 0; j < 4 * (row - 1); j++) {
				input.next(); 
			}
			
			
			int counter = 0;  
			int value = 0; 
			for (int j = 0; j < 4; j++) {
				int v = input.nextInt();
				if (choices.contains(v)) {
					counter++;
					value = v; 
				}
			}
			
			input.nextLine(); 
			for(int j = 0; j < 4 - row; j++) {
				input.nextLine(); 
			}
			
			if (counter == 0)
				System.out.println("Case " + "#" + i + ": Volunteer cheated!");
			else if (counter == 1)
				System.out.println("Case " + "#" + i + ": " + value);
			else
				System.out.println("Case " + "#" + i + ": Bad magician!");
		}
	}

}
