package methodEmbedding.Counting_Sheep.S.LYD235;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Solution {
	
	public static Set<Integer> chars = new HashSet<Integer>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		add(new Integer(0));
		add(new Integer(1));
		add(new Integer(2));
		add(new Integer(3));
		add(new Integer(4));
		add(new Integer(5));
		add(new Integer(6));
		add(new Integer(7));
		add(new Integer(8));
		add(new Integer(9));
	}};

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		File output = new File("A-small-attempt0.out");
		BufferedWriter bw = new BufferedWriter(new FileWriter(output));
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			Set<Integer> nSet = new HashSet<Integer>();
			int num = 1;
			String NStr = null;
			long finalN = -1;
			while (!nSet.containsAll(chars)) {
				long N = (long) (num * n);
				finalN = N;
				if (N == (long) n && num > 1) {
					finalN = -1;
					break;
				}
				while (N > 0) {
					int digit = (int) (N % 10);
					N /= 10;
					nSet.add(digit);
				}
				num++;
			}
			if (finalN > -1) {
				NStr = String.valueOf(finalN);
			}
			if (NStr == null) {
				bw.write("Case #" + (i + 1) +": INSOMNIA\n");
			} else {
				bw.write("Case #" + (i + 1) +": " + NStr + "\n");
			}
			
		}
		scan.close();
		bw.close();
	}

}
