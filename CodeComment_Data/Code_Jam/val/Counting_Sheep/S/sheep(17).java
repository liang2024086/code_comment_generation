package methodEmbedding.Counting_Sheep.S.LYD397;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class sheep {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		int loopCount = in.nextInt();
		
		for(int lc = 0; lc < loopCount; lc++){
			long n = in.nextLong();
			boolean[] seen = new boolean[10];
			int numSeen = 0;
			
			String ans = "INSOMNIA";
			int max = 1000;
			for(int i = 1; i <= max; i++){
				String curN = (n * i) + "";
				
				for(int j = 0; j < curN.length(); j++)
					if(!seen[curN.charAt(j) - '0']){
						seen[curN.charAt(j) - '0'] = true;
						numSeen++;
					}
				
				if(numSeen == 10){
					ans = curN + "";
					break;
				}
			}
			
			System.out.printf("Case #%d: %s%n", lc + 1, ans);
		}
	}
}
