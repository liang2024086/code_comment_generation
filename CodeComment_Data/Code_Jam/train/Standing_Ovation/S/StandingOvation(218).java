package methodEmbedding.Standing_Ovation.S.LYD206;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner scanner = new Scanner("4\n4 11111\n1 09\n5 110011\n0 1");
		Scanner scanner = new Scanner(new File("C:/Users/ChiP/Downloads/A-small-attempt2.in"));
		
		int t = scanner.nextInt();
		for(int i=0; i<t; i++) {
			int smax = scanner.nextInt();
			
			String audience = scanner.next();
			int alreadyUp = 0;
			int peopleNeeded = 0;
			
			for(int k=0; k<=smax; k++) {
				int peopleHere = audience.charAt(k) - '0';
				int peopleAdded = 0;
				if(peopleHere > 0 && alreadyUp < k) {
					peopleAdded = k-alreadyUp;
					peopleNeeded+= peopleAdded;
				}
				alreadyUp += peopleHere+peopleAdded;
			}
			System.out.println("Case #"+(i+1)+": " + peopleNeeded);
		}
	}

}
