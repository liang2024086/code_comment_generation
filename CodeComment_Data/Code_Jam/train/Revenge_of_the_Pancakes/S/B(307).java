package methodEmbedding.Revenge_of_the_Pancakes.S.LYD324;


import java.io.*;
import java.util.*;

public class B {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("B-small-attempt0.in"));
		BufferedReader br = new BufferedReader(new InputStreamReader(bis));
		PrintWriter out = new PrintWriter(new File("B-small-attempt0-sol.out"));
		int cases = Integer.parseInt(br.readLine().trim());
		for (int c = 1; c <= cases; c++) {
			String stack = br.readLine().trim();
			int res = 0, start = 0, i;
			while(start < stack.length() && stack.charAt(start) == '+')
				start++;
			boolean inverted = true;
			while(inverted) {
				inverted = false;
				for(i = start;i < stack.length() && stack.charAt(i) == '-';i++) {
					inverted = true;
				}
				if(inverted) {
					if(start != 0)
						res += 2;
					else
						res++;
					start = i;
					while(start < stack.length() && stack.charAt(start) == '+')
						start++;
				}
			}
			out.println("Case #" + c + ": " + res);
		}
		out.close();
	}
}
