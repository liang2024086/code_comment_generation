package methodEmbedding.Revenge_of_the_Pancakes.S.LYD602;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Panqueca {
	
	
	public static void main(String[] args){
		
		
		 Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		 
		 int problemcount  = scan.nextInt();
		 int i = 1;
		 
		 while(i <= problemcount)
		 {
			 
			 String aux = scan.next();
			 
			 char lastChar;
			 int count = 0;
			 
			 int j = aux.length()-1;
			while( j>=0){
				
				if(aux.charAt(j)=='+') {j--; continue;}
				else break;
				
			}
			if( aux.charAt(aux.length()-1) == '-') count++;
			 
			 for(int k = j; k>=0; k--){
					
					
				if(k<aux.length()-1 && aux.charAt(k)!=aux.charAt(k+1)) count++;

			 }
			 
			 System.out.println("Case #" + i + ": " + count);
			 
			 i++;
		 }
		
		
	}
	
	
	
	
}
