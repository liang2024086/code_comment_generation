package methodEmbedding.Speaking_in_Tongues.S.LYD222;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Tongues {

	public static void main(String[] args) throws IOException {
		String org = "abcdefghijklmnopqrstuvwxyz ";
		String goo = "ynficwlbkuomxsevzpdrjgthaq ";
		int n;
		Scanner sc = new Scanner(System.in);
		FileOutputStream out = new FileOutputStream("out.txt");
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			out.write(("Case #" + (i + 1) + ": ").getBytes());
			String line = sc.nextLine();
			for (int j = 0; j < line.length(); j++) {
				out.write(("" + org.charAt(goo.indexOf(line.charAt(j)))).getBytes());
			}
			out.write(("\n").getBytes());
		}

	}

}
