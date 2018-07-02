package methodEmbedding.Revenge_of_the_Pancakes.S.LYD307;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemBRevengeofthePancakes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
		DataInputStream entrada = new DataInputStream(fstream);
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
	    
	   	int t = Integer.parseInt(buffer.readLine());
	    for (int i = 0; i < t; i++) {
	    	String cadena = buffer.readLine();	
	    	int res=0;
	    	for (int j = 0; j < cadena.length(); j++) {
				if(j!=0){
					if(cadena.charAt(j)!= cadena.charAt(j-1)){
						res++;
					}
				}
				if(((j+1)==cadena.length()) && (cadena.charAt(j) == '-' )){
					res++;
				}
			}
			System.out.print("Case #"+(i+1)+": ");
			System.out.print(res);
			System.out.println();
			
		}
	            
	    entrada.close();
	}
}
