package methodEmbedding.Counting_Sheep.S.LYD177;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class cj16a {

	public static void main(String[] args) throws IOException {
		
		int T,x = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		T = Integer.parseInt(br.readLine());
		if(1>T || T> 100)
			return ;
		char ary[] = new char[10];
		while(T != 0)
		{
			T--;
			x++;
			int N;
			String S, sary;
			S = br.readLine();
			N = Integer.parseInt(S);
			
			if(N == 0)
			{
				System.out.println("Case #" + x + ": " + "INSOMNIA");
				continue;
			}
			
			for(int j = 0; j < 10; j++)
			{
				if(S.contains(j+""))
					ary[j] = '1';
				else ary[j] = '0';
			}
			
			
			sary = String.valueOf(ary);
			
			int i = 2, n = N;


			while(sary.contains("0"))
			{
				n = N * i;
				S = n + "";
				i++;
				for(int j = 0; j < 10; j++)
				{
					if(S.contains(j+""))
						ary[j] = '1';
				}
				sary = String.valueOf(ary);
				
			}
			System.out.println("Case #" + x + ": " + n);
		}

	}

}
