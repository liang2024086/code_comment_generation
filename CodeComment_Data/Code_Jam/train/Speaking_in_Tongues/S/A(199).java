package methodEmbedding.Speaking_in_Tongues.S.LYD1656;

/**
 * A.java
 * @author Joel C. Soares
 */
 
import java.util.TreeMap;
import java.util.Scanner;
 
public class A
{
	public static void main( String args[] )
	{
		String codificado = 
				"ejp mysljylc kd kxveddknmc re jsicpdrysi" +
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" +
				"de kr kd eoya kw aej tysr re ujdr lkgc jvzq",
			decodificado =
				"our language is impossible to understand" +
				"there are twenty six factorial possibilities" +
				"so it is okay if you want to just give upqz";
				
		TreeMap map = new TreeMap<Character,Character>();
		Scanner input = new Scanner( System.in );
		int t, i, j;
		
		// faz mapeamento
		for( i = 0; i < codificado.length(); i++ )
		{
			if( map.get( codificado.charAt( i ) ) == null )
				map.put( codificado.charAt( i ), decodificado.charAt( i ) );
		} 
		
		t = input.nextInt();
		input.nextLine();
		for( i = 0; i < t; i++ )
		{
			codificado = input.nextLine();
			decodificado = "";
			for( j = 0; j < codificado.length(); j++ )
				decodificado += map.get( codificado.charAt( j ) );
			System.out.printf( "Case #%d: %s\n", i + 1, decodificado );
		} 
			
	} 
} // fim de classe
