package methodEmbedding.Standing_Ovation.S.LYD261;

import java.util.*;
import java.io.*;

public class ProblemA {
	
		public static void main(String[] args) throws FileNotFoundException {
			//Declaratie scannertjeeee
			Scanner sc = new Scanner(new File("A.in")); //lokale testfile uitlezen.
			// !!!! NIET VERGETEN TE UNCOMMENTEN !!!
			//Scanner sc = new Scanner(System.in);
			
			int cases = sc.nextInt();
			int test = 1;
			
			while(cases --> 0) {
				// magic magic maaaaagiiic
				int answer = 0;
				int max_shy = sc.nextInt();
				String in = sc.next();
				int[] shylevel = new int[in.length()];
				
				for(int i=0; i<in.length(); i++){
					shylevel[i] = Character.getNumericValue(in.charAt(i));
				}
				
				int sum = shylevel[0];				
				
				for(int j=1; j<in.length(); j++){
					while(sum<j){
						answer++;
						sum++;
					}
					
					sum = sum + shylevel[j];
				}		

				System.out.println("Case #"+ test + ": " + answer);
				test++;
		}

	}
}
