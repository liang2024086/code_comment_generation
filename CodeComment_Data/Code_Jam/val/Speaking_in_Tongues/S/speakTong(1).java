package methodEmbedding.Speaking_in_Tongues.S.LYD1642;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class speakTong {

	public static void main(String[] args) throws IOException {

		char[][] map = { { 'a', 'y' }, { 'b', 'h' }, { 'c', 'e' },
				{ 'd', 's' }, { 'e', 'o' }, { 'f', 'c' }, { 'g', 'v' },
				{ 'h', 'x' }, { 'i', 'd' }, { 'j', 'u' }, { 'k', 'i' },
				{ 'l', 'g' }, { 'm', 'l' }, { 'n', 'b' }, { 'o', 'k' },
				{ 'p', 'r' }, { 'q', 'z' }, { 'r', 't' }, { 's', 'n' },
				{ 't', 'w' }, { 'u', 'j' }, { 'v', 'p' }, { 'w', 'f' },
				{ 'x', 'm' }, { 'y', 'a' }, { 'z', 'q' } };

		String Path = "C:\\Users\\Dell\\Desktop\\A-small-attempt0.in";
		Scanner read = new Scanner(new File(Path));

		File file = new File("C:\\Users\\Dell\\Desktop\\output.txt");
		PrintWriter Fout = new PrintWriter(new BufferedWriter(new FileWriter(
				file)), true);

		char toMap = 'a';
		int index = 0;
		char mapped = 'a';
		String line = read.nextLine();
		int casenum = 0;
		while (read.hasNextLine()) {
			line = read.nextLine();
			casenum = casenum + 1;
			Fout.print("Case #" + casenum + ": ");
			for (int i = 0; i < line.length(); i++) {
				toMap = line.charAt(i);
				if (toMap == ' ') {
					Fout.print(toMap);
				} else {
					index = toMap - 'a';
					mapped = map[index][1];
					Fout.print(mapped);
				}

			}
			Fout.println();
		}
		read.close();

	}
}
