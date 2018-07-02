package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1145;



import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

// Using the Google Guava library.
public class B {

	public static void main(String [] args) throws IOException {
		String inputFile = "src/B-small-attempt0.in";
		Scanner in = new Scanner(new File(inputFile));
		PrintStream out = new PrintStream(inputFile.substring(0, inputFile.length()-2)+"out");
		int cases = in.nextInt();
		for (int cs = 1; cs <= cases; cs++) {
		    int flips = 0;
		    String p = in.next();
		    boolean wasHappy = p.charAt(0) == '+';
		    for (int i = 1; i < p.length(); i++) {
		        boolean happy = p.charAt(i) == '+';
		        if (happy != wasHappy) {
		            wasHappy = happy;
		            flips++;
		        }
		    }
		    if (!wasHappy) {
		        flips++;
		    }
			String ans = "Case #"+cs+": "+flips;
			out.println(ans);
			System.out.println(ans);
		}
		out.close();
		in.close();
	}
}
