package methodEmbedding.Counting_Sheep.S.LYD591;

import java.util.*;

public class sheepA {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		
		for (int i=1; i<=T; i++) {
			long N = s.nextLong();
			if (N==0) {
				System.out.println("Case #"+i+": INSOMNIA");
				continue;
			}
			boolean[] seen = new boolean[10];
			
			long num = N;
			long sum = N;
			//boolean allSeen = false;
			while (true) {
				num = sum;
				while (num!=0) {
					int digit = (int)num%10;
					seen[digit] = true;
					num /= 10;
				}
				boolean allSeen = true;
				for (boolean see: seen) {
					allSeen = see && allSeen;
				}
				if (allSeen) {
					System.out.println("Case #"+i+": "+sum);
					break;
				}
				sum += N;
			}
			
			//System.out.println("Case #"+i+": "+answer);
		}
		
		s.close();
	}

}
