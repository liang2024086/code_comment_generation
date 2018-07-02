package methodEmbedding.Standing_Ovation.S.LYD227;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class StandingOvation
{
	private static String archivo="A-small-attempt0";
	private static boolean test=false;
	
	public static void main(String[] args) throws IOException
	{
		PrintWriter pr;
		if(test) pr=new PrintWriter(System.out);
		else pr=new PrintWriter(new File("./data/qRound_2015/StandingOvation/"+archivo+".out"));
		BufferedReader br=new BufferedReader(new FileReader(new File("./data/qRound_2015/StandingOvation/"+archivo+".in")));
		//--------------------------------------------------------------------------------------
		int casos=Integer.parseInt(br.readLine()), sMax, rta, genteDePie;
		
		char[] publico;
		String aux[];
		
		for(int c=1; c<=casos; c++)
		{
			rta=genteDePie=0;
			aux=br.readLine().split(" ");
			sMax=Integer.parseInt(aux[0]);
			publico=aux[1].toCharArray();
			
			for(int i=0; i<=sMax; i++)
			{
				if(genteDePie<i)
				{
					int losQueHacenFalta=i-genteDePie;
					rta+=losQueHacenFalta;
					genteDePie+=losQueHacenFalta;
				}
				genteDePie+=publico[i]-'0';
			}
			pr.printf("Case #%d: %d\n",c, rta);
		}
		//--------------------------------------------------------------------------------------
		br.close();pr.close();
	}
}
