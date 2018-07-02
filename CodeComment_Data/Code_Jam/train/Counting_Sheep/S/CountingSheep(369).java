package methodEmbedding.Counting_Sheep.S.LYD830;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.corba.se.impl.copyobject.FallbackObjectCopierImpl;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int N, i;
		boolean[] numbers;
		boolean allDigits;
		String r, n;
		
		for (int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			
			if (N != 0) {
				numbers = new boolean[10];
				allDigits = false;
				i = 0;
				r = "";

				while (!allDigits) {
					n = String.valueOf(N * ++i);
					
					for (int a = 0; a < n.length(); a++)
						numbers[n.charAt(a) - 48] = true;
						
					for (int b = 0; b < numbers.length; b++) {
						allDigits = numbers[b];
						
						if (!allDigits)
							break;
					}
								
					r = n;				
				}				
			} else
				r = "INSOMNIA";
			
			System.out.println("Case #" + t + ": " + r);
		}		
	}
}
