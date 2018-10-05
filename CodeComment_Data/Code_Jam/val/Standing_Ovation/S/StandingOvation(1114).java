package methodEmbedding.Standing_Ovation.S.LYD699;

import java.util.Scanner;


public class StandingOvation {
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
		int c = in.nextInt();
		
		for(int i = 0; i <= c; i++){
			int maxS = in.nextInt();
			String s = in.next();
			int toAdd = 0;
			
			int total = 0;
			
			for(int b = 0; b < s.length(); b++){
				if(total < b){
					toAdd++;
					total++;
				}
				
				total = total + Integer.parseInt(Character.toString(s.charAt(b)));
			}
			
			System.out.println("Case #" + (i + 1) + ": " + toAdd);
			
			if(i+1 == c)
				System.exit(0);
		}
	}
}
