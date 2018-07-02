package methodEmbedding.Standing_Ovation.S.LYD1534;

import java.util.*;
import java.io.*;

public class A {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out,true);
		
		int N = in.nextInt();
		String[] answers = new String[N]; 
		
		for (int test = 1; test <= N; test++ ){
			int maxShy = in.nextInt();
			String[] audience = in.next().split("");
			
			int standing = 0;
			int invite = 0;
			
			for (int peopleLevel = 0; peopleLevel <= maxShy; peopleLevel++){
				int shy = Integer.parseInt(audience[peopleLevel]);
				
				if (standing >= peopleLevel){
					standing += shy;
					if(standing < peopleLevel + 1){
						invite += peopleLevel + 1 - standing;
						standing += (peopleLevel + 1 - standing);
					}
				}
				
			}
	
			answers[test-1] =  "Case #" + test + ": " + invite;
		}
		for (int i = 0; i < N; i++){
			out.println(answers[i]);
		}
		
		
		
	}

}
