package methodEmbedding.Standing_Ovation.S.LYD123;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation {
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("Please give an input file");
			return;
		}
		String fname = args[0];
		
		// Open the file
		FileInputStream fstream;
		try {
			fstream = new FileInputStream(fname);
		} catch (FileNotFoundException e) {
			System.out.println("File not found"); return;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		int numLines = Integer.parseInt( br.readLine() );
		
		//Read File Line By Line
		for (int lineIndex = 0; lineIndex < numLines; ++lineIndex)   {
			String line = br.readLine();
			int additionalFriends = 0;
			int cumSum = 0;
			for (int charIndex = 0; charIndex < line.length()-2; ++charIndex) {
				int shys = Character.getNumericValue(line.charAt(charIndex+2));
				if (shys != 0) {
					if (cumSum < charIndex) {additionalFriends += charIndex - cumSum; cumSum = charIndex;}
					cumSum += shys;
				}
			}
			System.out.println("Case #" + (lineIndex+1) + ": " + additionalFriends);
		}

		//Close the input stream
		br.close();
	}
}
