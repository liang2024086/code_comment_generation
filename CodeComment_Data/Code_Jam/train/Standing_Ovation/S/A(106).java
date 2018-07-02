package methodEmbedding.Standing_Ovation.S.LYD1295;



import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

// Using the Google Guava library.
public class A {

	public static void main(String [] args) throws IOException {
		String inputFile = "src/A-small-0.in";
		Scanner in = new Scanner(new File(inputFile));
		PrintStream out = new PrintStream(inputFile.substring(0, inputFile.length()-2)+"out");
		int cases = in.nextInt();
		for (int cs = 1; cs <= cases; cs++) {
			int smax = in.nextInt();
			String aud = in.next();
			
			int tot = 0, toAdd = 0;
			for (int i = 0; i <= smax; i++) {
			    int cur = aud.charAt(i) - '0';
			    if (cur > 0 && tot < i) {
			        toAdd += i - tot;
			        tot = i;
			    }
                tot += cur;
			}
			String ans = "Case #"+cs+": "+toAdd;
			out.println(ans);
			System.out.println(ans);
		}
		out.close();
		in.close();
	}
}
