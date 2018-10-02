package methodEmbedding.Counting_Sheep.S.LYD881;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSheep {

	
	public static void main(String[] args) {
		int[] N;
		int T;
		int temp1, temp;
		int count;
		int digit;
		
		boolean digits[] = new boolean[10];
		Scanner scanner = new Scanner(System.in);
		
		T = scanner.nextInt();
		
		N = new int[T];
		
		while(T > 0) {
			
			N[N.length - T] = scanner.nextInt();
			T--;
		}
		
		scanner.close();
		
		for(int i=0; i<N.length; i++) {
			
			if(N[i] == 0) {
				
				System.out.println("Case #" + (i+1) + ": " + "INSOMNIA");
			} else {
				
				Arrays.fill(digits, false);
				temp1 = 0;
				count = 0;
				
				while(count<10) {
					
					temp1 += N[i];
					temp = temp1;
					
					do {
						digit = temp % 10;
						
						if(!digits[digit]) {
							
							digits[digit] = true;
							count++;
						}
						
						temp = temp / 10;
					} while(temp > 0);
				}
				
				System.out.println("Case #" + (i+1) + ": " + temp1);
			}
		} 
	}
}
