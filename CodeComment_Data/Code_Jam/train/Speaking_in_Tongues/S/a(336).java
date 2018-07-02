package methodEmbedding.Speaking_in_Tongues.S.LYD1007;

import java.io.*;
import java.util.*;
//import java.math.*;

public class a {

	public static void main(String[] args) throws IOException
	{
		Scanner qwe = new Scanner(new File("a.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("a.out"));
		int t = qwe.nextInt();
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		qwe.nextLine();
		for(int i = 1; i <= t; i++)
		{
			int[] trans = {24,7,4,18,14,2,21,23,3,20,8,6,11,1,10,17,25,19,13,22,9,15,5,12,0,16};
			String G = qwe.nextLine();
			
			char[] g = G.toCharArray();
			char[] ans = new char[g.length];
			for(int j=0; j < g.length; j++)
			{
				if(g[j] == ' ')
					ans[j] = ' ';
				else
					ans[j] = alphabet[trans[g[j] - 'a']];
			}
			
			String answer = "";
			
			for(int j =0; j <g.length; j++)
				answer += ans[j];
			
			out.write("Case #" + i + ": " + answer + "\n");
		}
		out.close();
	}
}

