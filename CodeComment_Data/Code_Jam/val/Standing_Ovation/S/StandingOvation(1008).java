package methodEmbedding.Standing_Ovation.S.LYD121;

import java.util.*;
import java.io.*;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new File("input.txt"));
		
		int times = input.nextInt();
		
		for (int a = 1; a <= times; a++) {
			int maxShyness = input.nextInt();
			int[] levels = new int[maxShyness + 1];
			
			String data = input.next();
			
			for (int b = 0; b < levels.length; b++) {
				levels[b] = Integer.parseInt(data.charAt(b) + "");
			}
			
			int numNeeded = 0;
			int numStanding = 0;
			
			for (int b = 0; b < levels.length; b++) {
				while (numStanding < b) {
					numNeeded++;
					numStanding++;
				}
				numStanding += levels[b];
			}
			
			System.out.println("Case #" + a + ": " + numNeeded);
		}

	}

}
