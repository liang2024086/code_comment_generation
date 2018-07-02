package methodEmbedding.Standing_Ovation.S.LYD708;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(args[0]));
			int n = sc.nextInt();
			PrintWriter writer = new PrintWriter(args[1], "UTF-8");
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt() + 1;
				String s = sc.next();
				int curr = 0;
				int needed = 0;
				for (int j = 0; j < m; j++) {
					int x = Character.getNumericValue(s.charAt(j));
					if (curr < j) {
						int extra = j - curr;
						needed += extra;
						curr += extra;
					}
					curr += x;
				}
				writer.println("Case #" + (i + 1) + ": " + needed);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
