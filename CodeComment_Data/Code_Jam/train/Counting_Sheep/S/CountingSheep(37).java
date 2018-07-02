package methodEmbedding.Counting_Sheep.S.LYD1260;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int x=0; x < t; x++) {
			String s = sc.next();
				int n = Integer.parseInt(s);
				boolean[] map = new boolean[10];
				
				if (n == 0) {
					System.out.println("Case #"+(x+1) + ": INSOMNIA");
					continue;
				}
				
				int factor = 1;
				while (true) {
					int m = n * factor;
					if (m < 10) {
						map[m] = true;
					}
					while (m/10 != 0) {
						int rem = m % 10;
						map[rem] = true;
						m = m / 10;
					}
					
					if (m > 0 && m < 10) map[m] = true;
					
					boolean notComplete = false;
					for(int i=0; i < 10; i++) {
						if (!map[i]) {
							notComplete = true; break;
						}
					}
					
					if (!notComplete) {
						System.out.println("Case #"+(x+1) + ": " + factor * n);
						break;
					} else {
						factor++;
					}
				}
		}
	}
	
}

