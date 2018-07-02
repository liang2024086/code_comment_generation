package methodEmbedding.Standing_Ovation.S.LYD188;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;


public class Standin_A {


	public static void main(String[] args) throws NumberFormatException, IOException{


		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out)); 


		int casos = Integer.parseInt(in.readLine());
		int veces = 1;
		

		while (casos>0) {


			StringTokenizer stk = new StringTokenizer(in.readLine());
			
			int guests = 0;
			int parados = 0;
			
			int max_shy = Integer.parseInt(stk.nextToken());
			
			String crowd = stk.nextToken();
			
			for (int i = 0; i < max_shy+1; i++) {
				
				String x = crowd.charAt(i)+"";
				int people_standin = Integer.parseInt(x);				
				
				if (i==0) {
					if (people_standin == 0) {
						guests++;
						parados++;
					}
				}else {
					if (people_standin == 0) {
						
					}else if (parados < i){
						guests += (i-parados);
						parados += (i-parados);
					}
				}
				parados += people_standin;
				
			}
			

			out.write("Case #"+veces+": "+guests+"\n");
			casos--;
			veces++;
		}

		out.flush();
		out.close();
		in.close();
	}
}
