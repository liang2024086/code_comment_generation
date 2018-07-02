package methodEmbedding.Standing_Ovation.S.LYD1847;

import java.util.*;
import java.io.*;

public class A {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int cas = 1; cas <=T; cas++) {
			String[] spl = in.readLine().split(" ");
			int S = Integer.parseInt(spl[0]);
			int cnt =0;
			int s = (int)(spl[1].charAt(0)-'0');
			for(int i=1; i<=S;i++)
			{
				if(i>s)
				{
					cnt += i-s;
					s+= i-s;
				}
				s += (int)(spl[1].charAt(i)-'0');
			}
			System.out.println("Case #"+cas+": "+cnt);
		}

	}

}
