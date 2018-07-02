package methodEmbedding.Standing_Ovation.S.LYD1676;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class A {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("a.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("a.out")));
		
		final int N = Integer.parseInt(in.readLine());
		for(int i = 0; i < N; i++){
			int ans = 0;
			StringTokenizer st = new StringTokenizer(in.readLine());
			int num = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			int current = 0;
			for(int j = 0; j <= num; j++){
				int k = Integer.parseInt(str.substring(j, j+1));
				int add = Math.max(0, j - current);
				ans += add;
				current += add + k;
			}
			out.println("Case #" + (i+1) + ": " + ans);
		}
		in.close();
		out.close();
	}
}
