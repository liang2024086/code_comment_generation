package methodEmbedding.Magic_Trick.S.LYD2171;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {
	public static void main (String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int cn=1; cn<=T; cn++) {
			int a = Integer.parseInt(in.readLine());
			String[] r1 = null;
			for (int i=1; i<=4; i++) {
				String s = in.readLine();
				if (a==i) {
					r1 = s.split(" ");
				}
			}
			a = Integer.parseInt(in.readLine());
			String[] r2 = null;
			for (int i=1; i<=4; i++) {
				String s = in.readLine();
				if (a==i) {
					r2=s.split(" ");
				}
			}
			String output = "";
			for (String s : r1) {
				for (String ss : r2) {
					if (s.equals(ss)) {
						if (!output.equals("")) {
							output = "Bad magician!"; break;
						}
						output = s;
					}
				}
			}
			if (output.equals("")) {
				output = "Volunteer cheated!";
			}

			System.out.println("Case #" + cn + ": " + output);
		}
	}
}
