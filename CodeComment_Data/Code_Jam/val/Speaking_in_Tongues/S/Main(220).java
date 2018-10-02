package methodEmbedding.Speaking_in_Tongues.S.LYD1281;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader bf = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("A-small-attempt0.out")));
		String s = "yhesocvxduiglbkrztnwjpfmaq";
		int T = Integer.parseInt(bf.readLine());
		for(int t=1; t<=T; t++) {
			String line = bf.readLine();
			StringBuilder sol = new StringBuilder(String.format("Case #%d: ", t));
			for (char c : line.toCharArray())
				sol.append(c== ' ' ? ' ' : s.charAt(c - 'a'));
			bw.write(sol.append('\n').toString());
		}
		bw.close();
	}
}
