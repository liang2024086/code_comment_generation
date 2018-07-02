package methodEmbedding.Magic_Trick.S.LYD918;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		StringTokenizer st;
		int numcases = Integer.parseInt(br.readLine().trim());
		boolean first[][] = new boolean[20][4];
		boolean second[][] = new boolean[20][4];
		int a, b;
		for (int casenum = 1; casenum <= numcases; casenum++) {
			for (boolean arr[] : first)
				Arrays.fill(arr, false);
			for (boolean arr[] : second)
				Arrays.fill(arr, false);
			a = Integer.parseInt(br.readLine().trim()) - 1;
			for (int i = 0; i < 4; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 4; j++)
					first[Integer.parseInt(st.nextToken())][i] = true;
			}
			b = Integer.parseInt(br.readLine().trim()) - 1;
			for (int i = 0; i < 4; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 4; j++)
					second[Integer.parseInt(st.nextToken())][i] = true;
			}
			ArrayList<Integer> answer = new ArrayList<Integer>();
			for (int i = 1; i <= 16; i++)
				if (first[i][a] && second[i][b])
					answer.add(i);
			out.append(String.format("Case #%d: ", casenum));
			if (answer.size() == 0)
				out.append("Volunteer cheated!");
			else if (answer.size() > 1)
				out.append("Bad magician!");
			else
				out.append(answer.get(0));
			out.append('\n');
		}
		System.out.print(out);
	}
}

