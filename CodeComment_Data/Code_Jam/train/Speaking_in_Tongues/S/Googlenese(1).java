package methodEmbedding.Speaking_in_Tongues.S.LYD1502;

import java.util.*;
import java.io.*;

public class Googlenese {
	public static void main(String[] args) {
		int numCases;
		int caseindex = 1;
		String line = "";
		String line2 = "";
	
		try {
			File file = new File("A-small-attempt0.in");
			File output = new File("Output.txt");
			PrintWriter pW = new PrintWriter(output);
			Scanner scan = new Scanner(file);
			
			numCases = scan.nextInt();
			line = scan.nextLine();

			for (int i = 0; i < numCases; i++) {
				line = scan.nextLine();
				for (int j = 0; j < line.length(); j++) {
					
					if (line.charAt(j) == 'a') {
						line2 = line2 + 'y';
					} else if (line.charAt(j) == 'b') {
						line2 = line2 + 'h';
					} else if (line.charAt(j) == 'c') {
						line2 = line2 + 'e';
					} else if (line.charAt(j) == 'd') {
						line2 = line2 + 's';
					} else if (line.charAt(j) == 'e') {
						line2 = line2 + 'o';
					} else if (line.charAt(j) == 'f') {
						line2 = line2 + 'c';
					} else if (line.charAt(j) == 'g') {
						line2 = line2 + 'v';
					} else if (line.charAt(j) == 'h') {
						line2 = line2 + 'x';
					} else if (line.charAt(j) == 'i') {
						line2 = line2 + 'd';
					} else if (line.charAt(j) == 'j') {
						line2 = line2 + 'u';
					} else if (line.charAt(j) == 'k') {
						line2 = line2 + 'i';
					} else if (line.charAt(j) == 'l') {
						line2 = line2 + 'g';
					} else if (line.charAt(j) == 'm') {
						line2 = line2 + 'l';
					} else if (line.charAt(j) == 'n') {
						line2 = line2 + 'b';
					} else if (line.charAt(j) == 'o') {
						line2 = line2 + 'k';
					} else if (line.charAt(j) == 'p') {
						line2 = line2 + 'r';
					} else if (line.charAt(j) == 'q') {
						line2 = line2 + 'z';
					} else if (line.charAt(j) == 'r') {
						line2 = line2 + 't';
					} else if (line.charAt(j) == 's') {
						line2 = line2 + 'n';
					} else if (line.charAt(j) == 't') {
						line2 = line2 + 'w';
					} else if (line.charAt(j) == 'u') {
						line2 = line2 + 'j';
					} else if (line.charAt(j) == 'v') {
						line2 = line2 + 'p';
					} else if (line.charAt(j) == 'w') {
						line2 = line2 + 'f';
					} else if (line.charAt(j) == 'x') {
						line2 = line2 + 'm';
					} else if (line.charAt(j) == 'y') {
						line2 = line2 + 'a';
					} else if (line.charAt(j) == 'z') {
						line2 = line2 + 'q';
					} else if (line.charAt(j) == ' ') {
						line2 = line2 + ' ';
					}
				}	
				
				
				pW.println("Case #" + caseindex + ": " + line2);

				caseindex++;
				line2 = "";
			}
			pW.close();
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
