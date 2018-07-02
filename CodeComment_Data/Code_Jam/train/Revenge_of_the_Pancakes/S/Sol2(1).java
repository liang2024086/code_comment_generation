package methodEmbedding.Revenge_of_the_Pancakes.S.LYD108;

import java.util.Scanner;


public class Sol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i = 1; i <= n; i++) {
			char[] test = scan.nextLine().toCharArray();
			
			int numFlips = 0;
			char cur = test[0];
			
			for(int j = 1; j < test.length; j++) {
				if(test[j] == cur) {
					continue;
				}
				
				cur = test[j];
				numFlips++;
			}
			
			if(cur == '-') {
				numFlips++;
			}
			
			System.out.println("Case #"+i+": "+numFlips);
		}
	}

}
