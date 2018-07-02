package methodEmbedding.Standing_Ovation.S.LYD638;

import java.util.Scanner;

public class A {
	
	public static void main(String argv[]) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			int sMax = in.nextInt();
			String str = in.next();
			int addFriends = 0;
			int sum = str.charAt(0) - '0';
			
			for(int j = 1; j < sMax+1; j++) {
				int n = str.charAt(j) - '0';
				if(n > 0 && sum < j) {
					addFriends += (j-sum);
					sum += (j-sum);
				}
				sum += n;
			}
			
			System.out.println("Case #"+(i+1)+": "+addFriends);
		}
		
		in.close();
	}

}
