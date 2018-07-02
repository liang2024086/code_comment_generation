package methodEmbedding.Revenge_of_the_Pancakes.S.LYD23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RevengeofthePancakes {
	public static void main(String[] args) throws IOException{
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int casos=Integer.parseInt(lector.readLine());
		for (int i = 1; i < casos+1; i++) {
			String caso=lector.readLine();
			boolean salir=true;
			int numerodeVecesHecho=0;
			
		
			while(salir){
				if(caso.charAt(0)=='-'){
					while(caso.charAt(0)=='-'&&caso.length()>1){
						caso=caso.substring(1);
					}
					numerodeVecesHecho++;
					if(caso.charAt(0)=='-'){
						salir=false;
						
					}
				}
				else{
					while(caso.charAt(0)=='+'&&caso.length()>1){
						caso=caso.substring(1);
					}
					if(caso.charAt(0)=='+'){
						salir=false;
					}
					else{
						numerodeVecesHecho++;
					}
				}
				
			}
			
			System.out.println("Case #"+i+": "+numerodeVecesHecho);
		
		}
		
	}
}
