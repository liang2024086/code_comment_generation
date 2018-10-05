package methodEmbedding.Speaking_in_Tongues.S.LYD1129;

import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException{
		char[]replacement = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n_str = br.readLine();
		int n = Integer.parseInt(n_str);
		for(int i = 1;i<=n;i++)
		{
			String s = br.readLine();
			System.out.print("Case #" + i + ": ");
			for(int k = 0;k<s.length();k++)
			{
				if(s.charAt(k)==' ')
					System.out.print(' ');
				else
					System.out.print(replacement[s.charAt(k)-'a']);
			}
			System.out.println("");
		}
	}
}
