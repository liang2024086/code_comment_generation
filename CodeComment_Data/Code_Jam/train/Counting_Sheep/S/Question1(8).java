package methodEmbedding.Counting_Sheep.S.LYD742;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter("output.txt", "UTF-8");

		System.out.println("Input Filename: ");
		String filename = scan.nextLine();
		try {
			scan = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.println("Invalid File Input");
			return;
		}

		ArrayList<Character> oneToNine = new ArrayList<Character>();
		oneToNine.add('0');
		oneToNine.add('1');
		oneToNine.add('2');
		oneToNine.add('3');
		oneToNine.add('4');
		oneToNine.add('5');
		oneToNine.add('6');
		oneToNine.add('7');
		oneToNine.add('8');
		oneToNine.add('9');

		int sets = scan.nextInt();
		
		for (int k = 1; k <= sets; ++k) {
			out.write("Case #" + k + ": ");
			String n = scan.next();
			long curr = Long.valueOf(n).longValue();
			if(curr == 0){
				
				out.write("INSOMNIA");
				out.println();
				continue;
			}
			boolean done = false;
			int i = 1;
			ArrayList<Character> pool = new ArrayList<Character>();
			while (!done) {
				ArrayList<Character> chars = new ArrayList<Character>();
				for (char c : n.toCharArray()) {
					chars.add(c);
				}
				// System.out.println(i);
				// System.out.println(chars.toString());
				// done creating chars list [1,2,3] for digit comparison
				for (char c : chars) {
					if (oneToNine.contains(c)) {
						pool.add(c);
					}
				}
				// if we have all the numbers, the n is the last digit to
				// display.
				if (pool.containsAll(oneToNine)) {
					done = true;
					out.write(n);
					out.println();
					//System.out.println("done");
				} else { // multiply n by i
					++i;
					n = String.valueOf(curr * i);
					// System.out.println(n);
					// System.out.println(pool.toString());
				}
			}

		} // end file reading
		out.close();
	}

}
