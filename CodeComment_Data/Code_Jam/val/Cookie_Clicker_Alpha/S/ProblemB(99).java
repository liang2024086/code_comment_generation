package methodEmbedding.Cookie_Clicker_Alpha.S.LYD568;

import java.io.*;
public class ProblemB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fstream = new FileInputStream("B-small-attempt0.in");
		DataInputStream entrada = new DataInputStream(fstream);
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
	    
	   	int t = Integer.parseInt(buffer.readLine());
	    for (int i = 0; i < t; i++) {
				
			String m[] = buffer.readLine().split(" ");
			double c = Double.parseDouble(m[0]);
			double f = Double.parseDouble(m[1]);
			double x = Double.parseDouble(m[2]);
			
			double Inc=2;
			double res=x/Inc;
			int bandera=0;
			
			double time=0;
			
			while(bandera==0){
				double tiemp = c/Inc;
				
				time+=tiemp;
				Inc+=f;
				double res1 =x/Inc + time;
				if(res1> res){
					bandera=1;
				}else{
					res=res1;
				}
			}
			System.out.print("Case #"+(i+1)+": ");
			System.out.printf("%1$.7f", res);
			System.out.println();
		}
	            
	    entrada.close();
	   
	}

}
