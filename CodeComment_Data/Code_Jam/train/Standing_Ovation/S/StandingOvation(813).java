package methodEmbedding.Standing_Ovation.S.LYD2145;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StandingOvation {

//	static private final String INPUT = "./input.txt";
//	static private final String OUTPUT = "./output.txt";
	static private final String INPUT = "./A-small-attempt2.in";
	static private final String OUTPUT = "./A-small-attempt2.out";

	public static void main(String args[]) {
		// open I/O files
		FileInputStream instream = null;
		PrintStream outstream = null;
		List<Integer> list = null;

		try {
			instream = new FileInputStream(INPUT);
			outstream = new PrintStream(new FileOutputStream(OUTPUT));
			System.setIn(instream);
			System.setOut(outstream);
		} catch (Exception e) {
			System.err.println("Error Occurred.");
			e.printStackTrace();
			return;
		}

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		for (int t = 1; t <= T; ++t) {
			int Si = in.nextInt();
			// System.out.println(Si);
			char[] nums = in.next().toCharArray();
			// System.out.println(num);

			int sum = 0;
			list = new ArrayList<Integer>();
			
			for (int k = 0; k < (Si + 1); ++k){
				sum += nums[k] - '0';

				
				list.add(0);
				// for (int k = 0; k < (Si + 1); ++k) {
				if ((nums[k] - '0') == 0)
					continue;
				if (sum - (nums[k] - '0') >= k)
					continue;
				else
					list.add(k - (sum - (nums[k] - '0')));
			}

			int ans = Collections.max(list);
			System.out.println("Case #" + t + ": " + ans);
		}

		in.close();
		return;
	}

}
