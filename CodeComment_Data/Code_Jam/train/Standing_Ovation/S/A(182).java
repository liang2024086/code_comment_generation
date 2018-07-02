package methodEmbedding.Standing_Ovation.S.LYD1173;

import java.io.*;
import java.util.*;

public class A{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("in.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("out.txt"));

		int N = Integer.parseInt(br.readLine());

		for(int p = 0; p < N; p++) {
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);

			int ans = 0;
			int total = 0;
			for(int i = 0; i < s[1].length(); i++) {
				total += Integer.parseInt(s[1].charAt(i)+"");
				if(total < i+1) {
					total++;
					ans++;
				}
			}

			pw.println("Case #" + (p+1) + ": " + ans);
		}


		pw.flush();
		pw.close();

	}
}
