package methodEmbedding.Standing_Ovation.S.LYD1399;

import java.util.Scanner;


public class StandingOvation {
public static void main(String[] args) {
	try(Scanner  sc = new Scanner(System.in)) {
		
		int t = sc.nextInt();
		
		StringBuilder out = new StringBuilder();
		
		for (int c = 1; c<=t; c++) {
			
			
			int smax = sc.nextInt();
			char[] levelchars = sc.next().toCharArray();
			
			int[] levels = new int[levelchars.length];
			for (int i = 0; i < levelchars.length; i++) {
				levels[i] = Integer.parseInt(Character.toString(levelchars[i]));
			}
			
			int needed = 0;
			int clapping = 0;
			
			for(int i = 0; i < levels.length; i++) {
				while (clapping < i) {
					needed++;
					clapping++;
				}
				clapping += levels[i];
			}
			
			out.append("Case #").append(c).append(": ").append(needed).append("\n"); 
		}
		
		System.out.println(out);
	}
	
	
}
}
