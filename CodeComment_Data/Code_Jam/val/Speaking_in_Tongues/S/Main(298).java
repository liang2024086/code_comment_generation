package methodEmbedding.Speaking_in_Tongues.S.LYD653;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main (String[] args) throws IOException {
		// final String encryption = "ynficwlbkuomxsevzpdrjgthaq";
		// final String decryption = "abcdefghijklmnopqrstuvwxyz";
		final String mapping =    "yhesocvxduiglbkrztnwjpfmaq";
		final char[] map = mapping.toCharArray();

		final String outputTemplate = "Case #%d: ";
		
		FileReader fr = new FileReader(new File(args[0] + ".in"));
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(new File(args[0] + ".out"));
		PrintWriter pw = new PrintWriter(fw);
				
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			pw.write(String.format(outputTemplate, i));
			char[] input = br.readLine().toCharArray();
			for (int ch = 0; ch < input.length; ch++) {
				char ref = input[ch];
				if ('a' <= ref && ref <= 'z') {
					ref = map[(ref - 'a')];
				}
				pw.print(ref);
			}
			pw.println();
		}
		try {
			fw.flush();
			fw.close();
		} catch (Exception e) {
		}
	}
}
 
