package methodEmbedding.Counting_Sheep.S.LYD1203;

import java.util.Arrays;
import java.util.Scanner;


public class CountingSheep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int runs = Integer.parseInt(sc.nextLine().trim());
		for(int run = 1 ; run <= runs ; run++) {
			System.out.print("Case #" + run + ": ");
			
			long N = Long.parseLong(sc.nextLine().trim());
			boolean[] seen = new boolean[10];
			
			if(N == 0) {
				System.out.println("INSOMNIA");
			} else {
				int count = 0, ind = 0;
				while(count < 10) {
					ind++;
					
					long sum = N * ind;
					while(sum > 0) {
						if(!seen[(int) (sum % 10)]) {
							count++;
							seen[(int) (sum % 10)] = true;
						}
						
						sum /= 10;
					}
					
//					System.out.println(Arrays.toString(seen));
//					System.out.println(N * ind);
				}
				
				System.out.println(N * ind);
			}
		}
		
		sc.close();
	}

}
