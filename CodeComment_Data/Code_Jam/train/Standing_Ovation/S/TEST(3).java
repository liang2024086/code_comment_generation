package methodEmbedding.Standing_Ovation.S.LYD2012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			Scanner sc = new Scanner(System.in) ;
 
			String sCurrentLine;
 
			
			int T ;  T = sc.nextInt() ;
			int FIN = T ;
			int cas = 0 ;
			sCurrentLine = sc.nextLine();
			//(sCurrentLine = br.readLine()) != null
			while ( T-- != 0) {
				sCurrentLine = sc.nextLine();
				String[] ch = sCurrentLine.split(" ");
				int somme = Integer.parseInt(String.valueOf(ch[1].charAt(0)));
				int ajout = 0 ;
				for(int i = 1; i < ch[1].length(); i++)
				{
					
					if((somme < i) && (Integer.parseInt(String.valueOf(ch[1].charAt(i)) ) != 0 )) { ajout = ajout + i - somme ; somme += i  ;  }
					somme += Integer.parseInt(String.valueOf(ch[1].charAt(i)));
				}	
				
					
				 System.out.print("Case #"+ ++cas +": "+ ajout) ;
				
				if(cas  != FIN)
				System.out.println();
			}
 
		
		sc.close();
 

	}

}
