package methodEmbedding.Speaking_in_Tongues.S.LYD135;

import java.io.*;
import java.util.*;

public class SpeakingInTounges {
	static char[] key = new char[] { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x',
			'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j',
			'p', 'f', 'm', 'a', 'q' };

	public static void main(String[] args) {
		try {
			FileWriter output = new FileWriter(new File("output.txt"));
			Scanner s = new Scanner(new File("input.txt"));
			int trials = s.nextInt();
			s.nextLine();
			for (int i = 0; i < trials; i++) {
				String translate = s.nextLine();
				output.write("Case #" + (i + 1) + ": ");
				for (int b = 0; b < translate.length(); b++) {
					if (translate.charAt(b) == ' ')
						output.write(' ');
					else
						output.write(key[translate.charAt(b) - 'a']);
				}
				output.write('\n');
			}
			s.close();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
