package methodEmbedding.Speaking_in_Tongues.S.LYD1437;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static final String fileName = "A-small-attempt0.in";
	private static char[] tranArray = new char[] { 'y', 'h', 'e', 's', 'o',
			'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't',
			'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		int num = Integer.valueOf(br.readLine());
		for (int i = 0; i < num; i++) {
			String inline = br.readLine();
			StringBuffer outline = new StringBuffer();
			for (int j = 0; j < inline.length(); j++) {
				int ch = inline.charAt(j);
				if (ch == 32) {
					outline.append(' ');
				} else {
					outline.append(tranArray[ch - 97]);
				}
			}
			System.out.println("Case #"+(i+1)+": " + outline);
		}
	}

}
