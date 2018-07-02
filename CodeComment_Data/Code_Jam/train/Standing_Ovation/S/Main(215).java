package methodEmbedding.Standing_Ovation.S.LYD625;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		File dir = new File(".");
		File inputFile = new File (dir.getCanonicalPath() + File.separator + "A-small-attempt1.in");
		File outputFile = new File (dir.getCanonicalFile() + File.separator + "A-small-attempt1.out");
		
		FileInputStream FileIS = new FileInputStream(inputFile);
		FileOutputStream FileOS = new FileOutputStream(outputFile);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(FileIS));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(FileOS));
		
		String line = null;
		String outp = "";
		int cases = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < cases; i++) {
			int need = 0;
			int have = 0;
			line = br.readLine();
			if (line != null) {
				String split[] = line.split(" ");
				int max = Integer.parseInt(split[0]);
				for (int j = 0; j <= max; j++) {
					if (j == 0) {
						have = Integer.parseInt(Character.toString(split[1].charAt(j)));
					}
					else {
						if (have >= j) {
							have += Integer.parseInt(Character.toString(split[1].charAt(j)));
						}
						else {
							int missing = j - have;
							need += missing;
							have += missing + Integer.parseInt(Character.toString(split[1].charAt(j)));
						}
					}
				}
				int x = i+1;
				System.out.println("Case #"+x+": "+need);
				outp += "Case #"+x+": "+need+"\r\n";
			}
		}
		bw.write(outp);
		br.close();
		bw.close();
	}

}
