package methodEmbedding.Standing_Ovation.S.LYD333;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AProblemStandingOvation {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(in.readLine());
		
		int TCase = 1;
		String sep = "";
		while(TCase<=T){
			String linea = in.readLine();
			String[] valores = linea.split(" ");
			
			int Smax = Integer.parseInt(valores[0]);
			String shyness = valores[1];
			
			int suma = 0;
			int cantidad = 0;
			for(int k=0;k<Smax+1;k++){
				int actual = Integer.parseInt(shyness.charAt(k)+"");
				int faltante = 0;
				if(suma<k){
					faltante = k-suma;
				}
				suma += actual + faltante;
				cantidad += faltante;
			}
			
			out.write(sep+"Case #"+TCase+": "+cantidad);
			sep = "\n";
			TCase++;
		}
		out.flush();
	}
}
