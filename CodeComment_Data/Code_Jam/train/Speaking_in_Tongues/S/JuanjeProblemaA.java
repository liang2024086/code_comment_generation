package methodEmbedding.Speaking_in_Tongues.S.LYD210;

import static java.lang.Math.max;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JuanjeProblemaA 
{
	/*
	 * Juan Jesus Gutierrez
	 * Solucion al problema - A
	 */
	public static void main(String[] args)
	{
		byte[] trad =  new byte []
		{'y','n','f','i','c','w','l','b','k','u',
		'o','m','x','s','e','v','z','p','d','r',
		'j','g','t','h','a','q', ' '};
		byte[] ingles = new byte[]
				{
				'a','b','c','d','e','f','g','h','i',
				'j','k','l','m','n','o','p','q','r',
				's','t','u','v','w','x','y','z', ' '
				};
		
		List<Byte> lenguajeGoogle = new
				ArrayList<Byte>();
		List<Byte> lenguajeIngles = new ArrayList<Byte>();
		for(int k = 0; k<trad.length; k++)
		{
			lenguajeGoogle.add(trad[k]);
			lenguajeIngles.add(ingles[k]);
		}
		
		//lector de la entrada
		Scanner in = new Scanner(System.in);
		//numero de frases en Googlerese
		int T = in.nextInt();
		in.nextLine();
		//iteramos sobre cada una de las frases, 
		//para traducirlas..
		for(int frase = 1; frase <= T;frase++)
		{
			String frasePorTraducir = "";
			frasePorTraducir = in.nextLine();
			String fraseTraducida = "";
			
			byte[] letrasTraducir = frasePorTraducir.getBytes();
			byte[] letrasTraducidas = new byte[letrasTraducir.length];
			for(int b = 0; b<letrasTraducir.length; b++)
			{
				//Aqui el algoritmo de conversion..
				
				byte byt = letrasTraducir[b];
				int posicion = lenguajeGoogle.indexOf(byt);
				letrasTraducidas[b] = lenguajeIngles.get(posicion);
				
			}
			
			fraseTraducida = new String(letrasTraducidas);		
			System.out.format("Case #%d: %s\n", frase, fraseTraducida);
		}
	}
}
