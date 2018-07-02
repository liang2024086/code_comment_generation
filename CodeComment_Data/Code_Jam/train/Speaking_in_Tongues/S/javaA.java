package methodEmbedding.Speaking_in_Tongues.S.LYD108;

import java.io.*;
import java.awt.*;
class javaA
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt0.in")));
		int n = Integer.parseInt(br.readLine());
		String[] sup;
		String[] inf;
		sup = new String[n];
		inf = new String[n];
		for(int i = 0; i < n; i++)
		{
			sup[i] = br.readLine();
		}
		for(int i = 0; i < n; i++)
		{
			char[] a = sup[i].toCharArray();
			for(int j = 0; j < a.length; j++)
			{
				switch(a[j])
				{
					case 'a': 	a[j] = 'y';
								break;
					case 'b': 	a[j] = 'h';
								break;
					case 'c': 	a[j] = 'e';
								break;
					case 'd': 	a[j] = 's';
								break;
					case 'e': 	a[j] = 'o';
								break;
					case 'f': 	a[j] = 'c';
								break;
					case 'g': 	a[j] = 'v';
								break;
					case 'h': 	a[j] = 'x';
								break;
					case 'i': 	a[j] = 'd';
								break;
					case 'j': 	a[j] = 'u';
								break;
					case 'k': 	a[j] = 'i';
								break;
					case 'l': 	a[j] = 'g';
								break;
					case 'm': 	a[j] = 'l';
								break;
					case 'n': 	a[j] = 'b';
								break;
					case 'o': 	a[j] = 'k';
								break;
					case 'p': 	a[j] = 'r';
								break;
					case 'q': 	a[j] = 'z';
								break;
					case 'r': 	a[j] = 't';
								break;
					case 's': 	a[j] = 'n';
								break;
					case 't': 	a[j] = 'w';
								break;
					case 'u': 	a[j] = 'j';
								break;
					case 'v': 	a[j] = 'p';
								break;
					case 'w': 	a[j] = 'f';
								break;
					case 'x': 	a[j] = 'm';
								break;
					case 'y': 	a[j] = 'a';
								break;
					case 'z': 	a[j] = 'q';
								break;
				}
			}
			inf[i] = new String(a);
		}
		for(int i = 1; i <=n; i++)
		{
			System.out.println("Case #" + i + ": " + inf[i-1]);
		}
	}
}
