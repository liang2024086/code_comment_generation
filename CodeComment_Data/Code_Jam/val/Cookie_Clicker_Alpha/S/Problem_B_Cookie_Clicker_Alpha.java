package methodEmbedding.Cookie_Clicker_Alpha.S.LYD887;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.StringTokenizer;
/**
 * @author Dark_Nick 2014
 */
public class Problem_B_Cookie_Clicker_Alpha 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader leer = new BufferedReader(new FileReader("B-small-attempt0.in"));
		BufferedWriter out = new BufferedWriter(new FileWriter("B-small-attempt0.out"));
		StringBuilder salida = new StringBuilder();
		StringTokenizer partes;
		DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
		simbolos.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("0.0000000",simbolos);
		int casos = Integer.parseInt(leer.readLine());
		int cont = 0;
		double C,F,X,minTime,time,galletas,timeGranjas;
		while(casos-- != 0)
		{
			partes = new StringTokenizer(leer.readLine());
			C = Double.parseDouble(partes.nextToken());
			F = Double.parseDouble(partes.nextToken());
			X = Double.parseDouble(partes.nextToken());
			minTime = X/2.0;
			galletas = 2.0;
			timeGranjas = 0.0;
			while(true)
			{
				timeGranjas += C/galletas;
				galletas += F;
				time = timeGranjas + (X/galletas);
				if(minTime > time)
					minTime = time;
				else break;
			}
			//System.out.println(df.format(minTime));
			salida.append("Case #"+(++cont)+": "+df.format(minTime)+"\n");
		}
		leer.close();
		out.append(salida);
		out.close();
	}
}
