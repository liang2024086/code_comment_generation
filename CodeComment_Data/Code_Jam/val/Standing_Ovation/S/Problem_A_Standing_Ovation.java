package methodEmbedding.Standing_Ovation.S.LYD331;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author Dark_Nick 2015
 */
public class Problem_A_Standing_Ovation 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader leer = new BufferedReader(new FileReader("A-small-attempt0.in"));
		//BufferedReader leer = new BufferedReader(new FileReader("input.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("A-small-attempt0.out"));
		//BufferedWriter out = new BufferedWriter(new FileWriter("salida.out"));
		int casos = Integer.parseInt(leer.readLine());
		StringTokenizer partes;
		String linea;
		StringBuilder salida = new StringBuilder();
		int n,contAmigos,contPersonas,cont = 0;
		while(casos-- != 0)
		{
			partes = new StringTokenizer(leer.readLine());
			n = Integer.parseInt(partes.nextToken());
			linea = partes.nextToken();
			contAmigos = contPersonas = 0;
			for(int i=0; i<(n+1); i++)
			{
				if(contPersonas >= i)
					contPersonas += linea.charAt(i)-'0';
				else
				{
					contAmigos += (i - contPersonas);
					contPersonas += (i - contPersonas)+(linea.charAt(i)-'0');
				}
			}
			salida.append("Case #"+(++cont)+": "+contAmigos+"\n");
		}
		leer.close();
		out.append(salida);
		out.close();
	}
}
