package methodEmbedding.Counting_Sheep.S.LYD678;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int iterations = input.nextInt();
		long answers[] = new long[iterations];
	
		
		for(int iteration = 0; iteration < iterations; iteration++) {
	
			boolean[] occurance = new boolean[10];
			int found = 0;
			
			int N = input.nextInt();
			
			if(N == 0) {
				answers[iteration] = -1;
			} else {
				long run = 1;
				
				search :
				while(found < 10) {
					long digits = N * run;
					
					while(digits > 0) {
						if(occurance[(int) (digits % 10)] == false) {
							occurance[(int) (digits % 10)] = true;
							found++;
							
							if(found == 10)
								break search;
						}
							
						digits /= 10;
					}
					run++;
					
				}
				
				answers[iteration] = N * run;
			}
		}
		
		for(int iteration = 0; iteration < iterations; iteration++) {
			if(answers[iteration] == -1)
				System.out.println("Case #" + (iteration + 1) + ": " + "INSOMNIA");
			else
				System.out.println("Case #" + (iteration + 1) + ": " + answers[iteration]);
		}
		
	}
	
	

}
