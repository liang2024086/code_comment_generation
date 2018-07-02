package methodEmbedding.Standing_Ovation.S.LYD1986;

import java.io.*;
import java.util.*;
import java.math.*;
public class A {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int cases = 1; cases <= T; cases++) {
			String word = br.readLine();
			StringTokenizer st = new StringTokenizer(word);
			int SMax = Integer.parseInt(st.nextToken());
			String people = st.nextToken();
			int cnt = 0, ans = 0;
			
			for (int i = 0; i < people.length(); i++) {
				if(cnt >= i) cnt += Integer.parseInt( people.substring(i, i+1) );
				else {
					ans += i - cnt;
					cnt = i + Integer.parseInt( people.substring(i, i+1) );
				}
			}
			
			System.out.println("Case #" + cases + ": " + ans);
			
		}
		
	}
}
