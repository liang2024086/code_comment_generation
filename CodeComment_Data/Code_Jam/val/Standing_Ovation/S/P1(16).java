package methodEmbedding.Standing_Ovation.S.LYD1042;

import java.util.Scanner;


public class P1 {

	public static void main(String[] args) {
		int test;
		
		Scanner sc = new Scanner(System.in);
		
		test = sc.nextInt();
		
		int max;
		String data;
		for(int i= 1; i <=  test ; i++) {
			max = sc.nextInt();
			data = sc.nextLine().trim();
			int extra = 0;
			int sum = data.charAt(0)  - 48;
			for(int j = 1; j<=max; j++) {
				
				if(sum < j){
					extra += (j - sum);		
					sum += (j - sum);
				}
				
				sum += data.charAt(j)  - 48;
				
			}
			System.out.println("Case #"+i+": " + extra);
		}
		
		
		
	}

}
