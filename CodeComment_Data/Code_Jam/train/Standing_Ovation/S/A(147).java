package methodEmbedding.Standing_Ovation.S.LYD1654;

import java.io.*;
import java.util.*;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("A-small-attempt0.in"));
		BufferedReader br = new BufferedReader(new InputStreamReader(bis));
		PrintWriter out = new PrintWriter(new File("A-small.out"));
		StringTokenizer st;
		int cases = Integer.parseInt(br.readLine().trim());
		for (int c = 1; c <= cases; c++) {
			st = new StringTokenizer(br.readLine());
			int res = 0, stnd = 0;
			int sMax = Integer.parseInt(st.nextToken());
			String config = st.nextToken();
			for(int i = 0;i <= sMax;i++) {
				int num = config.charAt(i)-'0';
				if(num != 0 && stnd < i) {
					res += i-stnd;
					stnd = i;
					stnd += num;
				}else if(num != 0)
					stnd += num;
			}
			out.println("Case #"+c+": "+res);
		}
		out.close();
	}
}
