package methodEmbedding.Counting_Sheep.S.LYD880;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			HashSet<Integer> set = new HashSet<Integer>();
			int n = sc.nextInt();
			int next = n;
			
			
			// output
			if (n == 0) {	
				System.out.printf("Case #%d: INSOMNIA\n", i+1);
				continue;
			}
			
			
			while(set.size() != 10) {
				String num = String.valueOf(next);
				for (int j = 0; j < num.length(); j++) {
					int digit = Integer.parseInt(num.charAt(j) + "");
					if (!set.contains(digit)) {
//						System.out.println("adding digit: " + digit);
						set.add(digit);
					}
				}
				
				next = next + n;
				
			}

			System.out.printf("Case #%d: %d\n", i+1, next-n);

			
		}
		

	}

}
