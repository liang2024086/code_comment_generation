package methodEmbedding.Speaking_in_Tongues.S.LYD252;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {

	public static int nTest;
	public static String str;
	public static StringBuilder res;
	
	public static String[] dict = {
		"y", "h", "e", "s", "o",
		"c", "v", "x", "d", "u",
		"i", "g", "l", "b", "k",
		"r", "z", "t", "n", "w",
		"j", "p", "f", "m", "a",
		"q"
	};
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("input.txt"));
		FileWriter writer = new FileWriter(new File("output.txt"));
		nTest = scanner.nextInt();
		scanner.nextLine();
		int count = 1;
		while (scanner.hasNextLine()) {
			str = scanner.nextLine();
			res = new StringBuilder();
			int len = str.length();
			for (int i=0;i<len;++i) {
				if (str.charAt(i) == ' ') {
					res.append(' ');
				}
				else {
					int idx = str.charAt(i) - 'a';
					res.append(dict[idx]);
				}
			}
			writer.write("Case #" + count + ": " + res.toString());
			if (count != nTest) {
				writer.write("\n");
			}
			count++;
		}
		writer.close();
	}
}
