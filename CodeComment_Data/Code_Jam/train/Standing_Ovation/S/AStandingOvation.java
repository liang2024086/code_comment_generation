package methodEmbedding.Standing_Ovation.S.LYD262;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 *
 * @author invitado2
 */
public class AStandingOvation {

	public static BufferedReader in;

	public static BufferedWriter out;

	public static StringTokenizer stk;
	
	public static boolean[] marcas;
	
	public static int marcasFaltantes;
		
	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new InputStreamReader(System.in));
		out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(in.readLine());
		
		for (int t = 0; t < T; t++) {
			stk = new StringTokenizer(in.readLine());
			
			int S = Integer.parseInt(stk.nextToken());
			
			String shyness = stk.nextToken();
			
			int y = 0;
			
			for (int k = 0, acomulado = 0; k <= S; k++){
				int people = shyness.charAt(k) - '0',
						news = k - acomulado;
				
				acomulado += people;
				
				if( news > 0 )
				{
					acomulado += news;
					y += news;
				}
			}
			
			out.write("Case #" + (t+1) + ": " + y + "\n");			
		}

		out.flush();
		out.close();
		in.close();
	}
}
