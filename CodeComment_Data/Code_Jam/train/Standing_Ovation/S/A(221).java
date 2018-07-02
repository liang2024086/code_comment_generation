package methodEmbedding.Standing_Ovation.S.LYD705;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter("a.out");
		
		int T = Integer.parseInt(in.nextLine().trim());
		
		for (int cn = 1; cn <= T; cn++) {
			String inp[] = in.nextLine().trim().split(" ");
			int len = Integer.parseInt(inp[0].trim()) + 1;
			int dat[] = new int[len];
			
			dat[0] = inp[1].charAt(0) - '0';
			int standing = dat[0];
			int added = 0;
			for (int i = 1; i < len; i++) {
				char c = inp[1].charAt(i);
				if (c != '0' && standing < i) {
					added += (i - standing);
					standing = i;
				}
				standing += c - '0';
			}
			
			out.printf("Case #%d: %d\n", cn, added);
		}
		
		out.close();
		in.close();
	}

}
