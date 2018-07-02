package methodEmbedding.Counting_Sheep.S.LYD304;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int T=Integer.parseInt(br.readLine());
		long N, rta;
		boolean romper, crece, vistos[]=new boolean[10];
		String aux;
		char[] digits;
		
		for(int c=1; c<=T; c++)
		{
			Arrays.fill(vistos, false);
			N=Integer.parseInt(br.readLine());
			
			crece=true;
			
			rta=N;
			while(true)
			{
				aux=""+rta;
				digits=aux.toCharArray();
				for(char ch: digits) vistos[ch-'0']=true;
				
				romper=true;
				for(int i=0; i<10; i++) if(!vistos[i]) romper=false;
				
				if(romper) break;
				else
				{
					if(rta+N==rta) {crece=false; break;}
					rta+=N;
				} 
			}
			
			System.out.println("Case #"+c+": "+(crece?rta+"":"INSOMNIA"));
		}
		//-----------------------------------------------------------
		br.close();
	}
}
