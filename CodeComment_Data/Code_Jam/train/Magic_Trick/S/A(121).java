package methodEmbedding.Magic_Trick.S.LYD1170;



import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Set;

import com.google.common.collect.Sets;

// Using the Google Guava library.
public class A {

	public static void main(String [] args) throws IOException {
		String inputFile = "src/A-small-0.in";
		Scanner in = new Scanner(new File(inputFile));
		PrintStream out = new PrintStream(inputFile.substring(0, inputFile.length()-2)+"out");
		int cases = in.nextInt();
		for (int cs = 1; cs <= cases; cs++) {
			int rowNum = in.nextInt();
			Set<Integer> first = null, second = null;
			for (int i = 1; i <= 4; i++) {
				Set<Integer> vals = Sets.newHashSet();
				for (int j = 0; j < 4; j++) {
					vals.add(in.nextInt());
				}
				if (i == rowNum) {
					first = vals;
				}
			}
			
			rowNum = in.nextInt();
			for (int i = 1; i <= 4; i++) {
				Set<Integer> vals = Sets.newHashSet();
				for (int j = 0; j < 4; j++) {
					vals.add(in.nextInt());
				}
				if (i == rowNum) {
					second = vals;
				}
			}
			first.retainAll(second);
			String s;
			if (first.isEmpty()) {
				s = "Volunteer cheated!";
			} else if (first.size() == 1) {
				s = String.valueOf(first.iterator().next());
			} else {
				s = "Bad magician!";
			}
			String ans = "Case #"+cs+": "+s;
			out.println(ans);
			System.out.println(ans);
		}
		in.close();
		out.close();
	}
}
