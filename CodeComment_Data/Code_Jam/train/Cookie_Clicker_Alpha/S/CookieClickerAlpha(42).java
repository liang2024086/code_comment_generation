package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1344;

import java.io.*;
 
public class CookieClickerAlpha{   
	
    public static void main(String[] args){
		int T;  
		String[] in;
		
		try{
			FileReader fr = new FileReader("B-small-attempt0.in");
			BufferedReader br = new BufferedReader(fr);
			T = Integer.parseInt(br.readLine());   
			
			double C[] = new double[T];
			double F[] = new double[T];
			double X[] = new double[T];

			for (int i = 0; i < T; i++){
				in = (br.readLine()).split(" ");
				C[i] = Double.parseDouble(in[0]);
				F[i] = Double.parseDouble(in[1]);
				X[i] = Double.parseDouble(in[2]);
			}
			br.close();

			FileWriter fw = new FileWriter("B-small-attempt0.out");
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < T; i++){
				double P = 2;
				double res = 0;
				while ((res+(X[i]/P)) > (res+(C[i]/P)+(X[i]/(P+F[i])))    ){ //p = 14
					res += (C[i]/P);
					P += F[i];
				}
				res += (X[i]/P);
				if ((i+1) < T){
					bw.write("Case #"+(i+1)+": "+res);
					bw.newLine();
				} else {
					bw.write("Case #"+(i+1)+": "+res);
				}
			}
			bw.close();

		}
		catch(FileNotFoundException ex){
			System.out.println("File not found.");
		}
		catch(IOException ex){
			System.out.println("IO Error");
		}    
    }    
}
