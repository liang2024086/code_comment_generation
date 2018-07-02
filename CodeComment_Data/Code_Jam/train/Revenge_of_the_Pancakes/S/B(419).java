package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class B {
	public static void main(String []args) throws IOException{
		File archivo = new File ("B-small-attempt0.in");
		FileWriter archivo2 = new FileWriter ("Bsalida.txt");
		FileReader fr = new FileReader (archivo);
		PrintWriter pw = new PrintWriter (archivo2);
		BufferedReader br = new BufferedReader(fr);
		Integer t =  Integer.parseInt(br.readLine());
		int caso=1;
		while(t-->0){
			String cad = br.readLine();
			int len = cad.length();
			int contador=0;
			for (int i = 0; i < len; i++) {
				if(i==len-1){
					if(cad.charAt(i)=='-')contador++;
				}
				else{
					if(cad.charAt(i)!=cad.charAt(i+1)){
						contador++;
					}
				}
			}
			pw.println("Case #"+(caso++)+": "+contador);
		}
		archivo2.close();
	}
}
