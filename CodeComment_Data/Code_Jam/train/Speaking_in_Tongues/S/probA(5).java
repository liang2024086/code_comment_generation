package methodEmbedding.Speaking_in_Tongues.S.LYD572;

import java.io.*;
import java.util.*;
class probA {
	public static void main(String[] args) throws IOException {
		String key = "ynficwlbkuomxsevzpdrjgthaq";
		Scanner input = new Scanner(new File("probA.in"));
		PrintWriter output = new PrintWriter(new File("probA.txt"));
		int lines = input.nextInt();
		input.nextLine();
		for (int onl = 0; onl<lines; onl++) {
			String line = input.nextLine();
			String res = "";
			for (int i=0; i<line.length(); i++) {
				if (line.charAt(i) == ' ')
					res += ' ';
				else if (line.charAt(i) < 97) continue;
				else
					res += (char)(key.indexOf(line.charAt(i)) + 97);
			}
			output.println("Case #" + (onl+1) + ": " + res);
		}
		output.close();
	}
}
