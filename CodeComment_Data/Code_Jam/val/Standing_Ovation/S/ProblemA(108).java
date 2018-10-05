package methodEmbedding.Standing_Ovation.S.LYD203;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;






public class ProblemA  {

	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int cant = Integer.parseInt(in.readLine());
		String ln = "";
		for(int i=0;i<cant;i++){
			
			ln= in.readLine();
		
			String[] datos = ln.split(" ");
			
			int max = Integer.parseInt(datos[0]);
			
			char[] valores = datos[1].toCharArray();
			
			int acum = 0;
			int answ = 0;
			
			for(int j=0;j<=max;j++){
				 int a = Integer.parseInt(valores[j]+"");
				
				 if(j>acum){
					 answ++;
					 acum++;
				 }	
				acum += a;
			}
			
			int num = i+1;
			out.write("Case #"+num+": " + answ + "\n");
			
			
		}
		out.flush();
		
	}
	
	
	
}
