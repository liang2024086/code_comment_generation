package methodEmbedding.Standing_Ovation.S.LYD375;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ProblemA {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new FileReader("A-small-attempt1.in"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		int numTestCases = scanner.nextInt();
		for (int i = 0; i < numTestCases; i++) {
			System.out.println("Case: "+i);
			int maxShyness = scanner.nextInt();
			//System.out.println("ms: "+maxShyness);
			int[] audienceShyness = new int[maxShyness+1];
			String temp = scanner.next();
			for (int j = 0; j <= maxShyness; j++) {
				audienceShyness[j] = Integer.parseInt(temp.substring(j, j+1));
				//System.out.println(audienceShyness[j]);
			}
			for (int j = 0; j < audienceShyness.length; j++) {
			System.out.print(audienceShyness[j]+" ");
			
			}
			System.out.println();
			
			int numClapping = audienceShyness[0];
			int shynessLevel = 1;
			int minimumFriends = 0;
			
			while (shynessLevel <= maxShyness) {
				System.out.println("numclapping "+numClapping);
				System.out.println("sL "+shynessLevel);
				if (audienceShyness[shynessLevel] == 0) {
					shynessLevel++;
				}
				else {
					if (shynessLevel > numClapping) {
						System.out.println(shynessLevel+" > "+numClapping);
						int friendsToAdd = shynessLevel - numClapping;
						System.out.println(friendsToAdd);
						minimumFriends += friendsToAdd;
						numClapping += friendsToAdd;
					}
					numClapping += audienceShyness[shynessLevel];
					shynessLevel++;
				}
				System.out.println();
			}
			writer.write("Case #"+(i+1)+": "+minimumFriends+"\n");
			System.out.println("f: "+minimumFriends);
		}
		writer.close();
	}

}
