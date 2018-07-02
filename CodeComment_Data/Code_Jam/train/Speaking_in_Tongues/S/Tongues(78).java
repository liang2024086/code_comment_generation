package methodEmbedding.Speaking_in_Tongues.S.LYD1643;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author kishor
 * 
 */
public class Tongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		char newarr[] = { 'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u',
				'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p',
				'f', 'm', 'a', 'q' };
		File f = new File("/tmp/inp.txt");
		BufferedReader bReader = new BufferedReader(new InputStreamReader(
				new FileInputStream(f)));
		int lines = Integer.parseInt(bReader.readLine());
		String strLine = null;
		char gc;
		for (int i = 0; i < lines; i++) {
			strLine = bReader.readLine();
			System.out.print("Case #" + (i + 1) + ": ");
			for (int j = 0; j < strLine.length(); j++) {
				gc = strLine.charAt(j);
				if (gc == ' ') {
					System.out.print(" ");
					continue;
				}
				System.out.print(newarr[((int) gc) - 97]);
			}
			System.out.println("");
		}
	}

}
