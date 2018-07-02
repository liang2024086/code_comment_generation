package methodEmbedding.Speaking_in_Tongues.S.LYD1683;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class AQ {
	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		int T = 0, i, j, k;
		String line = null, caseSolution;
		char c;
		char[][] map = {{' ','e','j','p','m','y','s','l','c','k','d','x','v','n','r','i','b','t','a','h','w','f','o','u','g','q','z'},
						{' ','o','u','r','l','a','n','g','e','i','s','m','p','b','t','d','h','w','y','x','f','c','k','j','v','z','q'}};
		StringBuilder caseI;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1])));	
			T = Integer.parseInt(reader.readLine());
			for (i = 1; i <= T; i++) {
				line = reader.readLine();
				caseI = new StringBuilder();
				for (j = 0; j < line.length(); j++) {
					c = line.charAt(j);
					for (k = 0; k < map[0].length; k++) {
						if (c == map[0][k]) {
							caseI.append(map[1][k]);
							break;
						}
					}
				}
				writer.write("Case #" + i + ": " + caseI.toString() + "\n");			
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		try {
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
