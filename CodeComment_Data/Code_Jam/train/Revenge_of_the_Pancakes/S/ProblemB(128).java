package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1212;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ProblemB {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
//		Scanner sc = new Scanner(new File("B.in"));
//		Scanner sc = new Scanner(new File("B-large.in"));
		int t = sc.nextInt();
		int count = 1;
		
		while(t --> 0) {
			int numChanges = 1;
			String sequence = sc.next();
			
			for(int i = 1; i < sequence.length(); i++) {
				if(sequence.charAt(i) != sequence.charAt(i-1)) {
					numChanges++;
				}
			}
			
			if(sequence.charAt(sequence.length()-1) == '+'){
				numChanges--;
			}
				
			System.out.println("Case #" + count + ": " + numChanges);
			
			count++;
		}
	}
}
