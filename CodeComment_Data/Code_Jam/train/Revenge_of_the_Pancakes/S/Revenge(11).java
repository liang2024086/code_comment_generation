package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1100;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Revenge {

	public static void main(String[] args)  throws FileNotFoundException, IOException {
		Scanner s = new Scanner(new File("B-small-attempt0.in"));
		//Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new FileWriter("Revenge.out"));
		int t = Integer.parseInt(s.nextLine());
		for(int tests = 0; tests < t; ++tests) {
			out.print("Case #" + (tests + 1) + ": ");
			String n = s.nextLine();
			int length = n.length();
			int counter = 0;
			boolean last = false;
			if(n.charAt(length-1) == '-')
				++counter;
			else
				last = true;
			for(int i = length-1; i >= 0; --i) {
				if(n.charAt(i) == '-') {
					if(last) {
						++counter;
						last = false;
					}
				}
				else {
					if(!last) {
						++counter;
						last = true;
					}
				}
			}
			out.println(counter);
		}
		out.close();
	}
}
