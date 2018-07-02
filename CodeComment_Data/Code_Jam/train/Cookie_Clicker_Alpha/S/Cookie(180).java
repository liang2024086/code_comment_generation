package methodEmbedding.Cookie_Clicker_Alpha.S.LYD361;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.StringTokenizer;


public class Cookie {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				System.out));
		StringBuilder sb = new StringBuilder();
		
		Locale.setDefault(Locale.US);

		int t = Integer.parseInt(br.readLine());
		int cont = 0, segundo = 0, quantidadeCookie = 0;
		double c,f,x,cps = 2, tempo= 0;
		StringTokenizer st;
		while(t-- > 0){
			st = new StringTokenizer(br.readLine());
			
			c = Double.parseDouble(st.nextToken());
			f = Double.parseDouble(st.nextToken());
			x = Double.parseDouble(st.nextToken());

			//tempo += 1;
			//quantidadeCookie +=  cps;
			while(true){
				//Passa o tempo 
				double tempoFazenda = 0;
				double tempoNormal = 0;
				tempoFazenda = c/cps;
				tempoFazenda += x/(cps + f);
				tempoNormal = (x)/cps;
				
				if ( tempoFazenda > tempoNormal){
					tempo += tempoNormal;
					break;
					//quantidadeCookie += quantidadeCookie * cps * tempoNormal;
				}else { //Decidi comprar fazenda
					tempo += (c - quantidadeCookie)/(cps);
					cps += f;
					quantidadeCookie = 0;
				}
					
				if ( quantidadeCookie >= x){
					break;
				}
				
				
			}
			
			
			sb.append("Case #");
			sb.append(++cont);
			sb.append(": ");
			sb.append(String.format("%.7f", tempo));
			sb.append("\n");
			//cont++;
			
			tempo = 0;
			quantidadeCookie = 0;
			segundo = 0;
			cps = 2;
			
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		
	}
	
}
