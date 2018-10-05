package methodEmbedding.Revenge_of_the_Pancakes.S.LYD403;

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
		int T=Integer.parseInt(br.readLine()), rta, acumVoltear;
		char[] pancakes;

		for(int c=1; c<=T; c++)
		{
			rta=0;

			pancakes=br.readLine().toCharArray();

			char signo=pancakes[0];
			for(int i=0; i<pancakes.length; i++)
			{
				if(pancakes[i]!=signo)
				{
					if(signo=='-')
					{
						for(int j=0; j<i; j++) pancakes[j]='+';
						rta++;
						i=0;
						signo=pancakes[0];
					}
					else
					{
						for(int j=0; j<i; j++) pancakes[j]='-';
						rta++;
						i=0;
						signo=pancakes[0];
					}
				}
			}
			if(pancakes[pancakes.length-1]=='-') rta++;

			System.out.println("Case #"+c+": "+rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
