package methodEmbedding.Revenge_of_the_Pancakes.S.LYD768;

import java.util.*;

public class revengePancake {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		
		for (int t = 1; t <= T; t++) {
			int count = 0;
			char stack[] = scan.nextLine().toCharArray();
			
			int i = stack.length-1;
			while (i >= 0) {
				while (i >= 0 && stack[i] == '+') {
					i--;
				}
				if (i < 0) {
					break;
				}
				// get the pile that needs to be flipped (in order for now)
				char flip[] = new char[i+1];
				for (int j = 0; j <= i; j++) {
					flip[j] = stack[j];
				}
				// if fronts and ends don't match, tops need to be flipped separately
				int p = i;
				while (flip[0] != flip[p]) {
					p--;
				}
				if (p != i) {
					count++;
					char flip2[] = new char[p+1];
					for (int j = 0; j <= p; j++) {
						flip2[j] = flip[p-j]; // backwards
					}
					for (int j = 0; j <= p; j++) {
						if (flip2[j] == '+') {
							flip2[j] = '-';
						}
						else {
							flip2[j] = '+';
						}
					}
					for (int j = 0; j <= p; j++) {
						flip[j] = flip2[j];
					}
				}
				
				// back to original flip
				for (int j = 0; j <= i; j++) {
					if (flip[j] == '+') {
						flip[j] = '-';
					}
					else {
						flip[j] = '+';
					}
				}
				for (int j = 0; j <= i; j++) {
					stack[j] = flip[flip.length-1-j];
				}
				count++;
			}				
			System.out.println("Case #" + t + ": " + count);
		}
	}
}
