package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1051;

import java.util.ArrayList;
import java.util.Scanner;


public class pankake {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();
		for(int n =0;n<numCases;n++){
			String pankakes = input.next();
			int cont = 0;
			char prevsigno = pankakes.charAt(pankakes.length()-1);
			
			if (prevsigno == "-".charAt(0)){
				cont++;
			}
			for(int i = pankakes.length()-2; i>-1;i--){
				char signo = pankakes.charAt(i);
				if (signo == "-".charAt(0) && prevsigno == "+".charAt(0)){cont++;}
				if (signo == "+".charAt(0) && prevsigno == "-".charAt(0)){cont++;}
				prevsigno = signo;
			}
			System.out.println("Case #"+(n+1)+": "+(cont));
			}
		
	}

}
