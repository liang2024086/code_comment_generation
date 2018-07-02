package methodEmbedding.Standing_Ovation.S.LYD809;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter printer = new PrintWriter(new File("out.txt"));
		int cases = sc.nextInt();
		
		for (int i = 0; i < cases; i++) {
			int maxShyness = sc.nextInt();
			String s = sc.next();
			String[] arr = s.split("");
			int[] persons = new int[arr.length];
			
			for (int j = 0; j < arr.length; j++) {
				persons[j] = Integer.parseInt(arr[j]);
			}
			
			// the actual shit
			int audienceCount = persons[0];
			int friendCount = 0;
			for (int j = 1; j < persons.length; j++) {
				if (persons[j] == 0) {
					continue;
				} else if (audienceCount >= j) {
					audienceCount += persons[j];
				} else {
					int friendsForCurrentTier = j - audienceCount;
					friendCount += friendsForCurrentTier;
					audienceCount += friendsForCurrentTier + persons[j];
				}
			}
			
			printer.write("Case #" + (i + 1) + ": " + friendCount + "\n");
		}
		
		printer.close();
		sc.close();
	}
}
