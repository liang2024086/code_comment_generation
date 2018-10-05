package methodEmbedding.Magic_Trick.S.LYD1191;

import java.io.*;
import java.util.*;

public class MagicTrick {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;
		double C, F, X;
		T = Integer.parseInt(scan.nextLine());
		String[] res = new String[T];

		for (int ti = 0; ti < T; ti++) {
			String[] line1 = new String[4];
			String[] line2 = new String[4];
			int A = Integer.parseInt(scan.nextLine());
			for (int i=1;i<5;i++) {
				String line = scan.nextLine();
				if (i == A) line1 = line.split(" ");
			}

			int B = Integer.parseInt(scan.nextLine());
			for (int i=1;i<5;i++) { 
				String line = scan.nextLine();
				if (i == B) line2 = line.split(" ");
			}

		//	System.out.println(Arrays.toString(line1));
		//	System.out.println(Arrays.toString(line2));

			String ans = "", same = "";
			int count = 0;
			for (int i=0;i<4;i++)
				for (int j=0;j<4;j++) {
					if (line1[i].equals(line2[j])) { count++; same = line1[i]; }
				}

			if (count > 1) ans = "Bad magician!";
			else if (count == 1)
				ans = same;
			else
				ans = "Volunteer cheated!";

			res[ti] = ("Case #" + (ti + 1) + ": " + ans);
		}
		for (String item : res) System.out.println(item);
	}
}

