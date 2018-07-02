package methodEmbedding.Speaking_in_Tongues.S.LYD1185;

import java.io.*;
import java.util.*;

public class ASpeakingTongues {
	public static void main(String[] args) throws IOException {
		// parsing file
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		FileWriter fw = new FileWriter("outputa.txt");
		int cases = Integer.parseInt(scanner.nextLine());
		String[] lineArray = new String[cases];
		int index = 0;
		while (scanner.hasNextLine()) {
			lineArray[index] = scanner.nextLine();
			System.out.println(lineArray[index]);
			String translated = "";
			for (int i = 0; i < lineArray[index].length(); i++) {
				if (lineArray[index].charAt(i) == 'a')
					translated = translated + "y";
				else if (lineArray[index].charAt(i) == 'b')
					translated = translated + "h";
				else if (lineArray[index].charAt(i) == 'c')
					translated = translated + "e";
				else if (lineArray[index].charAt(i) == 'd')
					translated = translated + "s";
				else if (lineArray[index].charAt(i) == 'e')
					translated = translated + "o";
				else if (lineArray[index].charAt(i) == 'f')
					translated = translated + "c";
				else if (lineArray[index].charAt(i) == 'g')
					translated = translated + "v";
				else if (lineArray[index].charAt(i) == 'h')
					translated = translated + "x";
				else if (lineArray[index].charAt(i) == 'i')
					translated = translated + "d";
				else if (lineArray[index].charAt(i) == 'j')
					translated = translated + "u";
				else if (lineArray[index].charAt(i) == 'k')
					translated = translated + "i";
				else if (lineArray[index].charAt(i) == 'l')
					translated = translated + "g";
				else if (lineArray[index].charAt(i) == 'm')
					translated = translated + "l";
				else if (lineArray[index].charAt(i) == 'n')
					translated = translated + "b";
				else if (lineArray[index].charAt(i) == 'o')
					translated = translated + "k";
				else if (lineArray[index].charAt(i) == 'p')
					translated = translated + "r";
				else if (lineArray[index].charAt(i) == 'q')
					translated = translated + "z";
				else if (lineArray[index].charAt(i) == 'r')
					translated = translated + "t";
				else if (lineArray[index].charAt(i) == 's')
					translated = translated + "n";
				else if (lineArray[index].charAt(i) == 't')
					translated = translated + "w";
				else if (lineArray[index].charAt(i) == 'u')
					translated = translated + "j";
				else if (lineArray[index].charAt(i) == 'v')
					translated = translated + "p";
				else if (lineArray[index].charAt(i) == 'w')
					translated = translated + "f";
				else if (lineArray[index].charAt(i) == 'x')
					translated = translated + "m";
				else if (lineArray[index].charAt(i) == 'y')
					translated = translated + "a";
				else if (lineArray[index].charAt(i) == 'z')
					translated = translated + "q";
				else
					translated = translated + " ";
			}
//			System.out.println("Case #" + (index + 1) + ": " + translated + "\n");
			fw.write("Case #" + (index + 1) + ": " + translated + "\n");
			index++; // DON'T DELETE
		}
		
		fw.close();
	}
}
