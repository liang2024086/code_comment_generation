package methodEmbedding.Speaking_in_Tongues.S.LYD1478;

import java.io.*;
import java.awt.*;
import java.lang.*;
import java.util.*;

public class SolutionOne {
	public static void main(String[] args) {
		String fileName = null;
		if (args.length > 0) {
			fileName = args[0];
		}
		File file = null;
		Scanner scanner = null;
		String targetChars = "abcdefghijklmnopqrstuvwxyz";
		String replacementChars = "yhesocvxduiglbkrztnwjpfmaq";
		try {
			file = new File(fileName);
			scanner = new Scanner(file);
			int numLines = Integer.parseInt(scanner.nextLine());
			for (int lineNumber = 1; lineNumber <= numLines; lineNumber++) {
				String line = scanner.nextLine();
				char[] charArray = new char[line.length()];
				Arrays.fill(charArray, 0, line.length(), ' ');
				for (int c = 0; c < targetChars.length(); c++) {
					for (int i = 0; i < line.length(); i++) {
						if (line.charAt(i) == targetChars.charAt(c)) {
							charArray[i] = replacementChars.charAt(c);
						}
					}
				}
				String translatedLine = new String(charArray);
				System.out.print("Case #" + lineNumber + ": " + translatedLine);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
			
	}
}
