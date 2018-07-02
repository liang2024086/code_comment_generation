package methodEmbedding.Standing_Ovation.S.LYD1503;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int numberOfCases = Integer.parseInt(sc.next());
		for (int i = 0; i < numberOfCases; i++) {
			int maxShynes = sc.nextInt();
			String audience = sc.next();
			String[] splited = audience.split("");
			int currentStoodUp = 0;
			int notStoodUp = 0;
			for (int j = 0; j <= maxShynes; j++) {
				int noOfPersons = Integer.parseInt(splited[j]);
				if (j <= currentStoodUp) {
					currentStoodUp += noOfPersons;
				} else {
					if (noOfPersons != 0) {
						notStoodUp += j - currentStoodUp;
						currentStoodUp += noOfPersons + notStoodUp;
					}
				}

			}
			System.out.println("Case #" + (i+1) + ": " + notStoodUp);
		}
	}
}
