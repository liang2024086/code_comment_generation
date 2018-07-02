package methodEmbedding.Standing_Ovation.S.LYD1686;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeJam
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int count = 1;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int max = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			char [] chars = str.toCharArray();
			int sofar = 0;
			int needed = 0;
			for (int i = 0; i < chars.length; i++) {
				if (sofar < i) {
					needed += (i-sofar);
					sofar += (i-sofar);
				}
				sofar += (chars[i] - 48);
			}
			System.out.println("Case #" + count + ": " + needed);
			count++;
		}
	}
}
