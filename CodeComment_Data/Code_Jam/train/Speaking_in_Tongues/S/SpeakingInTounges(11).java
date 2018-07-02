package methodEmbedding.Speaking_in_Tongues.S.LYD259;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class SpeakingInTounges {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		char[] map = new char[26];
		map['a' - 'a'] = 'y';
		map['b' - 'a'] = 'h';
		map['c' - 'a'] = 'e';
		map['d' - 'a'] = 's';
		map['e' - 'a'] = 'o';
		map['f' - 'a'] = 'c';
		map['g' - 'a'] = 'v';
		map['h' - 'a'] = 'x';
		map['i' - 'a'] = 'd';
		map['j' - 'a'] = 'u';
		map['k' - 'a'] = 'i';
		map['l' - 'a'] = 'g';
		map['m' - 'a'] = 'l';
		map['n' - 'a'] = 'b';
		map['o' - 'a'] = 'k';
		map['p' - 'a'] = 'r';
		map['q' - 'a'] = 'z';
		map['r' - 'a'] = 't';
		map['s' - 'a'] = 'n';
		map['t' - 'a'] = 'w';
		map['u' - 'a'] = 'j';
		map['v' - 'a'] = 'p';
		map['w' - 'a'] = 'f';
		map['x' - 'a'] = 'm';
		map['y' - 'a'] = 'a';
		map['z' - 'a'] = 'q';
		File inDir = new File("SpeakingInTounges/input");
		File outDir = new File("SpeakingInTounges/output");
		File[] inFiles = inDir.listFiles();
		for (File inFile : inFiles) {
			BufferedReader br = new BufferedReader(new FileReader(inFile));
			PrintWriter pw = new PrintWriter(new File(outDir, inFile.getName()+".out"));
			long numLines = Long.valueOf(br.readLine());
			for (long i = 1; i <= numLines; i++) {
				String line = br.readLine();
				System.out.println(line);
				StringBuilder buff = new StringBuilder();
				for (int idx = 0; idx < line.length(); idx++) {
					char c = line.charAt(idx);
					if (c >= 'a' && c <= 'z') {
						c = map[c - 'a'];
					}
					buff.append(c);
				}
				System.out.println(buff);
				System.out.println();
				pw.print("Case #"+i+": ");
				pw.println(buff.toString());
			}
			br.close();
			pw.flush();
			pw.close();
		}
	}

}
