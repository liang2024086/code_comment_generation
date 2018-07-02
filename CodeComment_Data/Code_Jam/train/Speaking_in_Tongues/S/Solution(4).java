package methodEmbedding.Speaking_in_Tongues.S.LYD986;

import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader (new FileReader("input.in"));
		PrintWriter out = new PrintWriter(new File("output.out"));
		
		String st1 = "abcdefghijklmnopqrstuvwxyz";
		String st2 = "ynficwlbkuomxsevzpdrjgthaq";
		
		in.readLine();
		String s = in.readLine();
		int test = 0;
		while (s != null){
			out.print("Case #" + (++test) + ": ");
			StringBuilder ans = new StringBuilder();
			for (int i = 0; i<s.length(); i++){
				int pos = st2.indexOf(s.charAt(i));
				if (pos >=0) {
					ans.append(st1.charAt(pos));
				} else {
					ans.append(s.charAt(i));
				}
			}
			out.println(ans.toString());
			s = in.readLine();
		}
		out.close();
	}
}
