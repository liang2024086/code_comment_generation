package methodEmbedding.Standing_Ovation.S.LYD1883;

import java.util.*;
import java.lang.*;
import java.io.*;

public class StandingOvation {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File(args[0]));
		FileWriter out = new FileWriter("aout.txt");
		
		int T = in.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int smax = in.nextInt();
			int counter = 0;
			int adds = 0;
			String aud = in.next();
			for (int s = 0; s <= smax; s++) {
				if (s > counter) {
					adds += s - counter;
					counter = s;
				}
				counter += Integer.parseInt(aud.substring(s, s + 1));
			}
			System.out.print("Case #" + i + ": " + adds + "\n");
			out.write("Case #" + i + ": " + adds + "\n");
		}
		in.close();
		out.close();

	}

}
