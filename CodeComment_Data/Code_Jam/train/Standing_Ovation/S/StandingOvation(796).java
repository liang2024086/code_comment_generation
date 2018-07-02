package methodEmbedding.Standing_Ovation.S.LYD1817;

import java.util.*;
import java.io.*;
public class StandingOvation
{
	public static void main (String [] args)
	{
		try
		{
			File miFile = new File(args[0]);
			FileReader miReader = new FileReader(miFile);
			BufferedReader miBuffer = new BufferedReader(miReader);
			int casos = Integer.parseInt(miBuffer.readLine());
			for(int i =0 ;i<casos;i++)
			{
				String linea = miBuffer.readLine();
				char [] lista = linea.toCharArray();
				
				int invitados=0;
				int contador =0;
				int noPersonasParada=0;
//				int nivel = (Integer.parseInt(lista[0]+""));


				for(int x =2;x<lista.length;x++)
				{
					int nivel = (x-2);
					int personas = Integer.parseInt(lista[x]+"");
				if(personas!=0)
					{
					if(noPersonasParada<=nivel)
					{
						invitados+=(nivel-noPersonasParada);
						noPersonasParada+=invitados;
					}
					noPersonasParada+=personas;
				}
					// System.out.println("Personas " + personas);
					// 	System.out.println("PersonasP " + noPersonasParada);
					// 	System.out.println("invitados" + invitados);
					
				}
				System.out.println("Case #"+(i+1)+": "+ invitados);
				
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
