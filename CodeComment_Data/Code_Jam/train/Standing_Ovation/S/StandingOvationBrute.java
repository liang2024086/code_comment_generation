package methodEmbedding.Standing_Ovation.S.LYD1482;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class StandingOvationBrute {

	public static void main (String [] args) throws IOException {
		String fileRoot = "A-small-attempt5";
		String fileName = "C:\\Users\\Aaron\\Downloads\\" + fileRoot + ".in";
		BufferedReader reader = new BufferedReader (new FileReader(new File(fileName)));
		int nTestCases = Integer.parseInt(reader.readLine());
		ArrayList<String> out = new ArrayList<String>();
		for (int t = 0; t < nTestCases; t++) {
			String[] parts = reader.readLine().split(" ");
			//int maxShyness = Integer.parseInt(parts[0]);
			
			char[] peopleChars = parts[1].toCharArray();
			int[] people = new int[peopleChars.length];
			for (int i = 0; i < peopleChars.length; i++) people[i] = Character.getNumericValue(peopleChars[i]);
			
			System.out.println("People: " + Arrays.toString(people));
			boolean itWorks = true;
			int count = 30;
			// Run until it no longer works, and you know that the removal of a person was a bad idea.
			outer: while (itWorks) {
				int numPeople = count;
				for (int shyness = 0; shyness < people.length; shyness++) {
					if (numPeople >= shyness) {
						numPeople += people[shyness];
					}
					else {
						itWorks = false;
						break outer;
					}
				}
				count -= 1;
			}
			
			//Add the person back in, make sure that the lowest we can go is 0 people added.
			int supplement = Math.max(count + 1, 0);
			
			out.add("Case #" + (t+1) + ": " + supplement);
		}
		
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Aaron\\Downloads\\" + fileRoot + "-sol-brute.out")));
		for (String s : out) {
			writer.write(s + "\n");
		}
		
		
		writer.close();
		reader.close();
	}
	
}
