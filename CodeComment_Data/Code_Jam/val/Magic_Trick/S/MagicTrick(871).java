package methodEmbedding.Magic_Trick.S.LYD1886;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class MagicTrick {


	public static void main(String[] args) throws NumberFormatException, IOException{


		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out)); 


		int casos = Integer.parseInt(in.readLine());
		int veces =1;

		while (casos>0) {
			

			int[] posibles1 = new int[4];

			int voluntario1 = Integer.parseInt(in.readLine());

			for (int i = 0; i < 4; i++) {
				if (i == voluntario1-1) {
					StringTokenizer stk = new StringTokenizer(in.readLine());

					for (int j = 0; j < 4; j++) {
						posibles1[j]= Integer.parseInt(stk.nextToken());
					}
				}
				else{
					in.readLine();
				}
			}

			int voluntario2 = Integer.parseInt(in.readLine());
			int[] posibles2 = new int[4];


			for (int i = 0; i < 4; i++) {
				if (i == voluntario2-1) {
					StringTokenizer stk = new StringTokenizer(in.readLine());

					for (int j = 0; j < 4; j++) {
						posibles2[j]= Integer.parseInt(stk.nextToken());
					}

				}
				else{
					in.readLine();
				}
			}
			
			int cantidadSoluciones = 0;
			int sol = 0;

			for (int i = 0; i < 4 && cantidadSoluciones<2; i++) {
				int num = posibles1[i];
				for (int j = 0; j < 4 && cantidadSoluciones<2; j++) {
					
					if (num==posibles2[j]) {
						sol = num;
						cantidadSoluciones++;
					}
				}
				
			}
			
			if (cantidadSoluciones==0) {
				out.write("Case #"+veces+": Volunteer cheated!\n");			
			}else {
				if (cantidadSoluciones==1) {
					out.write("Case #"+veces+": "+sol+"\n");
				} else {
					out.write("Case #"+veces+": Bad magician!\n");
				}
			}
			
			
			casos--;
			veces++;
		}
		
		out.flush();
		out.close();
		in.close();
	}
}
