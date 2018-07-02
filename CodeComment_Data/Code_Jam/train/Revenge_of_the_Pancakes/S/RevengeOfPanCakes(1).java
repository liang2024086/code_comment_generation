package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1077;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int x=0; x < t; x++) {
			String s = sc.next();
			
			String fin = "";
			char now;
			char cur = '+';
			int flips = 0;
			for(int i=0; i < s.length(); i++) {
				now = s.charAt(i);
				if (i == 0) {
					cur = now;
				} else {
					if (now != cur) {
						flips++;
						cur = now;
					}
				}
			}
			
			if (cur == '-') {
				flips++;
			}
			
			System.out.println("Case #"+(x+1)+": " + flips);
		}
	}
	
}

